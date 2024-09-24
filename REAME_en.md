# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> Currency Exchange Rates App <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![Usage Demo](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

This is an Android application that allows users to view exchange rates for different currencies. The app uses the [API Layer](https://apilayer.com/) to obtain up-to-date data on exchange rates.

## Features

- Displays a list of available currencies.
- Allows users to select a currency and view its exchange rates.
- Error handling to enhance the user experience.

## Prerequisites

- Android Studio
- Gradle

## Setup

### 1. Register with API Layer

Before using the app, you need to sign up for [API Layer](https://apilayer.com/) to obtain an API key.

### 2. Add the API Key

After registering, add your API key to the `gradle.properties` file in your project:

```properties
API_KEY="your_api_key"
```

### 3. Dependencies

Ensure you have the following dependencies in your `build.gradle` file:

```groovy
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
    implementation 'com.google.android.material:material:1.4.0'
}
```

### 4. Running the App

1. Open the project in Android Studio.
2. Ensure your Android device or emulator is set up correctly.
3. Run the app from Android Studio.

## Code Structure

The app is structured as follows:

- `MainActivity`: The main activity that handles business logic and UI interactions.
- `ApiLayer`: The API layer that uses Retrofit to communicate with the API Layer.
- `MainViewModel`: The ViewModel class that manages the UI state and makes API calls.
- `activity_main.xml`: The XML layout for the main activity.

## Other Kotlin Projects:

- ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_en.md)
- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md)
