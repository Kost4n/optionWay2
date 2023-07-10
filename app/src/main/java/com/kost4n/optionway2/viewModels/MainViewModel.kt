package com.kost4n.optionway2.viewModels

import android.app.Application
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.kost4n.optionway2.utilits.NetManager
import com.kost4n.optionway2.activities.NoInternetActivity
import com.kost4n.optionway2.activities.PlugActivity
import com.kost4n.optionway2.activities.WebViewActivity
import com.kost4n.optionway2.repositories.LinkRepository
import java.util.*

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val netManager = NetManager(getApplication())
    private val linkRepository = LinkRepository(getApplication())

    fun getIntent(): Intent {
        return if (linkRepository.getLink() == "" || checkIsEmu()) {
            Log.i("view model", "--------------------link is =${linkRepository.getLink()} plugactiv;-------------")

            Intent(getApplication(), PlugActivity::class.java)
        } else {
            if (netManager.isConnectedToInternet) {
                Log.i("view model", "--------------------link is =${linkRepository.getLink()} webviewactiv;-------------")
                Intent(getApplication(), WebViewActivity::class.java)
                    .putExtra("url", linkRepository.getLink())
            } else {
                Intent(getApplication(), NoInternetActivity::class.java)
            }
        }
    }

    private fun checkIsEmu(): Boolean {
//        if (BuildConfig.DEBUG) return false
        val phoneModel = Build.MODEL
        val buildProduct = Build.PRODUCT
        val buildHardware = Build.HARDWARE
        var result = (Build.FINGERPRINT.startsWith("generic")
                || phoneModel.contains("google_sdk")
                || phoneModel.lowercase(Locale.getDefault()).contains("droid4x")
                || phoneModel.contains("Emulator")
                || phoneModel.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || buildHardware == "goldfish"
                || Build.BRAND.contains("google")
                || buildHardware == "vbox86"
                || buildProduct == "sdk"
                || buildProduct == "google_sdk"
                || buildProduct == "sdk_x86"
                || buildProduct == "vbox86p"
                || Build.BOARD.lowercase(Locale.getDefault()).contains("nox")
                || Build.BOOTLOADER.lowercase(Locale.getDefault()).contains("nox")
                || buildHardware.lowercase(Locale.getDefault()).contains("nox")
                || buildProduct.lowercase(Locale.getDefault()).contains("nox"))
        if (result) return true
        result = result or (Build.BRAND.startsWith("generic") &&
                Build.DEVICE.startsWith("generic"))
        if (result) return true
        result = result or ("google_sdk" == buildProduct)
        return result
    }
}