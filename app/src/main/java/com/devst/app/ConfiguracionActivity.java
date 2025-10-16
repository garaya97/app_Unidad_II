// 3. Evento: Intent explícito → Mostrar detalles de un item
//MainActivity → DetalleActivity (con datos extra) Mostrar detalle de un item Pasar extras (putExtra) y mostrar.-->

package com.devst.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ConfiguracionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        //        Referenciamos
        TextView tvEmail = findViewById(R.id.tvConfigEmail);
        TextView tvPass = findViewById(R.id.tvConfigPass);

//        recuperamos los datos email y clave
        String email = getIntent().getStringExtra("email_usuario");
        String pass = getIntent().getStringExtra("clave_usuario");

//        establecemos los textos con el email y clave
        tvEmail.setText(email);
        tvPass.setText(pass);
    }
}
