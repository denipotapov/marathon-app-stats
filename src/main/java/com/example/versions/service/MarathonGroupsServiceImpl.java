package com.example.versions.service;

import com.example.versions.api.MarathonGroups;
import com.example.versions.model.Group;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

/**
 * Created by U_021G1 on 19.02.2018.
 */

@Service
@Transactional
public class MarathonGroupsServiceImpl implements MarathonGroupsService {

    private final MarathonGroups groupsDev;
    private final MarathonGroups groupsInt;
    private final MarathonGroups groupsPrelive;
    //private final MarathonGroups groupsProd;

    @Autowired
    public MarathonGroupsServiceImpl(
            @Value("${marathon.hosts.dev}") String devHost,
            @Value("${marathon.hosts.int}") String intHost,
            @Value("${marathon.hosts.prelive}") String preliveHost,
            //@Value("${marathon.hosts.prod}") String prodHost,
            Decoder decoder, Encoder encoder, Contract contract) {

        this.groupsDev = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonGroups.class, devHost);
        this.groupsInt = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonGroups.class, intHost);
        this.groupsPrelive = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonGroups.class, preliveHost);
    }

    @Override
    @Async
    public CompletableFuture<Group> findDevGroup(){
        return CompletableFuture.completedFuture(groupsDev.findAll());
    }

    @Override
    @Async
    public CompletableFuture<Group> findIntegrationGroup(){
        return CompletableFuture.completedFuture(groupsInt.findAll());
    }

    @Override
    @Async
    public CompletableFuture<Group> findPreliveGroup(){
        return CompletableFuture.completedFuture(groupsPrelive.findAll());
    }

}
