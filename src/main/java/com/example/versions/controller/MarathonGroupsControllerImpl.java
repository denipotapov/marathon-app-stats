package com.example.versions.controller;

import com.example.versions.model.Group;
import com.example.versions.service.MarathonGroupsService;
import com.example.versions.service.MarathonGroupsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String findAllGroups(Model model) throws InterruptedException, ExecutionException{

        Group dev = marathonGroupsService.findDevGroup().get();
        Group integration = marathonGroupsService.findIntegrationGroup().get();
        Group prelive = marathonGroupsService.findPreliveGroup().get();

        return "env";
    }
}
