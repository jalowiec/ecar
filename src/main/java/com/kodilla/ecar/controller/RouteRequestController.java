package com.kodilla.ecar.controller;

import com.kodilla.ecar.domain.Distance;
import com.kodilla.ecar.domain.RouteRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class RouteRequestController {



    @PostMapping(value = "/routeRequest", consumes = "application/json", produces = "application/json")
    public void routeRequest(@RequestBody RouteRequest routeRequest) {
        System.out.println(routeRequest.toString());

    }





}
