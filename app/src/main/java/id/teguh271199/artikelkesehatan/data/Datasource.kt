import id.teguh271199.artikelkesehatan.R

class Datasource() {
    fun loadArtikels(): List<Artikel> {
        return listOf<Artikel>(
            Artikel(R.string.artikel1,R.string.deskripsi1,R.drawable.image1),
            Artikel(R.string.artikel2,R.string.deskripsi2,R.drawable.image2),
            Artikel(R.string.artikel3,R.string.deskripsi3,R.drawable.image3),
            Artikel(R.string.artikel4,R.string.deskripsi4,R.drawable.image4,),
            Artikel(R.string.artikel5,R.string.deskripsi5,R.drawable.image5),
            Artikel(R.string.artikel6,R.string.deskripsi6,R.drawable.image6),
            Artikel(R.string.artikel7,R.string.deskripsi7,R.drawable.image7),
            Artikel(R.string.artikel8,R.string.deskripsi8,R.drawable.image8),
            Artikel(R.string.artikel9,R.string.deskripsi9,R.drawable.image9),
            Artikel(R.string.artikel10,R.string.deskripsi10,R.drawable.image10))
    }
}




