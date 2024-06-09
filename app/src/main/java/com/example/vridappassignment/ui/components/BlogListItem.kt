package com.example.vridappassignment.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.vridappassignment.model.BlogsItem

@Composable
fun BlogListItem(modifier: Modifier = Modifier, blogsItem: BlogsItem, onClick: (Int) -> Unit) {
  Column(modifier = Modifier.fillMaxWidth()) {
    Card(modifier = Modifier.fillMaxWidth().padding(6.dp).clickable { onClick(blogsItem.id) }) {
      AsyncImage(
        model =
          blogsItem.jetpackFeaturedMediaUrl,
        contentDescription = "image",
      )
      Text(
        text = blogsItem.title.rendered,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = Color.White,
        modifier = Modifier.padding(8.dp),
        fontStyle = FontStyle.Italic,
      )
      Text(
        text = "Date:- ${blogsItem.date}",
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        modifier = Modifier.padding(8.dp),
        color = Color.White,
      )
      Text(text = blogsItem.status, modifier = Modifier.padding(8.dp))
    }
  }
}
