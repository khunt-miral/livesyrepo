package com.liveasy.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Load {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Long shipperId;

    @NonNull
    private String loadingPoint;

    @NonNull
    private String unloadingPoint;

    @NonNull
    private String productType;

    @NonNull
    private String truckType;

    @NonNull
    private String noOfTrucks;

    @NonNull
    private String weight;

    private String comment;

    public String date;

    public Load() {
    }

    public Load(@NonNull Long shipperId, @NonNull String loadingPoint, @NonNull String unloadingPoint, @NonNull String productType, @NonNull String truckType, @NonNull String noOfTrucks, @NonNull String weight, String comment) {
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.date = getDate();
    }

    public Long getId() {
        return id;
    }


    @NonNull
    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(@NonNull Long shipperId) {
        this.shipperId = shipperId;
    }

    @NonNull
    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(@NonNull String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    @NonNull
    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(@NonNull String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    @NonNull
    public String getProductType() {
        return productType;
    }

    public void setProductType(@NonNull String productType) {
        this.productType = productType;
    }

    @NonNull
    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(@NonNull String truckType) {
        this.truckType = truckType;
    }

    @NonNull
    public String getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(@NonNull String noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    @NonNull
    public String getWeight() {
        return weight;
    }

    public void setWeight(@NonNull String weight) {
        this.weight = weight;
    }

    @NonNull
    public String getComment() {
        return comment;
    }

    public void setComment(@NonNull String comment) {
        this.comment = comment;
    }

    @NonNull
    public String getDate() {
        Date date = new Date();
        SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
        return formDate.format(date);
    }

    @Override
    public String toString() {
        return "Load{" +
                "id=" + id +
                ", shipperId=" + shipperId +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks='" + noOfTrucks + '\'' +
                ", weight='" + weight + '\'' +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
