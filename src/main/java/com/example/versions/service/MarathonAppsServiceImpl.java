package com.example.versions.service;

import com.example.versions.api.MarathonApps;
import com.example.versions.api.MarathonGroups;
import com.example.versions.model.App;
import com.example.versions.model.AppsWrapper;
import com.example.versions.model.Group;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@Transactional
public class MarathonAppsServiceImpl implements MarathonAppsService {

    private final MarathonApps appsDev;
    private final MarathonApps appsInt;
    private final MarathonApps appsPrelive;
    //private final MarathonGroups appsProd;

    @Autowired
    public MarathonAppsServiceImpl(
            @Value("${marathon.hosts.dev}") String devHost,
            @Value("${marathon.hosts.int}") String intHost,
            @Value("${marathon.hosts.prelive}") String preliveHost,
            //@Value("${marathon.hosts.prod}") String prodHost,
            Decoder decoder, Encoder encoder, Contract contract) {

        this.appsDev = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonApps.class, devHost);
        this.appsInt = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonApps.class, intHost);
        this.appsPrelive = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(MarathonApps.class, preliveHost);
    }

    @Override
    public CompletableFuture<AppsWrapper> findDevApps() {
        return CompletableFuture.completedFuture(appsDev.findAll());
    }

    @Override
    public CompletableFuture<AppsWrapper> findIntegrationApps() {
        return CompletableFuture.completedFuture(appsInt.findAll());
    }

    @Override
    public CompletableFuture<AppsWrapper> findPreliveApps() {
        return CompletableFuture.completedFuture(appsPrelive.findAll());
    }
}
