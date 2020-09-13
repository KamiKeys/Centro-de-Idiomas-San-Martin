package com.javieramado.centrodeidiomassanmartn

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.synnapps.carouselview.CarouselView
import java.io.InputStream
import java.net.URL

/**
 * A simple [Fragment] subclass.
 */
class CovidFragment : Fragment() {

    private val fotos = intArrayOf(
            R.drawable.covid2, R.drawable.covid3, R.drawable.covid1
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_covid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textoCovid = view.findViewById<TextView>(R.id.txtCovid)
        val carouselView: CarouselView = view.findViewById(R.id.carrusel2)

        carouselView.setImageListener { position, imageView -> imageView.setImageResource(fotos[position]) }
        carouselView.pageCount = fotos.size

        // Remote Config
        Firebase.remoteConfig.fetchAndActivate().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val applyText: String = Firebase.remoteConfig.getString("texto_covid").replace("\\n", "\n")
                Thread {
                    try {
                        activity?.runOnUiThread {
                            if (!applyText.isEmpty())
                                textoCovid.text = applyText
                        }
                    } catch (e: Exception) {
                        Toast.makeText(context, "Algo salió mal...", Toast.LENGTH_SHORT).show()
                    }
                }.start()
            }
        }
    }

}
