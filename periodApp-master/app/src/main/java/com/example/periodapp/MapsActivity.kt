package com.example.periodapp

import android.graphics.Color
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.periodapp.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.CircleOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val kanpur = LatLng(26.4189, 80.3085)
        mMap.addMarker(MarkerOptions().position(kanpur).title("Marker in kanpur"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kanpur))

        mMap.addCircle( CircleOptions()
            .center(kanpur).radius(10.0).fillColor(Color.BLUE).strokeColor(Color.MAGENTA))

       
    }
}