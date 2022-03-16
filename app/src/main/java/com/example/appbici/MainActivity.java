package com.example.appbici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.appbici.controlnfc.Acceso;

public class MainActivity extends AppCompatActivity {

    // Los componentes de la actividad
    private ImageView imageViewPolice;
    private Button nextButton;
    // Datos, clases

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflar
        imageViewPolice = findViewById(R.id.imageViewPoliceDepartment);
        nextButton = findViewById(R.id.btnCargalogin);

        // Procesamiento
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Acceso.class);
                MainActivity.this.startActivity(intent);

            }
        });

    }

    //Methods
}