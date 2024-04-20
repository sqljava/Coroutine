package uz.ictschool.coroutine.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import uz.ictschool.coroutine.Comment

class HomeViewModel(val model: HomeModel) : ViewModel(){

    private var _allComments = MutableStateFlow<List<Comment>>(listOf())
    val allComments: StateFlow<List<Comment>> = _allComments

    @OptIn(DelicateCoroutinesApi::class)
    fun getComments(){
        GlobalScope.launch (Dispatchers.IO){
            _allComments.value = model.getAllComments()
        }
    }

    init {
        getComments()
    }



}