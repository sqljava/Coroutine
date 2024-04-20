package uz.ictschool.coroutine.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import uz.ictschool.coroutine.Comment

@Composable
fun HomeView(viewModel: HomeViewModel) {
    //viewModel.getComments()
    val allComments = viewModel.allComments.collectAsState().value

    Box(modifier = Modifier.fillMaxSize()){
        if (allComments!=null){
            LazyColumn {
                items(allComments){
                    ItemComment(comment = it)
                }
            }
        }

    }



}

@Composable
private fun ItemComment(comment: Comment){
    Row(modifier = Modifier.fillMaxWidth()) {

        Column {
            Text(text = comment.user.username,
                fontSize = 20.sp)
            Text(text = comment.body,
                fontSize = 15.sp)
        }

    }
}