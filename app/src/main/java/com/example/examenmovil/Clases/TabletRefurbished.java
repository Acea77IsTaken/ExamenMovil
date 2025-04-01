package com.example.examenmovil.Clases;

public class TabletRefurbished extends Tablet {
    String nivelRecondicionamiento = "";

    public TabletRefurbished(double pulgadasPantalla, boolean soportePen, String marca, String modelo, double precioBase, int año_Lanzamiento, int stock, String nivelRecondicionamiento) {
        super(pulgadasPantalla, soportePen, marca, modelo, precioBase, año_Lanzamiento, stock);
        this.nivelRecondicionamiento = nivelRecondicionamiento;
    }

    public double CalcularPrecio() {
        double precioFinal = this.precio_Base * 0.6 - this.pulgadasPantalla * (double)1.5F - (double)(this.nivelRecondicionamiento == "C" ? 100 : 0);
        return precioFinal;
    }
}
