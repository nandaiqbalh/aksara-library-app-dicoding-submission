package com.nandaiqbalh.aksaralibrary.helper

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs(var context: Context) {

    companion object{
        const val USER_PREF = "USER_PREF"
    }

    private var sharedPreference = context.getSharedPreferences(USER_PREF, 0)

    // set value
    fun setValue(key: String, value:String){
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(key, value)
        editor.apply()

    }

    // get value
    fun getValue(value: String) : String?{
        return sharedPreference.getString(value, "")
    }
}