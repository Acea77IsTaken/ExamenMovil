package com.example.examenmovil.Clases;

public class Smartphone extends Dispositivo {
    public double almacenamientoGB = (double) 0.0F;
    public int CantidadCamaras = 0;

    public Smartphone(double almacenamientoGB, int cantidadCamaras, String marca, String modelo, double precioBase, int año_Lanzamiento, int stock) {
        this.almacenamientoGB = almacenamientoGB;
        this.CantidadCamaras = cantidadCamaras;
        this.marca = marca;
        this.modelo = modelo;
        this.precio_Base = precioBase;
        this.año_Lanzamiento = año_Lanzamiento;
        this.stock = stock;
    }

    public double CalcularPrecio() {
        double precioFinal = this.precio_Base - this.almacenamientoGB * (double) 2.0F - (double) (this.CantidadCamaras * 10);
        return precioFinal;
    }
}
