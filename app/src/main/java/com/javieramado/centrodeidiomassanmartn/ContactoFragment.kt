package com.javieramado.centrodeidiomassanmartn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

/**
 * A simple [Fragment] subclass.
 */
class ContactoFragment : Fragment(), OnMapReadyCallback{

    private lateinit var mapView: MapView
    private lateinit var map: GoogleMap

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? { // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_contacto, container, false)

        mapView = v.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

        return v
    }

    override fun onMapReady(p0: GoogleMap?) {
        map = p0!!
        val centroIdiomas = LatLng(36.341831, -5.322017) //TODO Añadir sitio ya existente
        val zoom = 18;

        //Marcador
        map.addMarker(MarkerOptions().position(centroIdiomas).title("Centro de Idiomas San Martín"))
        //Dónde se va a posicionar la cámara
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(centroIdiomas, zoom.toFloat()))
    }

    override fun onResume() {
        mapView.onResume()
        super.onResume()
    }


    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}