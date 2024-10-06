# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" /> Приложение для курсов обмена валют  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" />

![Демонстрация использования](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

Это приложение для Android, которое позволяет пользователям просматривать курсы обмена различных валют. Приложение использует API [API Layer](https://apilayer.com/) для получения актуальных данных о курсах обмена.

<details>
  <summary><h2>📋 Функциональные возможности</h2></summary>

  - Показывает список доступных валют.
  - Позволяет пользователям выбрать валюту и просмотреть ее курсы обмена.
  - Обработка ошибок для улучшения пользовательского опыта.

</details>

<details>
  <summary><h2>⚙️ Предварительные требования</h2></summary>

  - Android Studio
  - Gradle

</details>

<details>
  <summary><h2>🛠️ Настройка</h2></summary>

  ### 1. Регистрация в API Layer
  Прежде чем использовать приложение, вам необходимо зарегистрироваться на [API Layer](https://apilayer.com/) для получения ключа API.

  ### 2. Добавление ключа API
  После регистрации добавьте свой ключ API в файл `gradle.properties` вашего проекта:
  ```properties
  API_KEY="ваш_ключ_api"
  ```

  ### 3. Зависимости
  Убедитесь, что в вашем файле `build.gradle` есть следующие зависимости:
  ```groovy
  dependencies {
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
      implementation 'com.google.android.material:material:1.4.0'
  }
  ```

  ### 4. Запуск приложения
  1. Откройте проект в Android Studio.
  2. Убедитесь, что ваше устройство Android или эмулятор настроены правильно.
  3. Запустите приложение из Android Studio.

</details>

<details>
  <summary><h2>📂 Структура кода</h2></summary>

  Приложение структурировано следующим образом:
  - `MainActivity`: Главная активность, которая управляет бизнес-логикой и взаимодействиями пользовательского интерфейса.
  - `ApiLayer`: Уровень API, который использует Retrofit для взаимодействия с API API Layer.
  - `MainViewModel`: Класс ViewModel, который управляет состоянием пользовательского интерфейса и выполняет вызовы API.
  - `activity_main.xml`: XML-разметка главной активности.

</details>

<details>
  <summary><h2>📁 Другие проекты на Kotlin</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ru.md)
  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md)

</details>