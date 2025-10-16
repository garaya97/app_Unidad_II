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

                ![Tomar Fotografía con Cámara](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/TomarFotografiaCamara.gif)

            ❎ <!--Seleccionar imagen de galería ACTION_GET_CONTENT con image/* Retorna URI, mostrar en ImageView.-->

                ![Seleccionar Imagen Galería](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/SeleccionarImagenGaleria.gif)


            <!-- ❎ Abrir contactos del teléfono Intent.ACTION_PICK con ContactsContract.Contacts.CONTENT_URI Devuelve nombre o número. -->

                ![Abrir Contacto Emergencia](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/AbrirContactoEmergencia.gif)


            ❎ <!--Enviar SMS (interfaz del sistema) ACTION_SENDTO con smsto: Prellenar texto sin enviar automáticamente.-->

                ![Enviar SMS Emergencia](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/EnviarSMSEmergencia.gif)


            ❎ <!--Llamar (mostrar marcador telefónico) ACTION_DIAL con tel: No requiere permiso CALL_PHONE.-->

                ![Enviar SMS Emergencia](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/EnviarSMSEmergencia.gif)


    ✅Listado de intents explícitos:


            ❎<!--MainActivity → ConfigActivity (ajustes) Simular pantalla de ajustes interna Usa Toolbar con botón “Atrás”.-->

                ![Toolbar Volver Atrás](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/ToolbarVolverAtras.gif)

            ❎<!--Abrir Activity con animación personalizada Agregar transición (overridePendingTransition) Mejora experiencia de usuario-->

                ![Transición Nosotros](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/TransicionNosotros.gif)


            ❎<!--//MainActivity → DetalleActivity (con datos extra) Mostrar detalle de un item Pasar extras (putExtra) y mostrar.-->

                ![Mostrar Datos putExtra](https://raw.githubusercontent.com/garaya97/app_Unidad_II/Principal/app/gifs/MostrarDatosputExtra.gif)
