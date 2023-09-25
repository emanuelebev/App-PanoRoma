package com.example.panoroma.ui.map

import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.core.graphics.createBitmap
import androidx.fragment.app.Fragment
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.example.panoroma.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.net.URL


class MapsActivity : Fragment(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_maps, container, false)
        val mapFragment =
            childFragmentManager.fragments[0] as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
        val toolbar = (rootView!!.findViewById<View>("1".toInt()).parent as View).findViewById<View>("4".toInt())

        // and next place it, for example, on bottom right (as Google Maps app)

        // and next place it, for example, on bottom right (as Google Maps app)
        val rlp = toolbar.layoutParams as RelativeLayout.LayoutParams
        // position on right bottom
        // position on right bottom
        rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0)
        rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE)
        rlp.setMargins(0, 0, 0, 1400)
        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap!!
        // Add a marker in Sydney and move the camera
        val latlng_pincio = LatLng(41.9135245551798, 12.477636485644826)
        val latlng_colosseo = LatLng(41.89031748757595, 12.49223224919796)
        val latlng_aranci = LatLng(41.88516879140589, 12.480273682461961)
        val latlng_mylocation = LatLng(41.89517348099293, 12.50074332786879)

        val pincio = mMap.addMarker(MarkerOptions().position(latlng_pincio).title("Terrazza del pincio").snippet("Visite: 68"))
        val colosseo = mMap.addMarker(MarkerOptions().position(latlng_colosseo).title("Colosseo").snippet("Visite: 126"))
        val aranci = mMap.addMarker(MarkerOptions().position(latlng_aranci).title("Giardino degli aranci").snippet("Visite: 17"))
        val location = mMap.addMarker(MarkerOptions().position(latlng_mylocation).title("Posizione attuale"))
        location.showInfoWindow()
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng_mylocation, 13f))
    }

}



