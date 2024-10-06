# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" /> تطبيق أسعار صرف العملات  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Full Projects Logo" width="42" height="30" />

![عرض توضيحي للاستخدام](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

هذا تطبيق Android يتيح للمستخدمين عرض أسعار صرف العملات المختلفة. يستخدم التطبيق API من [API Layer](https://apilayer.com/) للحصول على بيانات محدثة حول أسعار الصرف.

<details>
  <summary><h2>📋 الميزات</h2></summary>

  - يعرض قائمة بالعملات المتاحة.
  - يسمح للمستخدمين باختيار عملة وعرض أسعار صرفها.
  - معالجة الأخطاء لتحسين تجربة المستخدم.

</details>

<details>
  <summary><h2>⚙️ المتطلبات المسبقة</h2></summary>

  - Android Studio
  - Gradle

</details>

<details>
  <summary><h2>🛠️ الإعداد</h2></summary>

  ### 1. التسجيل في API Layer
  قبل استخدام التطبيق، ستحتاج إلى التسجيل في [API Layer](https://apilayer.com/) للحصول على مفتاح API.

  ### 2. إضافة مفتاح API
  بعد التسجيل، أضف مفتاح API الخاص بك إلى ملف `gradle.properties` في مشروعك:
  ```properties
  API_KEY="مفتاح_API_الخاصة_بك"
  ```

  ### 3. التبعيات
  تأكد من وجود التبعيات التالية في ملف `build.gradle` الخاص بك:
  ```groovy
  dependencies {
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
      implementation 'com.google.android.material:material:1.4.0'
  }
  ```

  ### 4. تشغيل التطبيق
  1. افتح المشروع في Android Studio.
  2. تأكد من أن جهاز Android أو المحاكي الخاص بك تم تكوينه بشكل صحيح.
  3. قم بتشغيل التطبيق من Android Studio.

</details>

<details>
  <summary><h2>📂 هيكل الكود</h2></summary>

  هيكل التطبيق كما يلي:
  - `MainActivity`: النشاط الرئيسي الذي يتعامل مع منطق الأعمال وتفاعلات واجهة المستخدم.
  - `ApiLayer`: طبقة API التي تستخدم Retrofit للتواصل مع API من API Layer.
  - `MainViewModel`: فئة ViewModel التي تدير حالة واجهة المستخدم وتجري مكالمات API.
  - `activity_main.xml`: تخطيط XML للنشاط الرئيسي.

</details>

<details>
  <summary><h2>📁 مشاريع Kotlin الأخرى</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ar.md)
  - 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

</details>
