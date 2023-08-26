/**
 * Copyright (C) 2021-22, Walmart Stores, Inc. All rights reserved.
 */
package com.springrest.springrest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author s0r06mz
 **/
@JsonInclude(Include.NON_NULL)
public class LoadRequestWrapper {

  private String loadingPoint;
  private String unloadingPoint;
  private String productType;
  private String truckType;
  private int noOfTrucks;
  private double weight;
  private String comment;
  private String shipperId;
  private String date;

  public LoadRequestWrapper(String loadingPoint, String unloadingPoint, String productType,
    String truckType, int noOfTrucks, double weight, String comment, String shipperId,
    String date) {
    this.loadingPoint = loadingPoint;
    this.unloadingPoint = unloadingPoint;
    this.productType = productType;
    this.truckType = truckType;
    this.noOfTrucks = noOfTrucks;
    this.weight = weight;
    this.comment = comment;
    this.shipperId = shipperId;
    this.date = date;
  }

  public String getLoadingPoint() {
    return loadingPoint;
  }

  public void setLoadingPoint(String loadingPoint) {
    this.loadingPoint = loadingPoint;
  }

  public String getUnloadingPoint() {
    return unloadingPoint;
  }

  public void setUnloadingPoint(String unloadingPoint) {
    this.unloadingPoint = unloadingPoint;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getTruckType() {
    return truckType;
  }

  public void setTruckType(String truckType) {
    this.truckType = truckType;
  }

  public int getNoOfTrucks() {
    return noOfTrucks;
  }

  public void setNoOfTrucks(int noOfTrucks) {
    this.noOfTrucks = noOfTrucks;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getShipperId() {
    return shipperId;
  }

  public void setShipperId(String shipperId) {
    this.shipperId = shipperId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}

