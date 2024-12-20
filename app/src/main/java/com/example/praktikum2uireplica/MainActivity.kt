package com.example.praktikum2uireplica

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum2uireplica.ui.theme.Praktikum2UIReplicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum2UIReplicaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginPage()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    Praktikum2UIReplicaTheme{
        LoginPage()
    }
}

@Composable
fun LoginPage() {
    val gradient = Brush.verticalGradient(
        0.0f to Color(0xFF6AF6C3),
        1.0f to Color(0xFF3D79F9),
        startY = 0.0f,
        endY = 2500.0f
    )
    Box(modifier = Modifier.background(gradient)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id
                = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(200.dp)
                    .height(250.dp)
                    .padding(top = 80.dp)
            )
            Text(
                text = "Learn Graphic and UI/UX designing in Hindi for free with live projects.",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .absolutePadding(
                        30.dp,
                        25.dp,
                        30.dp,
                        20.dp
                    )
            )
            var email by remember { mutableStateOf("") }
            TextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(
                        text = "Email Address",
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Normal
                    )
                },
                placeholder = {
                    Text(
                        text = "Enter Email Address",
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .width(210.dp)
                    .height(72.dp)
                    .absolutePadding(
                        30.dp,
                        20.dp,
                        30.dp,
                        0.dp
                    )
                    .clip(RoundedCornerShape(150.dp))
                    .background(
                        color = Color(0xFF6CC5DE),
                        shape = RoundedCornerShape(150.dp)
                    )
                    .border(
                        width = 3.dp,
                        color = Color(0xFF6CC5DE),
                        shape = RoundedCornerShape(150.dp)
                    )
                    .padding(start = 8.dp),
                textStyle = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                ),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    errorContainerColor = Color.Transparent

                ),
            )
            var password by remember { mutableStateOf("") }
            TextField(
                value = password,
                onValueChange = { password = it },
                label = {
                    Text(
                        text = "Password",
                        color = Color.White,
                        fontSize = 15.sp,
                    )
                },
                placeholder = {
                    Text(
                        text = "Enter Password",
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(210.dp)
                    .height(72.dp)
                    .absolutePadding(
                        30.dp,
                        20.dp,
                        30.dp,
                        0.dp
                    )
                    .clip(RoundedCornerShape(150.dp))
                    .background(
                        color = Color(0xFF6CC5DE),
                        shape = RoundedCornerShape(150.dp)
                    )
                    .border(
                        width = 3.dp,
                        color = Color(0xFF6CC5DE),
                        shape = RoundedCornerShape(150.dp)
                    )
                    .padding(start = 12.dp),
                textStyle = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White
                ),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    errorContainerColor = Color.Transparent

                )
            )

            val context = LocalContext.current
            Button(
                onClick = {
                    if (email == "studentji@gmail.com" && password == "studentji"){
                        Toast.makeText(context, "Correct Credenticals", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(context, "Wrong Credentials", Toast.LENGTH_SHORT).show()
                    }

                },
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(210.dp)
                    .height(72.dp)
                    .absolutePadding(
                        30.dp,
                        20.dp,
                        30.dp,
                        0.dp
                    )
            )
            {
                Text(
                    text = "LOGIN",
                    fontSize = 16.sp,
                    color = Color(0xFF3F82E6),
                    fontWeight = FontWeight.Normal
                )
            }
            Box(modifier = Modifier
                .absolutePadding(
                    225.dp,
                    20.dp,
                    30.dp,
                    10.dp
                )){
                Text(
                    text = "Forgot Password?",
                    modifier = Modifier
                        .clickable { Toast.makeText(context, "Forgot Password Pressed", Toast.LENGTH_SHORT).show() },
                    color = Color.White,
                    textAlign = TextAlign.Right
                )
            }
            Row(
                modifier = Modifier
                    .absolutePadding(
                    45.dp,
                    55.dp,
                    45.dp,
                    0.dp
                ),
                ) {
                Button(
                    onClick = { Toast.makeText(context, "Gmail Button Pressed", Toast.LENGTH_SHORT).show() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(20.dp),
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                        .size(67.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gmail),
                        contentDescription = "gmail",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Spacer(modifier = Modifier.width(25.dp))
                Button(
                    onClick = { Toast.makeText(context, "Facebook Button Pressed", Toast.LENGTH_SHORT).show()},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(20.dp),
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                        .size(67.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "facebook",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Spacer(modifier = Modifier.width(25.dp))
                Button(
                    onClick = { Toast.makeText(context, "Twitter Button Pressed", Toast.LENGTH_SHORT).show()},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(20.dp),
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                        .size(67.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "twitter",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            Spacer(modifier = Modifier.height(45.dp))
            Row{
                Text(
                    text = "Don’t have an account? ",
                    modifier = Modifier
                        .absolutePadding(
                            0.dp,
                            0.dp,
                            0.dp,
                            10.dp
                        ),
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Register now",
                    modifier = Modifier
                        .clickable { Toast.makeText(context, "Register Pressed", Toast.LENGTH_SHORT).show() }
                        .absolutePadding(
                            0.dp,
                            0.dp,
                            0.dp,
                            10.dp
                        ),
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

