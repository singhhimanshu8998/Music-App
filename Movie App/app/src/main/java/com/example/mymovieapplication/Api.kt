package com.example.mymovieapplication


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "a6430b3126c558c2f6e4695528c44b4e",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}