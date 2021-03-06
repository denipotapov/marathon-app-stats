package com.example.versions.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by U_021G1 on 16.02.2018.
 */
public class Docker {

    private String image;
    private String network;
    private List<Parameter> parameters;

    public Docker() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Docker{" +
                "image='" + image + '\'' +
                ", network='" + network + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
