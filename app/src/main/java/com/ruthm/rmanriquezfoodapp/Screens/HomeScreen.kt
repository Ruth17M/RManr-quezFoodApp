package com.ruthm.rmanriquezfoodapp.Screens

import ads_mobile_sdk.h5
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import com.ruthm.rmanriquezfoodapp.Models.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.ruthm.rmanriquezfoodapp.ui.theme.Orange



val  categorias = listOf(
    Category("Fast Food", "https://static.vecteezy.com/system/resources/previews/003/672/373/non_2x/junk-food-cartoon-design-vector.jpg"),
    Category("Chinese", "https://img.freepik.com/vector-premium/diseno-ilustracion-comida-china-picante-dibujos-animados_561641-262.jpg"),
    Category("Italian", "https://static.vecteezy.com/system/resources/previews/013/330/541/non_2x/spaghetti-cartoon-icon-illustration-pasta-food-icon-concept-isolated-premium-flat-cartoon-style-vector.jpg"),
    Category("Mexican","https://thumbs.dreamstime.com/b/taco-linda-foto-de-color-caricatura-la-comida-mexicana-tradicional-elementos-dise%C3%B1o-gr%C3%A1fico-para-men%C3%BA-embalaje-publicidad-196496542.jpg")
)

val restaurantes = listOf(
    Restaurant("Burger King", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Burger_King_logo_%281999%E2%80%932020%29.svg/1012px-Burger_King_logo_%281999%E2%80%932020%29.svg.png"),
    Restaurant("McDonald's", "https://upload.wikimedia.org/wikipedia/commons/0/05/McDonald%27s_square_2020.svg"),
    Restaurant("KFC", "https://media-cdn.tripadvisor.com/media/photo-s/2e/7f/f4/6d/kfc.jpg"),
    Restaurant("Starbucks", "https://puertalavictoria.mx/wp-content/uploads/2024/01/starbucks.jpg")
)

val comida = listOf(
    Food("Whopper", 4.5, 99.8, "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png"),
    Food("Chicken Fries",4.3,59.8, "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png"),
    Food("Big Mac", 4.6, 79.8, "https://s7d1.scene7.com/is/image/mcdonalds/DC_202302_0005-999_BigMac_1564x1564-1:product-header-mobile?wid=1313&hei=1313&dpr=off"),
    Food("McFlurry",4.7,49.8,"https://mcdonalds.es/api/cms/images/Z41IJpbqstJ99nTR_Hero-McFlurry-Kitkat_desk.png?rect=524,0,873,679&auto=compress&fm=webp"),
    Food("Nuggets", 4.3,9.9,"https://vanguardia.com.mx/binrepository/1200x856/0c27/1200d801/none/11604/ESCJ/mcdonaldsnuggetsvegan_1-4857746_20230216191832.jpg"),
    Food("Caramel Macchiato",3.7, 86.9,"https://www.groundstobrew.com/wp-content/uploads/2022/01/starbucks-caramel-macchiato.jpg")
    )




@Composable
fun FoodApp(){
       MaterialTheme {
            HomeScreen(userName = "Ruth")
       }
}

@Composable
fun HomeScreen(userName: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 20.dp)
    ) {


        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = Orange.copy(alpha = 1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                "Hola, $userName",
                fontSize = 25.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.width(160.dp))

            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = Orange.copy(alpha = 1f)
            )

        }

            Spacer(modifier = Modifier.height(25.dp))

            //Sección categorias
            Text("Nuestras categorías",
                fontSize = 25.sp,
                fontWeight = FontWeight.Normal)


            LazyRow {
                items(categorias) { Category ->
                    CategoryItem(Category)
                }

            }
        }
    }


//Carta de categorias
@Composable
fun CategoryItem(category: Category) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    )
    {
        Image(
            painter = rememberAsyncImagePainter(category.image),
            contentDescription = category.name,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Text(category.name,
            fontSize = 18.sp,
            fontWeight = FontWeight.Light
        )
    }
}






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FoodAppPreview() {
    FoodApp()
}