package com.example.examenmovil.Clases;

public class Dispositivo {
    public String marca = "";
    public String modelo = "";
    public double precio_Base = (double)0.0F;
    public int año_Lanzamiento = 0;
    public int stock = 0;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio_Base() {
        return this.precio_Base;
    }

    public void setPrecio_Base(double precio_Base) {
        this.precio_Base = precio_Base;
    }

    public int getAño_Lanzamiento() {
        return this.año_Lanzamiento;
    }

    public void setAño_Lanzamiento(int año_Lanzamiento) {
        this.año_Lanzamiento = año_Lanzamiento;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double CalcularPrecio() {
        return (double)0.0F;
    }

    public Dispositivo() {
    }
}
