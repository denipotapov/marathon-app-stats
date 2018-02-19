package com.example.versions.model;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

/**
 * Created by U_021G1 on 16.02.2018.
 */

public class Group {

    @NotNull
    private String id;
    private App[] apps;
    private Group[] groups;

    public Group() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public App[] getApps() {
        return apps;
    }

    public void setApps(App[] apps) {
        this.apps = apps;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", apps=" + Arrays.toString(apps) +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
