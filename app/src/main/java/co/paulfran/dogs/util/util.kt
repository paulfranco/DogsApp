package co.paulfran.dogs.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import co.paulfran.dogs.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

val PERMISSION_SEND_SMS = 234

fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

fun ImageView.loadImage(uri: String?, progressDrawable: CircularProgressDrawable) {
    val options = RequestOptions()
            .placeholder(progressDrawable)
            .error(R.mipmap.ic_dog_icon)
    Glide.with(context)
            .setDefaultRequestOptions(options)
            .load(uri)
            .into(this)
}

@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, url: String?) {
    view.loadImage(url, getProgressDrawable(view.context))
}