package com.example.versions.service;

import com.example.versions.model.App;
import com.example.versions.model.AppsWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface MarathonAppsService {

    CompletableFuture<AppsWrapper> findDevApps();

    CompletableFuture<AppsWrapper> findIntegrationApps();

    CompletableFuture<AppsWrapper> findPreliveApps();
}
