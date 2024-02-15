package com.lagnada.modernj.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

  public static void main(String[] args) throws Exception{
    HttpResponse<String> response;
    try (HttpClient client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://example.com"))
              .build();

      response = client.send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println(response.statusCode());
      System.out.println(response.body());
    }
  }
}
