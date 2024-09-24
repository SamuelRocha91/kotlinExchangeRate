# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> Приложение для Курсов Валют <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![Демонстрация использования](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

Это приложение для Android, которое позволяет пользователям просматривать курсы различных валют. Приложение использует API [API Layer](https://apilayer.com/) для получения актуальных данных о курсах валют.

## Функциональные возможности

- Отображает список доступных валют.
- Позволяет пользователям выбирать валюту и просматривать ее курсы.
- Обработка ошибок для улучшения пользовательского опыта.

## Предварительные требования

- Android Studio
- Gradle

## Настройка

### 1. Регистрация в API Layer

Прежде чем использовать приложение, вам необходимо зарегистрироваться на [API Layer](https://apilayer.com/) для получения ключа API.

### 2. Добавление ключа API

После регистрации добавьте свой ключ API в файл `gradle.properties` вашего проекта:

```properties
API_KEY="ваш_ключ_API"
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

## Структура кода

Приложение структурировано следующим образом:

- `MainActivity`: Основная активность, которая обрабатывает бизнес-логику и взаимодействия с UI.
- `ApiLayer`: Уровень API, который использует Retrofit для связи с API Layer.
- `MainViewModel`: Класс ViewModel, который управляет состоянием UI и выполняет вызовы API.
- `activity_main.xml`: XML-макет для главной активности.

## Другие проекты на Kotlin:

- ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ru.md)
- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md)
