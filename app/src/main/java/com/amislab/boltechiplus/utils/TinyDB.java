package com.amislab.boltechiplus.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by hhsonet on 3/2/2018.
 * Use this class for Storing data in SharedPreferences.
 */

public class TinyDB {
    private Context context;
    private String SP_DEFAULT_VALUE_STR = "nil";
    private int SP_DEFAULT_VALUE_INT = 0;
    private boolean SP_DEFAULT_VALUE_BOOL = false;
    private SharedPreferences preferences;
    // constrictor
    public TinyDB(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    // save data to Shared Pref.
    public void putString(String name, String value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(name, value);
        editor.commit();
    }

    public void putInt(String name, int value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(name, value);
        editor.commit();
    }

    public void putBoolean(String name, boolean value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(name, value);
        editor.commit();
    }


    // fetch data from Shared Pref.

    public String getString(String name) {
        return preferences.getString(name, SP_DEFAULT_VALUE_STR);
    }

    public int getInt(String name) {
        return preferences.getInt(name, SP_DEFAULT_VALUE_INT);
    }

    public boolean getBoolean(String name) {
        return preferences.getBoolean(name, SP_DEFAULT_VALUE_BOOL);
    }

}
