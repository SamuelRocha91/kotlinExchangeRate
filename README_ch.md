# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" /> 货币汇率应用程序  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" />

![使用演示](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

这是一个Android应用程序，允许用户查看不同货币的汇率。该应用程序使用[API Layer](https://apilayer.com/)的API获取关于汇率的最新数据。

<details>
  <summary><h2>📋 功能</h2></summary>

  - 显示可用货币的列表。
  - 允许用户选择货币并查看其汇率。
  - 错误处理以改善用户体验。

</details>

<details>
  <summary><h2>⚙️ 前提条件</h2></summary>

  - Android Studio
  - Gradle

</details>

<details>
  <summary><h2>🛠️ 设置</h2></summary>

  ### 1. 在API Layer注册
  在使用应用程序之前，您需要在[API Layer](https://apilayer.com/)注册以获得API密钥。

  ### 2. 添加API密钥
  注册后，将您的API密钥添加到项目的`gradle.properties`文件中：
  ```properties
  API_KEY="您的_api_密钥"
  ```

  ### 3. 依赖项
  确保在您的`build.gradle`文件中有以下依赖项：
  ```groovy
  dependencies {
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
      implementation 'com.google.android.material:material:1.4.0'
  }
  ```

  ### 4. 运行应用程序
  1. 在Android Studio中打开项目。
  2. 确保您的Android设备或模拟器已正确配置。
  3. 从Android Studio运行应用程序。

</details>

<details>
  <summary><h2>📂 代码结构</h2></summary>

  应用程序的结构如下：
  - `MainActivity`: 处理业务逻辑和UI交互的主活动。
  - `ApiLayer`: 使用Retrofit与API Layer的API进行通信的API层。
  - `MainViewModel`: 管理UI状态并进行API调用的ViewModel类。
  - `activity_main.xml`: 主活动的XML布局。

</details>

<details>
  <summary><h2>📁 其他Kotlin项目</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ch.md)
  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md)

</details>

