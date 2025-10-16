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
                            
![TomarFotografiaCamara](https://github.com/user-attachments/assets/625c8d08-1570-451c-b1e7-8b8fee4e8fa7)

            ❎ <!--Seleccionar imagen de galería ACTION_GET_CONTENT con image/* Retorna URI, mostrar en ImageView.-->
               
![SeleccionarImageGaleria](https://github.com/user-attachments/assets/6282132e-0d14-476c-beb0-7ad2d3bf8db6)

            <!-- ❎ Abrir contactos del teléfono Intent.ACTION_PICK con ContactsContract.Contacts.CONTENT_URI Devuelve nombre o número. -->
![AbrirContactoEmergencia](https://github.com/user-attachments/assets/ce1277c4-b59f-4805-8042-993b62b0d44c)

            ❎ <!--Enviar SMS (interfaz del sistema) ACTION_SENDTO con smsto: Prellenar texto sin enviar automáticamente.-->
                
![EnviarSMSEmergencia](https://github.com/user-attachments/assets/12135b71-1a6a-48cf-bc54-f6f64d9aef41)

            ❎ <!--Llamar (mostrar marcador telefónico) ACTION_DIAL con tel: No requiere permiso CALL_PHONE.-->

![LlamarContactoEmergencia](https://github.com/user-attachments/assets/44e78946-95b1-4373-855e-5798cd64c2e2)


    ✅Listado de intents explícitos:

            ❎<!--MainActivity → ConfigActivity (ajustes) Simular pantalla de ajustes interna Usa Toolbar con botón “Atrás”.-->
![ToolbarVolverAtras](https://github.com/user-attachments/assets/51d48bd1-6aa3-4fca-b85e-4dbac7654e3d)

            ❎<!--Abrir Activity con animación personalizada Agregar transición (overridePendingTransition) Mejora experiencia de usuario-->

![TransicionNosotros](https://github.com/user-attachments/assets/244528fa-687a-49d3-9c4e-1412b423f98a)

            ❎<!--//MainActivity → DetalleActivity (con datos extra) Mostrar detalle de un item Pasar extras (putExtra) y mostrar.-->
            
![MostrarDatosputExtra](https://github.com/user-attachments/assets/c79b2054-cf3a-4ce9-9ede-f449e7f1559b)
