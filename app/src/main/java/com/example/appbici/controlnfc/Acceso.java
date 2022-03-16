package com.example.appbici.controlnfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appbici.R;

public class Acceso extends AppCompatActivity {
    // Componentes
    private EditText editTextUser;
    private EditText editTextPassword;
    private TextView textViewCount;
    private Button btnAcceso;
    private Button btnCancel;

    // Datos
    private int intentos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceso);

        // Init datos
        intentos = 0;
        //Inflar
        editTextUser = findViewById(R.id.editTextUser);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewCount = findViewById(R.id.textViewConteo);
        btnAcceso = findViewById(R.id.buttonAcceso);
        btnCancel = findViewById(R.id.buttonCancel);

        btnAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateCredentials(editTextUser.getText().toString(),editTextPassword.getText().toString())){
                    // Mandar al menu
                    Intent intent = new Intent(Acceso.this,Menu.class);
                    Acceso.this.startActivity(intent);
                }else{
                    // Actualizar conteo
                    intentos ++;
                    textViewCount.setText(String.valueOf(intentos));
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private boolean validateCredentials(String userName, String pass){
        return userName.equals("user") && pass.equals("123");
    }

}
