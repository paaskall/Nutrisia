package com.example.nutrisia

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ApiService {
    @POST("api/kelompok_1/register.php")
    fun addStudent(@Body student: UserNutrisia): Call<UserNutrisia>

    @POST("api/kelompok_1/login.php")
    fun loginUser(@Body loginData: LoginData): Call<LoginData>

}