package com.example.routine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.routine.ui.theme.RoutineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoutineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Marcelo")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Acodo por volta das 6:40, me arrumo para a faculdade, assisto normalmente as aulas todos os dias da semana menos na quarta feira, costumo estudar a tarde na biblioteca das 13:00 até as 15:00/15:30 mais ou menos, quando chego em casa costumo fazer algumas atividades se tiver, quando termino vou para a academia e pela noite eu costumo deixar livre para fazer algo que eu queira como jogar, ler algo do meu interesse etc. Costumo dormir umas 23:00. ",
            modifier = modifier
        )
        Text(
            text = "So sei que nada sei. Sócrates ",
            modifier = modifier
        )
        Image(
            painter = painterResource(R.drawable.avatar_homem),
            contentDescription = null,
            modifier = modifier
        )
        Image(
            painter = painterResource(R.drawable._40516_18h39m11s_screenshot),
            contentDescription = null,
            modifier = modifier
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RoutineTheme {
        Greeting("Marcelo")
    }
}