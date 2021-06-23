package com.example.googlemap.utils.asset_register

import android.content.Context
import com.example.googlemap.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStream
import java.io.InputStreamReader

class AssetReader(private val context: Context) {

    private val gson = Gson()

    private val inputStream: InputStream
        get() = context.resources.openRawResource(R.raw.places)

    fun read(): List<Asset> {
        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
        val reader = InputStreamReader(inputStream)
        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
            it.toPlace()
        }
    }
}