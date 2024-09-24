# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> Currency Exchange Rates App <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

![Demonstração de uso](./assets/currencyConverter.gif)

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

Este é um aplicativo Android que permite aos usuários visualizar as taxas de câmbio de diferentes moedas. O aplicativo utiliza a API da [API Layer](https://apilayer.com/) para obter dados atualizados sobre as taxas de câmbio.

## Funcionalidades

- Exibe uma lista de moedas disponíveis.
- Permite que os usuários selecionem uma moeda e visualizem suas taxas de câmbio.
- Tratamento de erros para melhorar a experiência do usuário.

## Pré-requisitos

- Android Studio
- Gradle

## Configuração

### 1. Cadastro na API Layer

Antes de usar o aplicativo, você precisará se cadastrar em [API Layer](https://apilayer.com/) para obter uma chave de API.

### 2. Adicionar a chave da API

Depois de se cadastrar, adicione sua chave de API ao arquivo `gradle.properties` do seu projeto:

```properties
API_KEY="sua_chave_de_api"
```

### 3. Dependências

Certifique-se de ter as seguintes dependências no seu arquivo `build.gradle`:

```groovy
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
    implementation 'com.google.android.material:material:1.4.0'
}
```

### 4. Execução do aplicativo

1. Abra o projeto no Android Studio.
2. Certifique-se de que seu dispositivo Android ou emulador esteja configurado corretamente.
3. Execute o aplicativo a partir do Android Studio.

## Estrutura do Código

O aplicativo é estruturado da seguinte forma:

- `MainActivity`: A atividade principal que lida com a lógica de negócios e interações da UI.
- `ApiLayer`: A camada de API que utiliza Retrofit para se comunicar com a API da API Layer.
- `MainViewModel`: A classe ViewModel que gerencia o estado da UI e faz as chamadas de API.
- `activity_main.xml`: O layout XML da atividade principal.

## Outros projetos Kotlin:

- ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial)
- 📜 [Virtual Menu](https://github.com/SamuelRocha91/kotlinVirtualMenu)
