//PerfilActivity.java
package com.devst.app;



import static com.devst.app.R.id.*;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//importamos el toolbar
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class PerfilActivity extends AppCompatActivity {

    private TextView tvBienvenidaPerfil;
    private Button btnSeleccionarImagen, btnCambiarFoto, btnAbrirContacto, btnEnviarSMS, btnLlamarContacto;
    private ImageView ivFotoPerfil;

    // Lanzadores para recibir resultados separados
    private ActivityResultLauncher<Intent> seleccionarImagenLauncher;
    private ActivityResultLauncher<Intent> seleccionarContactoLauncher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfil);

        // Referencias
        tvBienvenidaPerfil = findViewById(R.id.tvBienvenidaPerfil);
        btnSeleccionarImagen = findViewById(R.id.btnSeleccionarImagen);
        btnAbrirContacto = findViewById(R.id.btnAbrirContacto);
        btnEnviarSMS = findViewById(R.id.btnEnviarSMS);
        btnLlamarContacto = findViewById(R.id.btnLlamarContacto);
        btnCambiarFoto = findViewById(R.id.btnCambiarFoto);
        ivFotoPerfil = findViewById(R.id.ivFotoPerfil);
        // Configurar la Toolbar como ActionBar
        Toolbar toolbarVolverAtras = findViewById(R.id.toolbarVolverAtras);
        setSupportActionBar(toolbarVolverAtras);





        // 1. Evento: Intent implícito → tomar foto perfil
        btnCambiarFoto.setOnClickListener(v ->
                startActivity(new Intent(this, CamaraFrontActivity.class))
        );

        // 2. Evento: Intent implícito → Seleccionar Imagen perfil de galería
        // 2. Lanzador para seleccionar imagen
        seleccionarImagenLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                        Uri mediaUri = result.getData().getData();
                        if (mediaUri != null) {
                            try {
                                InputStream inputStream = getContentResolver().openInputStream(mediaUri);
                                Bitmap bm = BitmapFactory.decodeStream(inputStream);
                                ivFotoPerfil.setImageBitmap(bm);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                                Toast.makeText(this, "Error al cargar la imagen", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
        );
        btnSeleccionarImagen.setOnClickListener(v -> {
            Toast.makeText(this, "Click en Seleccionar Imagen", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            seleccionarImagenLauncher.launch(intent);
        });


        // 3. Evento: Intent implícito → Ver Contacto de Emergencia
        // 3. Lanzador para seleccionar contacto
        seleccionarContactoLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                        Uri contactUri = result.getData().getData();
                        if (contactUri != null) {
                            Toast.makeText(this, "Contacto seleccionado: " + contactUri.toString(), Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        btnAbrirContacto.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            seleccionarContactoLauncher.launch(intent);
        });


        // 4. Evento: Intent implícito → Enviar SMS Contacto de Emergencia
        //Enviar SMS (interfaz del sistema) ACTION_SENDTO con smsto: Prellenar texto sin enviar automáticamente.
        btnEnviarSMS.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:+569111111111"));
            intent.putExtra("sms_body", "Esto es un SMS de prueba");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "No hay apps para enviar SMS", Toast.LENGTH_SHORT).show();
            }
        });


        // 5. Evento: Intent implícito → Llamar a Contacto de Emergencia
        //Llamar (mostrar marcador telefónico) ACTION_DIAL con tel: No requiere permiso CALL_PHONE.    }
        btnLlamarContacto.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + "911111111"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "No hay apps para Llamar", Toast.LENGTH_SHORT).show();
            }
        });



    }

    // 1. Evento: Intent explícito → Volver Atrás
    //MainActivity → ConfigActivity (ajustes) Simular pantalla de ajustes interna Usa Toolbar con botón “Atrás”.-->
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();  // Cierra esta actividad y vuelve a la anterior
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
