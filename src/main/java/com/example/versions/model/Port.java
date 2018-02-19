package com.example.versions.model;

/**
 * Created by U_021G1 on 16.02.2018.
 */
public class Port {

    private int port;

    public Port() {}

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Port{" +
                "port=" + port +
                '}';
    }
}
