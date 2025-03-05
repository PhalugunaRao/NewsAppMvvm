package com.phalu.newsapp.data.api

import com.phalu.newsapp.data.model.TopHeadlinesResponse
import com.phalu.newsapp.utils.AppConstant.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

    @Headers("X-Api-Key: $API_KEY",  "User-Agent: abc")
    @GET("top-headlines")
    suspend fun getTopHeadlines(@Query("country") country: String): TopHeadlinesResponse

}