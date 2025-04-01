package com.example.examenmovil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.examenmovil.Clases.Controller;
import com.example.examenmovil.Clases.Laptop;
import com.example.examenmovil.Clases.SingletonController;

public class AgregarLaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agregar_laptop);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Controller controller = SingletonController.getinstance();

        EditText Marca = findViewById(R.id.EditMarca);
        EditText Almacenamiento = findViewById(R.id.EditAlmacenamieto);
        EditText Modelo = findViewById(R.id.EditModelo);
        EditText Procesador = findViewById(R.id.EditProcesador);
        EditText PrecioBase = findViewById(R.id.EditPrecioBase);
        EditText Ram = findViewById(R.id.EditRam);
        EditText Salida = findViewById(R.id.EditSalida);
        EditText Stock = findViewById(R.id.EditStock);
        Button botonAgrgar = findViewById(R.id.BtbAgregarLap);


        botonAgrgar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String marca = String.valueOf(Marca.getText());
                double almacenamiento = Double.parseDouble(String.valueOf(Almacenamiento.getText()));
                String modelo = String.valueOf(Modelo.getText());
                String procesador = String.valueOf(Procesador.getText());
                double precioBase = Double.parseDouble(String.valueOf(PrecioBase.getText()));
                int ram = Integer.parseInt(String.valueOf(Ram.getText()));
                int salida = Integer.parseInt(String.valueOf(Salida.getText()));
                int stock = Integer.parseInt(String.valueOf(Stock.getText()));

                Laptop laptop = new Laptop(almacenamiento,ram,procesador,marca,modelo,precioBase,salida,stock);
                controller.dispositivos.add(laptop);
            }
        });
    }

}