# app_Unidad_II

Programacion Android Gustavo Araya - Yudisney Dominguez

📱📱📱📱 Programación Android Trabajo Prototipo 2 app_Unidad 15% 📱📱📱📱

✅ Resumen de proyecto: App funciona en dispositivos desde Android 12🤖 en adelante, está construida y optimizada para una versión  
futura de Android (API 36).

✅ Requisitos: requiere un dispositivo con Android 12 🤖(API Level 31) o superior para poder instalarse y ejecutarse.
▶ minimo Sdk = 31
▶ Android 12 🤖 en adelante.

✅ Estructura del Proyecto

```text
/app_Unidad_II
├── 📁 app
│   ├── 📁 manifests
│   │   └── 📜 AndroidManifest.xml
│   ├── 📁 java
│   │   └── 📁 com.devst.app
│   │       ├── 📜 AboutActivity.java
│   │       ├── 📜 CamaraActivity.java
│   │       ├── 📜 CamaraFrontActivity.java
│   │       ├── 📜 ConfigActivity.java
│   │       ├── 📜 ConfiguracionActivity.java
│   │       ├── 📜 HomeActivity.java
│   │       ├── 📜 LoginActivity.java
│   │       └── 📜 PerfilActivity.java
│   │       └── 📁 com.devst.app (androidTest)
│   │       └── 📁 com.devst.app (test)
│   │       └── 📁 java (generated)
│   └── 📁 res
│       ├── 📁 anim
│       │   ├── 📜 slide_in_left.xml
│       │   ├── 📜 slide_in_right.xml
│       │   ├── 📜 slide_out_left.xml
│       │   ├── 📜 slide_out_right.xml
│       ├── 📁 drawable
│       ├── 📁 layout
│       │   ├── 📜 activity_about.xml
│       │   ├── 📜 activity_camara.xml
│       │   ├── 📜 activity_config.xml
│       │   ├── 📜 activity_configuracion.xml
│       │   ├── 📜 activity_home.xml
│       │   ├── 📜 activity_login.xml
│       │   └── 📜 activity_perfil.xml
│       ├── 📁 menu
│       ├── 📁 mipmap
│       ├── 📁 values
│       └── 📁 xml
│           ├── 📜 backup_rules.xml
│           ├── 📜 data_estraction_rules.xml
│           └── 📜 ruta_archivo.xml
│       └── 📁 res (generated)
├── 📜 README.md
└── 📁 gifs
```

✅ Listado de Intents (5 implícitos 📱↗ + 3 explícitos 📱↙)

    ✅ Listado de intents implícitos:


            ❎ <!--Tomar fotografía con cámara MediaStore.ACTION_IMAGE_CAPTURE Usa Activity y almacena la fotografia que quede en la galeria.-->
             
                ![TomarFotografiaCamara](https://github.com/user-attachments/assets/c02c1e1a-3f52-4f1a-991e-4f0d2f279670)
![TomarFotografiaCamara](https://github.com/user-attachments/assets/625c8d08-1570-451c-b1e7-8b8fee4e8fa7)

            ❎ <!--Seleccionar imagen de galería ACTION_GET_CONTENT con image/* Retorna URI, mostrar en ImageView.-->
               
                 ![SeleccionarImageGaleria](https://github.com/user-attachments/assets/ac2fd140-d014-48cf-9d13-93347951c68d)

            <!-- ❎ Abrir contactos del teléfono Intent.ACTION_PICK con ContactsContract.Contacts.CONTENT_URI Devuelve nombre o número. -->

                ![AbrirContactoEmergencia](https://github.com/user-attachments/assets/19e5d97d-61d7-4e25-beb5-ba6c9d2ca4ac)

            ❎ <!--Enviar SMS (interfaz del sistema) ACTION_SENDTO con smsto: Prellenar texto sin enviar automáticamente.-->
                
                ![EnviarSMSEmergencia](https://github.com/user-attachments/assets/6736ff39-efa2-4e0f-b45d-6f4fe5ec07f4)

            ❎ <!--Llamar (mostrar marcador telefónico) ACTION_DIAL con tel: No requiere permiso CALL_PHONE.-->

               ![LlamarContactoEmergencia](https://github.com/user-attachments/assets/8d6bab9a-920e-43d5-8625-c4f7aa5362c6)


    ✅Listado de intents explícitos:


            ❎<!--MainActivity → ConfigActivity (ajustes) Simular pantalla de ajustes interna Usa Toolbar con botón “Atrás”.-->

                ![ToolbarVolverAtras](https://github.com/user-attachments/assets/adb456b8-1882-48dd-86d5-771bf56ba2cb)

            ❎<!--Abrir Activity con animación personalizada Agregar transición (overridePendingTransition) Mejora experiencia de usuario-->

                ![TransicionNosotros](https://github.com/user-attachments/assets/64b8da78-1a3f-466b-a2c5-2ad974699334)


            ❎<!--//MainActivity → DetalleActivity (con datos extra) Mostrar detalle de un item Pasar extras (putExtra) y mostrar.-->

                ![MostrarDatosputExtra](https://github.com/user-attachments/assets/97b6eba2-ce97-4c07-8d4d-5bcca914934e)

