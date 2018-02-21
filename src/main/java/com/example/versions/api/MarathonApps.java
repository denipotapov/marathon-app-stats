package com.example.versions.api;

import com.example.versions.model.App;
import com.example.versions.model.AppsWrapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by U_021G1 on 16.02.2018.
 */
@FeignClient(name = "marathon")
public interface MarathonApps {

    @RequestMapping(method = RequestMethod.GET, value = "/v2/apps", produces = "application/json")
    AppsWrapper findAll();

}
