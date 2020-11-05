package com.network;
import com.sun.net.httpserver.*;
import org.springframework.http.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.InetSocketAddress;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(8081), 1);
        HttpContext context = server.createContext("/", new ResHandler());
        server.start();
    }


    private static class ResHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            httpExchange.sendResponseHeaders(200, "metallica".length());
            OutputStream os = httpExchange.getResponseBody();
            os.write("metallica".getBytes());
            os.close();

        }
    }
}