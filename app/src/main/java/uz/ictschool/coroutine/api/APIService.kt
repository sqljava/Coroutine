package uz.ictschool.coroutine.api

import okhttp3.Response
import retrofit2.http.GET
import uz.ictschool.coroutine.CommentList

interface APIService {

    @GET("/comments")
    suspend fun getAllComments(): CommentList
}