package com.dockerforjavadevelopers.hello;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        // Read the GITHUB_RUN_NUMBER environment variable
        String githubRunNumber = args.length > 0 ? args[0] : "unknown";

        // Create a new HTTP server
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define a handler for the root path
        server.createContext("/", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "Hello World! GitHub run number: " + githubRunNumber;

                // Send the response headers
                exchange.getResponseHeaders().set("Content-Type", "text/plain");
                exchange.sendResponseHeaders(200, response.getBytes().length);

                // Send the response body
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // Start the server
        server.start();
    }
}
