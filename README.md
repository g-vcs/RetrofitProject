# 🌐 RetrofitProject - REST API Client with Kotlin + Jetpack Compose

This is a simple Android application that demonstrates how to consume a REST API using **Retrofit**, **ViewModel**, and **Jetpack Compose**, following clean architecture principles.

The app fetches data from the [REST Countries API](https://restcountries.com/) and displays it in a list format, using a reactive UI with state management via `ViewModel` and `State`.

This project is a practical companion to my Medium article:

📖 Android REST API Client with Retrofit & Jetpack Compose

---

## 🔧 Tech Stack

- **Kotlin**
- **Retrofit** for HTTP requests
- **Gson** for JSON parsing
- **Jetpack Compose** for UI
- **ViewModel** + `viewModelScope` + coroutines
- Manual dependency injection (AppContainer + Application class)

---

## 🚀 Features

- Fetches country data from a public REST API
- Displays list of countries with key information
- Uses clean architecture with separation of concerns
- Handles loading and error states
- Easy to extend and maintain

---
