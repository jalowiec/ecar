package com.kodilla.ecar.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RouteRequest {

    private String fromPlace;
    private String toPlace;
    private String carModel;
    private String fuelLevel;
    private String driveType;


}

