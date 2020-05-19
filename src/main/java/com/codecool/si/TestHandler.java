package com.codecool.si;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestHandler implements HttpHandler {

    public void handle(HttpExchange t) throws IOException {
        //InputStream is = t.getRequestBody();
        //read(is); // .. read the request body
        String response = "<h1>This is the /test route</h1>";
        t.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
