// 1. Evento: Intent explícito → Volver Atrás
//MainActivity → ConfigActivity (ajustes) Simular pantalla de ajustes interna Usa Toolbar con botón “Atrás”.-->

package com.devst.app;


import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.devst.app.R;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        // Configurar la Toolbar como ActionBar
        Toolbar toolbarVolverAtras = findViewById(R.id.toolbarVolverAtras);
        setSupportActionBar(toolbarVolverAtras);

        // Habilitar botón "Atrás" en la Toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Configuración");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    // Acción al presionar el botón "Atrás" en la Toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Cierra la actividad y vuelve atrás
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
