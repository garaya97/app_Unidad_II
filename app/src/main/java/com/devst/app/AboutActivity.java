// AboutActivity.java
package com.devst.app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Animación al entrar
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about);
    }

    @Override
    public void finish() {
        super.finish();
        // Animación al salir (cuando el usuario regresa)
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
