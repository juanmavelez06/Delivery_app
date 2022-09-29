package com.delivery.Activity.Domain;

public class FoodDomain {
    private String title;
    private String image;
    private String descripcion;
    private double tarifa;
    private int numberIncart;


    public FoodDomain(String title, String image, String descripcion, double tarifa) {
        this.title = title;
        this.image = image;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getNumberIncart() {
        return numberIncart;
    }

    public void setNumberIncart(int numberIncart) {
        this.numberIncart = numberIncart;
    }

    public FoodDomain(String title, String image, String descripcion, double tarifa, int numberIncart){
        this.title = title;
        this.image = image;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.numberIncart = numberIncart;
    }
}
