package com.example.versions.model;

/**
 * Created by U_021G1 on 16.02.2018.
 */
public class Parameter {

    private String key;
    private String value;

    public Parameter() {}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
