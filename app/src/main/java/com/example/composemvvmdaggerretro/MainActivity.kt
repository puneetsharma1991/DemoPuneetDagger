package com.example.composemvvmdaggerretro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.composemvvmdaggerretro.ui.theme.ComposeMvvmDaggerRetroTheme
import com.example.composemvvmdaggerretro.viewmodels.ProductViewModel
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    ;lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as EcommereceApplication).applicationComponent.inject(this)

        productViewModel= ViewModelProvider(this,viewModelProviderFactory).get(ProductViewModel::class.java)


        setContent {
            ComposeMvvmDaggerRetroTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    if(!productViewModel.prodList.value.isEmpty()) {
                        productViewModel.prodList.value.get(0).title.let { Greeting(it) }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMvvmDaggerRetroTheme {
        Greeting("Android")
    }
}