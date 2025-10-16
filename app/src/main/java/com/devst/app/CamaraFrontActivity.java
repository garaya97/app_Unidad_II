//CamaraFrontActivity.java
package com.devst.app;


import static com.devst.app.R.id;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class CamaraFrontActivity extends AppCompatActivity {

    private ImageView ivFotoPerfil;  // Cambiar de Button a ImageView
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);  // Asegúrate de tener otro layout si es necesario

        ivFotoPerfil = findViewById(id.ivFotoPerfil);  // Este debe estar en tu XML
        button = findViewById(R.id.btnCambiarFoto);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrir_camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(abrir_camara, 100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            ivFotoPerfil.setImageBitmap(photo);  // Mostrar la imagen en el ImageView
        }
    }
}
