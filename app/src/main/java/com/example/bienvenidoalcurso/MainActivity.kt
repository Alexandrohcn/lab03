package com.example.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCard()
                }
            }
        }
    }
}

@Composable
fun GreetingCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen de Android Party
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "Imagen de Android Party",
            modifier = Modifier.size(150.dp) // Puedes ajustar el tamaño de la imagen
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Mensaje de bienvenida
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Botones en una fila
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            // Botón personalizado "Accept"
            Button(
                onClick = { /* Simulación de acción para aceptar */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text("Accept")
            }
            // Botón personalizado "Decline"
            Button(
                onClick = { /* Simulación de acción para rechazar */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("Decline")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Imagen adicional (opcional)
        Image(
            painter = painterResource(id = R.drawable.navidad),
            contentDescription = "Imagen de Navidad",
            modifier = Modifier.size(100.dp)
        )
    }
}

// Vista previa para verificar el diseño
@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    BienvenidoAlCursoTheme {
        GreetingCard()
    }
}
