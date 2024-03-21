package com.example.practica;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText inputAnchoHabitacion,inputLargoHabitacion,inputAnchoBaldosa,inputLargoBaldosa;
    TextView txtAreaHabitacion,txtNumberoBaldosas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            inputAnchoHabitacion=findViewById(R.id.inputAnchoHabitacion);
        inputLargoHabitacion=findViewById(R.id.inputLargoHabitacion);
        inputAnchoBaldosa=findViewById(R.id.inputAnchoBaldosa);
        inputLargoBaldosa=findViewById(R.id.inputLargoBaldosa);
        txtAreaHabitacion=findViewById(R.id.txtAreaHabitacion);
        txtNumberoBaldosas=findViewById(R.id.txtNumeroBaldosas);


    }
    public void calcular(View view){

        Double anchoHabitacion = Double.parseDouble(inputAnchoHabitacion.getText().toString());
        Double largoHabitacion = Double.parseDouble(inputLargoHabitacion.getText().toString());
        Double anchoBaldosaCentimetros = Double.parseDouble(inputAnchoBaldosa.getText().toString());
        Double largoBaldosaCentimetros = Double.parseDouble(inputLargoBaldosa.getText().toString());

        Double anchoBaldosaMetros=anchoBaldosaCentimetros/100;
        Double largoBaldosaMetros = largoBaldosaCentimetros/100;

        Double areaBaldosa = anchoBaldosaMetros*largoBaldosaMetros;
       Double areaHabitacion = (anchoHabitacion*largoHabitacion);
        Double numeroBaldosas= (areaHabitacion/areaBaldosa);

        String areaHabitacionFinal = areaHabitacion.toString();
        String numeroBaldosasFinal = numeroBaldosas.toString();
        txtAreaHabitacion.setText("El area de la habitación es de "+areaHabitacionFinal+" metros cuadrados");
        txtNumberoBaldosas.setText("Necesitas "+numeroBaldosasFinal+" Baldosas para cubrir la habitación");






    }
}