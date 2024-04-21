package org.meicode.recyclerviewinkotlin

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MoviesApi {

    @GET("/api/users?page=2")
    suspend fun getMovies(): Response<MoviesResponse>

    companion object{
        operator fun invoke() : MoviesApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://reqres.in")
                .build()
                .create(MoviesApi::class.java)
        }
    }
}