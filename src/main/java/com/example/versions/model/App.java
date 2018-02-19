package com.example.versions.model;

import javax.validation.constraints.NotNull;

/**
 * Created by U_021G1 on 16.02.2018.
 */
public class App {

    @NotNull
    private String id;
    private int instances;
    private float cpus;
    private float mem;
    private float disk;
    private Container container;

    public App() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }

    public float getCpus() {
        return cpus;
    }

    public void setCpus(float cpus) {
        this.cpus = cpus;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }

    public float getDisk() {
        return disk;
    }

    public void setDisk(float disk) {
        this.disk = disk;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public String toString() {
        return "App{" +
                "id='" + id + '\'' +
                ", instances=" + instances +
                ", cpus=" + cpus +
                ", mem=" + mem +
                ", disk=" + disk +
                ", container=" + container +
                '}';
    }
}
