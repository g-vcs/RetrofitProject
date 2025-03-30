package com.guilherme.retrofitproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.guilherme.retrofitproject.ui.screen.CountryViewModel
import com.guilherme.retrofitproject.ui.theme.RetrofitProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetrofitProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GetCountriesList(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GetCountriesList(modifier: Modifier = Modifier) {
    val viewModel: CountryViewModel = viewModel(factory = AppViewModelProvider.Factory)
    val countries by viewModel.countries
    val error by viewModel.errorMessage

    Column(
        modifier.fillMaxSize()
    ) {
        if (error != null) {
            Text("Error: $error")
        } else {
            LazyColumn {
                items(countries) { country ->
                    Text(text = country.name.common, color = Color.Red, fontSize = 32.sp)
                }
            }
        }
    }
}

