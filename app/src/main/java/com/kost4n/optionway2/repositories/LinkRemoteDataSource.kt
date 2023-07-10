package com.kost4n.optionway2.repositories

import android.content.Context
import android.os.Handler
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class LinkRemoteDataSource(private val context: Context) {
    private val fileName = "link"

    fun getLink(): String {
        val remoteConfig = FirebaseRemoteConfig.getInstance()
        val default = mapOf(
            "url" to "http://google.com/"
        )
        var url = ""
        val configSettings: FirebaseRemoteConfigSettings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(10)
            .build()
        remoteConfig.setDefaultsAsync(default)
        remoteConfig.setConfigSettingsAsync(configSettings)
        remoteConfig.fetchAndActivate().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val ope: String = remoteConfig.getString("url")
                if (ope.isNotEmpty()) {
                    url = ope
                    saveLink(url)
                }
            }
        }
        return url
    }

    private fun saveLink(url: String) {
        context.openFileOutput(
            fileName, Context.MODE_PRIVATE
        ).use {
            it.write(url.toByteArray())
        }

    }
}