package com.shobana.load.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Loads {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String comment;
    private String shipperId;
    private String date;

}
