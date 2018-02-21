package com.example.versions.controller;

import org.springframework.ui.Model;

import java.util.concurrent.ExecutionException;

public interface MarathonAppsController {

    String findAllApps(Model model) throws InterruptedException, ExecutionException;

}
