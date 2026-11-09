# Tutorial de Creación del Front-End Móvil - Guali Tutor Android

**Universidad Mariano Gálvez de Guatemala**  
**Facultad de Ingeniería en Sistemas**  
**Curso:** Programación 2  
**Cátedra:** Ing. MGSI. César Hernández  
**Estudiante:** Carlos Antonio Argueta  
**Carné:** 3190-23-18218  
**Proyecto:** Guali Tutor (Fase 3 - Interfaz Móvil)

---

##  1. Prerrequisitos y Software Necesario

Para la replicación y ejecución de este proyecto se requiere el siguiente entorno de desarrollo:

1. **Java Development Kit (JDK 17 o superior):** Necesario para compilar el entorno Android.
2. **Android Studio (Versión Estable):** Entorno de Desarrollo Integrado (IDE) oficial para Android.
3. **Dispositivo Físico Android o Emulador AVD:** Con Android 7.0 (API 24) o superior.
4. **Git:** Sistema de control de versiones.

---

##  2. Proceso de Instalación y Configuración del Entorno

### Paso 2.1: Instalación de Android Studio
1. Descargar el instalador oficial desde [developer.android.com/studio](https://developer.android.com/studio).
2. Ejecutar el asistente de instalación `.exe` manteniendo las opciones recomendadas por defecto.
3. Al iniciar Android Studio por primera vez, completar el asistente *Standard Setup* para la descarga automática del Android SDK.

### Paso 2.2: Creación del Proyecto Móvil
1. Abrir Android Studio y seleccionar **New Project**.
2. Elegir la plantilla **Phone and Tablet** -> **Empty Views Activity**.
3. Configurar los siguientes datos principales:
   * **Name:** `GualiTutorAndroid`
   * **Package name:** `com.guali.tutor`
   * **Language:** `Kotlin`
   * **Minimum SDK:** `API 24: Android 7.0`


---

##  3. Construcción de la Interfaz Principal (Front-End)

El desarrollo del Front-End móvil se dividió en la configuración del archivo manifiesto, el maquetado visual en XML y la integración lógica en Kotlin.

