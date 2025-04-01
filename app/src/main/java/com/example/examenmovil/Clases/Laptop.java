package com.example.examenmovil.Clases;

public class Laptop extends Dispositivo {
    String procesador = "";
    int ram = 0;
    double almacenamientoGB = (double)0.0F;

    public Laptop(double almacenamientoGB, int ram, String procesador, String marca, String modelo, double precioBase, int año_Lanzamiento, int stock) {
        this.almacenamientoGB = almacenamientoGB;
        this.procesador = procesador;
        this.ram = ram;
        this.marca = marca;
        this.modelo = modelo;
        this.precio_Base = precioBase;
        this.año_Lanzamiento = año_Lanzamiento;
        this.stock = stock;
    }

    public double CalcularPrecio() {
        double precioFinal = this.precio_Base - (double)(this.ram * 5) - this.almacenamientoGB * (double)0.5F;
        return precioFinal;
    }
}
