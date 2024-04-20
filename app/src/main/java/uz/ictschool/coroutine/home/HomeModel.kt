package uz.ictschool.coroutine.home

import android.util.Log
import uz.ictschool.coroutine.Comment
import uz.ictschool.coroutine.api.APIService

class HomeModel(val api: APIService) {


    suspend fun getAllComments(): List<Comment> {
        Log.d("TAG", "getAllComments: ${api.getAllComments().comments}")
        return api.getAllComments().comments
    }


}