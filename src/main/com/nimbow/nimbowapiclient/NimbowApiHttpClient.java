package com.nimbow.nimbowapiclient;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * Created by Nimbow on 08/12/2015.
 */
public final class NimbowApiHttpClient {

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private final ExecutorService pool = Executors.newFixedThreadPool(10);

    private HttpRequestFactory getRequestFactory() {

        return HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) {

                request.setParser(new JsonObjectParser(JSON_FACTORY));

            }
        });

    }

    public Future<ISmsResponse> SendSmsAsync(final ISms sms) throws IOException, NoSuchFieldException, ExecutionException, InterruptedException {

        return pool.submit(new Callable<ISmsResponse>() {
            @Override
            public ISmsResponse call() throws Exception {

                HttpRequest httpRequest = getSmsRequest(sms);
                final Future<HttpResponse> task = httpRequest.executeAsync();
                HttpResponse result = task.get();
                return result.parseAs(SmsResponse.class);

            }
        });

    }

    public ISmsResponse SendSms(ISms sms) throws IOException, NoSuchFieldException {

        HttpRequest httpRequest = getSmsRequest(sms);
        final HttpResponse result = httpRequest.execute();
        return result.parseAs(SmsResponse.class);

    }

    private HttpRequest getSmsRequest(ISms sms) throws IOException, NoSuchFieldException {

        ApiConfig config = new ApiConfig();
        HttpRequestFactory requestFactory = getRequestFactory();
        NimbowUrl url = new NimbowUrl(config.getProperty("NimbowApiUrl") + "/sms.json");
        IRequest smsRequest = sms.toRequest();
        url.putAll(smsRequest.getParameters());
        requestFactory.buildGetRequest(url);
        HttpRequest httpRequest = requestFactory.buildGetRequest(url);
        HttpHeaders headers = new HttpHeaders();
        headers.put("X-Nimbow-API-Key", config.getProperty("NimbowApiKey"));
        httpRequest.setHeaders(headers);
        return httpRequest;

    }

    /**
     * URL for Nimbow API.
     */
    public static class NimbowUrl extends GenericUrl {

        public NimbowUrl(String encodedUrl) {

            super(encodedUrl);
        }

    }

}
