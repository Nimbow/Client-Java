# Nimbow Java/Android Client

This is the official Java/Android Client for the Nimbow API (<http://www.nimbow.com>).

You find the complete API documentation here: <https://www.nimbow.com/sms-api/nimbow-api/>

## Usage

1. Get a free Nimbow account
	1. Register: https://portal.nimbow.com/registration
	2. Grab your API Key: https://portal.nimbow.com/apisettings

2. Reference the client from your project ('client' project)

3. Adjust the configuration (config.properties)
	Add config.properties to the same class path as your application.
	NimbowApiUrl=https://api.nimbow.com
	NimbowApiKey=Your Api Key

4. Start sending SMS
	```Java
	ISms sms = new TextSms("1234567890", "test", "test message");
	NimbowApiHttpClient client = new NimbowApiHttpClient();
	
	try {
			// Sync
            ISmsResponse response1 = client.SendSms(sms);
            System.out.println(response1.getStatusCode());

            // Async
            final Future<ISmsResponse> iSmsResponseFuture = client.SendSmsAsync(sms);
            ISmsResponse response = iSmsResponseFuture.get();
            System.out.println(response.getStatusCode());
        } catch (IOException | ExecutionException | InterruptedException | NoSuchFieldException e) {
            e.printStackTrace();
        }
	```
## Configuration / config.properties
* `NimbowApiUrl`: string, required, the URL pointing to the Nimbow API endpoint
* `NimbowApiKey`: string, required, the API Key to use when communicating with the Nimbow API

## Dependencies
google-http-client and google-http-client-jackson2
Can be added via Maven or downloaded <https://developers.google.com/api-client-library/java/google-http-java-client/setup>
```XML
<dependencies>
	<dependency>
	  <groupId>com.google.http-client</groupId>
	  <artifactId>google-http-client</artifactId>
	</dependency>
	<dependency>
	  <groupId>com.google.http-client</groupId>
	  <artifactId>google-http-client-jackson2</artifactId>
	</dependency>
</dependencies>
```
## Samples

Comming soon

#### Prerequisites


You don't have an API Key, yet?

* **No problem**, get a Nimbow account for **free**: <https://portal.nimbow.com/registration>
* After registration copy your API key from here: <https://portal.nimbow.com/apisettings>


#### Try it
1. Start the project
2. Enter sender, reciever and text message
3. Click 'Send'
