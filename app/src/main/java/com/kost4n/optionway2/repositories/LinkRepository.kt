package com.kost4n.optionway2.repositories

import android.content.Context

class LinkRepository(context: Context) {
    private val localDataSource = LinkLocalDataSource(context)
    private val remoteDataSource = LinkRemoteDataSource(context)

    fun getLink(): String {
        return if (localDataSource.isSaved()) {
            localDataSource.getLink()
        } else {
            remoteDataSource.getLink()
        }
    }
}