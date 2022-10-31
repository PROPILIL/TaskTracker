package com.propil.tasktracker.ui.activity

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.propil.tasktracker.ui.theme.TaskTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TopBar()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Sample Text")
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colors.onSecondary
        )
    }
}


@Composable
fun TaskList() {
    LazyColumn(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxSize()
    ) {
        item {
            TaskItem()
            TaskItem()
            TaskItem()
            TaskItem()
        }
    }
}


@Composable
fun TaskItem() {

    Card(
        modifier = Modifier
            .padding(bottom = 4.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(4.dp),
            verticalAlignment = Alignment.Top
        ) {
//            Checkbox(
//                checked = checked.value,
//                onCheckedChange = { checked.value = it })
            ItemText()


        }
    }
}

@Preview(showBackground = true)
@Composable
fun CircleCheckBox() {
    val checked = remember { mutableStateOf(true) }
    val imageVector = if (checked.value) Icons.Filled.CheckCircle else Icons.Outlined.AddCircle
    val background = if(checked.value) Color.White else Color.Transparent
    IconButton(
        onClick = { checked.value = !checked.value },
        modifier = Modifier.offset(x = 4.dp, y = 4.dp),
        enabled = checked.value
    ) {
        Icon(
            imageVector = imageVector,
            modifier = Modifier.background(background, shape = CircleShape),
            contentDescription = "Checkbox"
        )

    }
}

@Composable
fun ItemText() {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Title title title title",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Sample text sample text sample text sample text sample text sample text sample text" +
                    " sample text sample text sample text sample text sample text sample text" +
                    " sample text sample text sample text sample text sample text sample text",
            color = Color.Gray,
            fontSize = 14.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 2
        )
        Text(
            text = "29 окт.",
            color = Color.Red
        )
    }
}
