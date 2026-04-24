package com.example.weatherapp

data class WeatherResponse(
    val name: String,
    val main: MainData,
    val weather: List<WeatherInfo>
)

data class MainData(
    val temp: Double,
    val feels_like: Double,
    val humidity: Int
)

data class WeatherInfo(
    val description: String,
    val icon: String
)

data class SimpleWeather(
    var city: String = "",
    var temperature: Int = 0
)