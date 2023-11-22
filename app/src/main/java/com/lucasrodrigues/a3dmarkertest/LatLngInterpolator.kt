package com.lucasrodrigues.a3dmarkertest

import com.google.android.gms.maps.model.LatLng

interface LatLngInterpolator {

    fun interpolate(fraction: Float, from: LatLng, to: LatLng): LatLng

    class Linear {
        companion object : LatLngInterpolator {
            override fun interpolate(fraction: Float, from: LatLng, to: LatLng): LatLng {
                val lat = (to.latitude - from.latitude) * fraction + from.latitude
                val lng = (to.longitude - from.longitude) * fraction + from.longitude
                return LatLng(lat, lng)
            }
        }
    }
}