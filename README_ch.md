# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> 货币兑换率应用程序 <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![使用演示](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

这是一个 Android 应用程序，允许用户查看不同货币的汇率。该应用程序使用 [API Layer](https://apilayer.com/) 的 API 获取有关汇率的最新数据。

## 功能

- 显示可用货币的列表。
- 允许用户选择货币并查看其汇率。
- 错误处理以改善用户体验。

## 先决条件

- Android Studio
- Gradle

## 设置

### 1. 注册 API Layer

在使用应用程序之前，您需要在 [API Layer](https://apilayer.com/) 注册以获取 API 密钥。

### 2. 添加 API 密钥

注册后，将您的 API 密钥添加到项目的 `gradle.properties` 文件中：

```properties
API_KEY="你的_api_key"
```

### 3. 依赖项

确保在您的 `build.gradle` 文件中有以下依赖项：

```groovy
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
    implementation 'com.google.android.material:material:1.4.0'
}
```

### 4. 运行应用程序

1. 在 Android Studio 中打开项目。
2. 确保您的 Android 设备或模拟器正确配置。
3. 从 Android Studio 运行应用程序。

## 代码结构

应用程序结构如下：

- `MainActivity`：主要活动，处理业务逻辑和用户界面交互。
- `ApiLayer`：使用 Retrofit 与 API Layer 进行通信的 API 层。
- `MainViewModel`：管理用户界面状态并执行 API 调用的 ViewModel 类。
- `activity_main.xml`：主活动的 XML 布局。

## 其他 Kotlin 项目：

- ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ch.md)
- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md)
