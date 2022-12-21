import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Artikel(
    @StringRes val stringResourceId: Int,
    @StringRes val deskripsi: Int,
    @DrawableRes val imageResourceId: Int
)