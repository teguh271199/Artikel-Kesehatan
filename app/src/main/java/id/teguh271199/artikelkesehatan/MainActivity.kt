package id.teguh271199.artikelkesehatan

import Artikel
import Datasource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.teguh271199.artikelkesehatan.ui.theme.ArtikelKesehatanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtikelApp()
        }
    }
}

@Composable
fun ArtikelApp() {
    ArtikelKesehatanTheme {
        ArtikelList(artikelList = Datasource().loadArtikels())
    }
}

@Composable
fun ArtikelList(artikelList: List<Artikel>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(artikelList) { artikel ->
            ArtikelCard(artikel)
        }
    }
}

@Composable
fun ArtikelCard(artikel: Artikel, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(artikel.imageResourceId),
                contentDescription = stringResource(artikel.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(artikel.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )
            Text(
                text = LocalContext.current.getString(artikel.deskripsi),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.subtitle1
            )
        }
    }
}

@Preview
@Composable
private fun ArtikelCardPreview() {
    ArtikelCard (Artikel(R.string.artikel1,R.string.artikel1, R.drawable.image1))
}