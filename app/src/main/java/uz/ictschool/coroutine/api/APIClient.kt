package uz.ictschool.coroutine.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    const val BASE_URL = "https://dummyjson.com"

    fun getInstance(): APIService {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build().create(APIService::class.java)
    }
}