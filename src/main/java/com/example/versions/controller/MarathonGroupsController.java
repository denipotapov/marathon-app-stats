package com.example.versions.controller;

import org.springframework.ui.Model;

import java.util.concurrent.ExecutionException;

/**
 * Created by U_021G1 on 19.02.2018.
 */
public interface MarathonGroupsController {

    String findAllGroups(Model model) throws InterruptedException, ExecutionException;

}
