package com.example.unittesting

import android.content.Context

class ResourceCompare {

    fun isEqual(
        context: Context,
       resourceId: Int,
        string: String
    ):Boolean{
        return context.getString(resourceId) == string
    }
}