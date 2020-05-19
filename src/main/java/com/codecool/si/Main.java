package com.codecool.si;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) {

        HttpServer server = null;
        try {
            server = HttpServer.create(new InetSocketAddress(8000), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert server != null;
        server.createContext("/test", new TestHandler());
        server.createContext("/", new IndexHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
