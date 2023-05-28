package com.example.insta_login


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            insta()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun insta() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        repeat(0) {}
        Card(modifier = Modifier.padding(30.dp,30.dp,30.dp,15.dp)) {
            Column(modifier = Modifier.padding(25.dp)) {
                Image(painter = painterResource(id = R.drawable.insta_top), contentDescription = "")
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Sign up to see photos and videos",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "from your friends.",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        Color(android.graphics.Color.parseColor("#3b5a9a")),
                        androidx.compose.ui.graphics.Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(12.dp)
                    )
                    Text(
                        text = "Log in with Facebook",
                        modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)
                    )
                }
                Row() {
                    Divider(
                        color = Color.Gray, thickness = 1.dp, modifier = Modifier
                            .weight(1f)
                            .padding(0.dp, 20.dp)
                    )
                    Text(text = "OR", modifier = Modifier.padding(20.dp, 11.dp))
                    Divider(
                        color = Color.Gray, thickness = 1.dp, modifier = Modifier
                            .weight(1f)
                            .padding(0.dp, 20.dp)
                    )
                }
                var mb_em = remember { mutableStateOf("") }
                var fullname = remember { mutableStateOf("") }
                var username = remember { mutableStateOf("") }
                var password = remember { mutableStateOf("") }

                OutlinedTextField(
                    value = mb_em.value,
                    onValueChange = { mb_em.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Mobile number or email address") }
                )
                OutlinedTextField(
                    value = fullname.value,
                    onValueChange = { fullname.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Fullname") }
                )
                OutlinedTextField(
                    value = username.value,
                    onValueChange = { username.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Username") }
                )
                var passwordVisible = rememberSaveable { mutableStateOf(false) }
                OutlinedTextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Password") }

                )
                Spacer(modifier = Modifier.height(15.dp))
                Row() {
                    val text =
                        "People who use our service may have uploaded your contact information to Instagram. "
                    val learnMore = "Learn More"

                    Text(
                        text = buildAnnotatedString {
                            append(text)
                            withStyle(
                                style = SpanStyle(
                                    color = Color(android.graphics.Color.parseColor("#3b5a9a"))
                                )
                            ) {
                                append(" $learnMore")
                            }
                        },
                        fontSize = 13.sp,
                        modifier = androidx.compose.ui.Modifier.clickable { /* Handle click event */ }, textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row() {
                    val text =
                        "By signing up you agree to our "
                    val learnMore = "Terms, Privacy Policy and Cookies Policy"

                    Text(
                        text = buildAnnotatedString {
                            append(text)
                            withStyle(
                                style = SpanStyle(
                                    color = Color(android.graphics.Color.parseColor("#3b5a9a"))
                                )
                            ) {
                                append(" $learnMore")
                            }
                        },
                        fontSize = 13.sp,
                        modifier = androidx.compose.ui.Modifier.clickable { /* Handle click event */ }, textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        Color(android.graphics.Color.parseColor("#3b5a9a")),
                        Color.White

                    )
                ) {
                    Text(
                        text = "Sign Up"
                    )
                }
            }
        }
        Card(modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()
            .height(60.dp)) {
            Row(modifier = Modifier
                .align(alignment = CenterHorizontally)
                .padding(0.dp, 20.dp)) {
                Text(text = "Have an account? ", fontWeight = FontWeight.Bold)
                Text(text = "Log in", style = TextStyle(color = Color(android.graphics.Color.parseColor("#3b5a9a"))))
            }
        }
    }
}


