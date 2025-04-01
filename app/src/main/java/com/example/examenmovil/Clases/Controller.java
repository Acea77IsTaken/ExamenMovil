package com.example.examenmovil.Clases;

import android.os.Build;

import java.io.Serializable;
import java.util.Comparator;
import java.util.ArrayList;
 public class Controller{

    public ArrayList<Dispositivo> dispositivos;

    public Controller() {
        this.dispositivos = new ArrayList();
    }

    public void CrearDispositivos() {
        this.dispositivos.add(new Laptop((double)200.0F, 12, "uno bien pro", "tyzen", "elMejor", (double)1000.0F, 2014, 220));
        this.dispositivos.add(new Tablet((double)10.5F, true, "SamSings", "unoNormal", (double)1000.0F, 2014, 20));
        this.dispositivos.add(new Smartphone((double)12.5F, 3, "WaoWey", "Asombroso", (double)1000.0F, 2014, 250));
    }

    public String PrecioDeTodo() {
        String resultado = "";
        for(Dispositivo dispositivo : this.dispositivos) {
            String var10001 = dispositivo.marca;
            resultado += var10001 + ": " + dispositivo.CalcularPrecio() + "\n";
        }
        return resultado;
    }

    public String BuscarMarcaModelo(String modelo, String marca) {
        String resultado = "";
        for(Dispositivo dispositivo : this.dispositivos) {
            if (dispositivo.marca.equalsIgnoreCase(marca) || dispositivo.modelo.equalsIgnoreCase(modelo)) {
                resultado += "Precio: " + dispositivo.CalcularPrecio() + "\n";
            }
        }
        return resultado;
    }

    public String ListaOrdenada() {
        this.dispositivos.sort(Comparator.comparing(Dispositivo::getStock));
        String resultado = "";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM) {
            for(Dispositivo dispositivo : this.dispositivos.reversed()) {
                resultado += dispositivo.marca + " Stock: " + dispositivo.stock + "\n";
            }
        }
        return resultado;
    }

    public void PromocionLaptops() {
        for(Dispositivo dispositivo : this.dispositivos) {
            if (dispositivo instanceof Laptop laptopPromo) {
                String var10001 = laptopPromo.marca;
                System.out.println("promocion aplicada! Nuevo precio de" + var10001 + ": " + laptopPromo.CalcularPrecio() / (double)2.0F);
            }
        }

    }
}
