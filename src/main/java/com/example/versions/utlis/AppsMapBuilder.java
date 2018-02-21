package com.example.versions.utlis;

import com.example.versions.model.App;

import java.util.*;

public class AppsMapBuilder {

    private Map<String, App> allApps;
    private Map<String, Map<String, App>> envApps;

    public AppsMapBuilder(){
        this.allApps = new TreeMap<>();
        this.envApps = new TreeMap<>();
    }

    /**
     *
     * @return self to call subsequently
     */
    public AppsMapBuilder appendMap(String env, Set<App> apps) {
        Map<String, App> envAppsMap = new TreeMap<>();
        apps.forEach( x -> {
            allApps.put(x.getId(), x);
            envAppsMap.put(x.getId(), x);} );
        envApps.put(env, envAppsMap);
        return this;
    };

    public Map<String, App> getAllApps() {
        return allApps;
    }

    public Map<String, Map<String, App>> getEnvApps() {
        return envApps;
    }
}
