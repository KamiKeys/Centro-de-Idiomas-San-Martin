package com.javieramado.centrodeidiomassanmartn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.CarouselView

class HomeFragment : Fragment() {
    private val fotos = intArrayOf(
            R.drawable.bannercentroidiomas, R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3, R.drawable.photo_4, R.drawable.photo_6,
            R.drawable.photo_7, R.drawable.photo_8, R.drawable.photo_9, R.drawable.photo_10, R.drawable.photo_11, R.drawable.photo_12,
            R.drawable.photo_13, R.drawable.photo_14, R.drawable.photo_15, R.drawable.photo_16, R.drawable.photo_17, R.drawable.photo_18, R.drawable.photo_19,
            R.drawable.photo_20, R.drawable.photo_21, R.drawable.photo22
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carouselView: CarouselView = view.findViewById(R.id.carrusel)
        carouselView.setImageListener { position, imageView -> imageView.setImageResource(fotos[position]) }
        carouselView.pageCount = fotos.size
    }
}