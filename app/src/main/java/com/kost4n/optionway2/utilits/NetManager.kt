package com.kost4n.optionway2.utilits

import android.content.Context
import android.net.ConnectivityManager

@Suppress("DEPRECATION")
class NetManager(private val applicationContext: Context) {
    private var status: Boolean? = null

    val isConnectedToInternet: Boolean
        get() {
            val conManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val ni = conManager.activeNetworkInfo
            return ni != null && ni.isConnected
        }
}