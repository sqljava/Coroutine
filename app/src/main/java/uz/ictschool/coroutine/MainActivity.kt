package uz.ictschool.coroutine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uz.ictschool.coroutine.api.APIClient
import uz.ictschool.coroutine.api.APIService
import uz.ictschool.coroutine.home.HomeModel
import uz.ictschool.coroutine.home.HomeView
import uz.ictschool.coroutine.home.HomeViewModel
import uz.ictschool.coroutine.ui.theme.CoroutineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoroutineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val api = APIClient.getInstance()
                    val model = HomeModel(api)
                    val viewModel = HomeViewModel(model)
                    HomeView(viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoroutineTheme {
        Greeting("Android")
    }
}