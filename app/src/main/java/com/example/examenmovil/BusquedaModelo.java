package com.example.examenmovil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.examenmovil.Clases.Controller;
import com.example.examenmovil.Clases.SingletonController;

public class BusquedaModelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_busqueda_modelo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Controller controller = SingletonController.getinstance();

        Button buscar = findViewById(R.id.BtnBuscar);
        EditText marca = findViewById(R.id.EditMarcaBuscar);
        EditText modelo = findViewById(R.id.EditModeloBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Marca = String.valueOf(marca.getText());
                String Modelo = String.valueOf(modelo.getText());

                AlertDialog.Builder builder = new AlertDialog.Builder(BusquedaModelo.this);
                builder.setTitle("informacion")
                        .setMessage(controller.BuscarMarcaModelo(Modelo,Marca))
                        .setPositiveButton("ok",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}