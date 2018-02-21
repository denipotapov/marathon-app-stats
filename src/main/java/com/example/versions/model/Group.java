package com.example.versions.model;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * Created by U_021G1 on 16.02.2018.
 */

public class Group {

    @NotNull
    private String id;
    private List<App> apps;
    private List<Group> groups;

    public Group() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", apps=" + apps +
                ", groups=" + groups +
                '}';
    }
}
