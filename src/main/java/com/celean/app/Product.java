package com.celean.app;

public class Product {
    private long id;
    private String title;
    private int cost;

    public Product(long id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product() {
    }

    @Override
    public String toString(){
        return "id: " + id + "; " + "title: " + title + "; " + "cost: " + cost;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
