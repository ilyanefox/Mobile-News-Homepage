package com.example.newshomepage.project

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newshomepage.R
import kotlinx.coroutines.launch

@Composable
fun NewsScreen(
    openDrawer: () -> Unit
) {
//    val drawerState = rememberDrawerState(DrawerValue.Closed)
//    val scope = rememberCoroutineScope()
//    val openDrawer = {
//        scope.launch {
//            drawerState.open()
//        }

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(255, 253, 250))
            .padding(horizontal = 16.dp)
    ) {
        TopBar(openDrawer)
        Column(Modifier.verticalScroll(rememberScrollState())) {
            ArticleSection()
            Surface(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 60.dp), color = Color(0, 0, 26), shape = RectangleShape) {
                Column(Modifier.padding(18.dp)) {
                    Text(
                        text = "New",
                        style = MaterialTheme.typography.h2.copy(color = Color(233, 171, 83))
                    )
                }
            }
        }

//                ModalDrawer(
//                    drawerContent = {
//                        IconButton(
//                            onClick = { scope.launch { drawerState.close() } },
//                            modifier = Modifier.padding(top = 28.dp, end = 16.dp)
//                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.icon_menu_close),
//                                contentDescription = "Menu"
//                            )
//                        }
//                    }
//                ) {
//                        IconButton(
//                            onClick = {
//                                scope.launch {
//                                    drawerState.open()
//                                }
//                            }
//                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.icon_menu),
//                                contentDescription = "Menu"
//                            )
//                        }
//                    }
                }
}

@Composable
private fun ArticleSection() {
    Image(
        painter = painterResource(id = R.drawable.image_web_3_mobile),
        contentDescription = "Web Image",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
    Text(
        text = "The Bright Future of Web 3.0?",
        style = MaterialTheme.typography.h1.copy(color = Color(0, 0, 26), lineHeight = 48.sp),
        modifier = Modifier.padding(top = 24.dp)
    )
    Text(
        text = "We dive into the next evolution of the web that claims to put the power of the platforms back into the hands of the people. But is it really fulfilling its promise?",
        style = MaterialTheme.typography.body1,
        modifier = Modifier.padding(vertical = 16.dp)
    )
    Button(
        onClick = {},
        modifier = Modifier.padding(vertical = 18.dp),
        enabled = true,
        shape = RectangleShape,
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 40.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(241, 93, 80),
            contentColor = Color(255, 253, 250)
        )
    ) {
        Text(
            text = "READ MORE",
            style = MaterialTheme.typography.body1.copy(
                color = Color(255, 253, 250),
                fontWeight = FontWeight.Bold,
                letterSpacing = 4.sp
            )
        )
    }
}

@Composable
private fun TopBar(openDrawer: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
        )
        IconButton(
            onClick = { openDrawer() }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_menu),
                contentDescription = "Menu"

            )
        }
    }
}


@Composable
fun MenuModal() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalDrawer(
        drawerContent = {
            IconButton(
                onClick = { scope.launch { drawerState.close() } },
                modifier = Modifier.padding(top = 28.dp, end = 16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_menu_close),
                    contentDescription = "Menu"

                )
            }
        },
    ) {
    }
}


@Composable
@Preview(showBackground = true)
fun NewsPreview() {
    NewsScreen{}
}