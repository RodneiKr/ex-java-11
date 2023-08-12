package main.java.org.kr.exjava11.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Stream;

public class HTTPClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        final var client = HttpClient
                .newBuilder()
                .build();
        final var request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://www.google.com.br"))
                .GET()
                .build();
        final HttpResponse<Stream<String>> response = client
                .send(request, HttpResponse.BodyHandlers.ofLines());

        response.body().forEach(System.out::println);
    }
}
