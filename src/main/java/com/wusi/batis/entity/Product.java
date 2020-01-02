package com.wusi.batis.entity;


public class Product {

  private long id;
  private String url;
  private String state;
  private String type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Product() {
  }

  public Product(long id, String url, String state, String type) {
    this.id = id;
    this.url = url;
    this.state = state;
    this.type = type;
  }

}
