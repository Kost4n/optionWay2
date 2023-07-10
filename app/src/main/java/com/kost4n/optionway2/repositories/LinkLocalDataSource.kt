package com.kost4n.optionway2.repositories

import android.content.Context
import java.io.File

class LinkLocalDataSource(private val context: Context) {
    private val fileName = "link"

    fun isSaved(): Boolean =
        File(context.filesDir, fileName)
            .exists()

    fun getLink(): String =
        File(context.filesDir, fileName)
            .bufferedReader()
            .use { it.readText() }
}