package com.nimbow.nimbowapiclient.example;

import com.nimbow.nimbowapiclient.ISms;
import com.nimbow.nimbowapiclient.ISmsResponse;
import com.nimbow.nimbowapiclient.NimbowApiHttpClient;
import com.nimbow.nimbowapiclient.TextSms;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by Simon on 08/02/2016.
 */
public class Main {

    public static void main(String[] args) {

        ISms sms = new TextSms("1234567890", "test", "test message");

        NimbowApiHttpClient client = new NimbowApiHttpClient();

        try {
            ISmsResponse response1 = client.SendSms(sms);
            System.out.println(response1.getStatusCode());
            final Future<ISmsResponse> iSmsResponseFuture = client.SendSmsAsync(sms);
            ISmsResponse response = iSmsResponseFuture.get();
            System.out.println(response.getStatusCode());
        } catch (IOException | ExecutionException | InterruptedException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
