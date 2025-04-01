package com.example.examenmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.examenmovil.Clases.Controller;
import com.example.examenmovil.Clases.Dispositivo;
import com.example.examenmovil.Clases.SingletonController;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button AgregarLaptop = findViewById(R.id.BtnLaptop);
        Button mostrarInfo = findViewById(R.id.MostrarInfo);
        Button buscarmain = findViewById(R.id.BtnBuscarMain);
        Button mostrarstock = findViewById(R.id.BtnMostrarStock);

        List<Dispositivo> Dispositivos = new ArrayList<>();
        Controller controller = SingletonController.getinstance();
        controller.CrearDispositivos();


        AgregarLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.examenmovil.AgregarLaptop.class);
                startActivity(intent);

            }
        });
        mostrarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("informacion")
                        .setMessage(controller.PrecioDeTodo())
                        .setPositiveButton("ok",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        buscarmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BusquedaModelo.class);
                startActivity(intent);
            }
        });
        mostrarstock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("informacion")
                        .setMessage(controller.ListaOrdenada())
                        .setPositiveButton("ok",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }


}