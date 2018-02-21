package com.example.versions.controller;

import com.example.versions.model.App;
import com.example.versions.service.MarathonAppsServiceImpl;
import com.example.versions.utlis.AppsMapBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * Created by U_021G1 on 21.02.2018.
 */
@Controller
public class MarathonAppsControllerImpl implements MarathonAppsController {

    private final MarathonAppsServiceImpl marathonApps;

    @Autowired
    MarathonAppsControllerImpl(MarathonAppsServiceImpl marathonApps) {
        this.marathonApps = marathonApps;
    }

    @Override
    @GetMapping(path = "/apps/old")
    public String findAllApps(Model model) throws InterruptedException, ExecutionException {

        Set<App> dev = marathonApps.findDevApps().get().getApps();
        Set<App> integration = marathonApps.findIntegrationApps().get().getApps();
        Set<App> prelive = marathonApps.findPreliveApps().get().getApps();

        AppsMapBuilder builder = new AppsMapBuilder()
                .appendMap("dev", dev)
                .appendMap("integration", integration)
                .appendMap("prelive", prelive);

        Map<String, App> allApps = builder.getAllApps();
        Map<String, Map<String, App>> envApps = builder.getEnvApps();

        model.addAttribute("allApps", allApps);
        model.addAttribute("envApps", envApps);

        return "env";
    }
}
