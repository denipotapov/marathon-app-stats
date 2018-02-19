package com.example.versions.service;

import com.example.versions.model.Group;

import java.util.concurrent.CompletableFuture;

/**
 * Created by U_021G1 on 19.02.2018.
 */
public interface MarathonGroupsService {

    CompletableFuture<Group> findDevGroup();

    CompletableFuture<Group> findIntegrationGroup();

    CompletableFuture<Group> findPreliveGroup();

}
