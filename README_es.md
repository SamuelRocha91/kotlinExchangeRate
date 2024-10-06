# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" /> Aplicación de Tasas de Cambio de Moneda  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" />

![Demostración de uso](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

Esta es una aplicación de Android que permite a los usuarios visualizar las tasas de cambio de diferentes monedas. La aplicación utiliza la API de [API Layer](https://apilayer.com/) para obtener datos actualizados sobre las tasas de cambio.

<details>
  <summary><h2>📋 Funcionalidades</h2></summary>

  - Muestra una lista de monedas disponibles.
  - Permite a los usuarios seleccionar una moneda y ver sus tasas de cambio.
  - Manejo de errores para mejorar la experiencia del usuario.

</details>

<details>
  <summary><h2>⚙️ Requisitos previos</h2></summary>

  - Android Studio
  - Gradle

</details>

<details>
  <summary><h2>🛠️ Configuración</h2></summary>

  ### 1. Registro en API Layer
  Antes de usar la aplicación, necesitarás registrarte en [API Layer](https://apilayer.com/) para obtener una clave de API.

  ### 2. Agregar la clave de API
  Después de registrarte, agrega tu clave de API al archivo `gradle.properties` de tu proyecto:
  ```properties
  API_KEY="tu_clave_de_api"
  ```

  ### 3. Dependencias
  Asegúrate de tener las siguientes dependencias en tu archivo `build.gradle`:
  ```groovy
  dependencies {
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
      implementation 'com.google.android.material:material:1.4.0'
  }
  ```

  ### 4. Ejecución de la aplicación
  1. Abre el proyecto en Android Studio.
  2. Asegúrate de que tu dispositivo Android o emulador esté configurado correctamente.
  3. Ejecuta la aplicación desde Android Studio.

</details>

<details>
  <summary><h2>📂 Estructura del Código</h2></summary>

  La aplicación está estructurada de la siguiente manera:
  - `MainActivity`: La actividad principal que maneja la lógica de negocios y las interacciones de la UI.
  - `ApiLayer`: La capa de API que utiliza Retrofit para comunicarse con la API de API Layer.
  - `MainViewModel`: La clase ViewModel que gestiona el estado de la UI y realiza las llamadas a la API.
  - `activity_main.xml`: El diseño XML de la actividad principal.

</details>

<details>
  <summary><h2>📁 Otros proyectos de Kotlin</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_es.md)
  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md)

</details>
