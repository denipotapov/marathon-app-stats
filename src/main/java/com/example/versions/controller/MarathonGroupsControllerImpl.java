package com.example.versions.controller;

import com.example.versions.model.Group;
import com.example.versions.service.MarathonGroupsService;
import com.example.versions.service.MarathonGroupsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by U_021G1 on 16.02.2018.
 */

@Controller
public class MarathonGroupsControllerImpl implements MarathonGroupsController {

    private final MarathonGroupsService marathonGroupsService;

    @Autowired
    public MarathonGroupsControllerImpl(MarathonGroupsServiceImpl marathonGroupsService) {
        this.marathonGroupsService = marathonGroupsService;
    }

    //ToDo Rework to asynch UI
    @Override
    @GetMapping(path = "/groups")
    public String findAll(Model model) throws InterruptedException, ExecutionException{

        CompletableFuture<Group> dev = marathonGroupsService.findDevGroup();
        CompletableFuture<Group> integration = marathonGroupsService.findIntegrationGroup();
        CompletableFuture<Group> prelive = marathonGroupsService.findPreliveGroup();

        model.addAttribute("dev", dev.get());
        model.addAttribute("integration", integration.get());
        model.addAttribute("prelive", prelive.get());

        return "env";
    }
}
