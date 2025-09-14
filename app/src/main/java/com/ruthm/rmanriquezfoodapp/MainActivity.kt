package com.ruthm.rmanriquezfoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.ruthm.rmanriquezfoodapp.Models.*
import com.ruthm.rmanriquezfoodapp.Screens.FoodApp
import com.ruthm.rmanriquezfoodapp.ui.theme.RManriquezFoodAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodApp()
        }
    }
}





