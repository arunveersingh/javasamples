package com.oopsfeedmecode.sample3;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPClientAPISample {

    void priorToJava11() throws IOException {
        URL url =
                new URL("http://site.com");

        HttpURLConnection con =
                (HttpURLConnection) url
                        .openConnection();

        con.setRequestMethod("GET");

        InputStream responseStream =
                con.getInputStream();

        // Read responseStream
    }

    void withJava11() throws IOException, InterruptedException {


        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(URI.create("http://site.com"))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());




    }

    void withJava11Async() throws IOException, InterruptedException {


        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(URI.create("http://site.com"))
                .GET()
                .build();

        client.sendAsync(request,
                        HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();


    }
}




