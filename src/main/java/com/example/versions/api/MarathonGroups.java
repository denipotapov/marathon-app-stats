package com.example.versions.api;

import com.example.versions.model.Group;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by U_021G1 on 16.02.2018.
 */

@FeignClient(name = "marathon")
public interface MarathonGroups {

    @RequestMapping(method = RequestMethod.GET, value = "/v2/groups", produces = "application/json")
    Group findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/v2/groups/{group_id}", produces = "application/json")
    Group findById(@PathVariable("group_id") long groupId);
}
