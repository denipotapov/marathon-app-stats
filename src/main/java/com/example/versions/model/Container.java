package com.example.versions.model;

/**
 * Created by U_021G1 on 16.02.2018.
 */
public class Container {

    private String type;
    private Docker docker;

    public Container() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Docker getDocker() {
        return docker;
    }

    public void setDocker(Docker docker) {
        this.docker = docker;
    }

    @Override
    public String toString() {
        return "Container{" +
                "type='" + type + '\'' +
                ", docker=" + docker +
                '}';
    }
}
