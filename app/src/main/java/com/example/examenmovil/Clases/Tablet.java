package com.example.examenmovil.Clases;

public class Tablet extends Dispositivo {
    public double pulgadasPantalla = (double)0.0F;
    public boolean soportePen = false;

    public Tablet(double pulgadasPantalla, boolean soportePen, String marca, String modelo, double precioBase, int año_Lanzamiento, int stock) {
        this.pulgadasPantalla = pulgadasPantalla;
        this.soportePen = soportePen;
        this.marca = marca;
        this.modelo = modelo;
        this.precio_Base = precioBase;
        this.año_Lanzamiento = año_Lanzamiento;
        this.stock = stock;
    }

    public double CalcularPrecio() {
        double precioFinal = this.precio_Base * 0.85 - this.pulgadasPantalla * (double)1.5F;
        return precioFinal;
    }
}
