package android.maxim.hiltexample.data

import android.util.Log
import javax.inject.Inject

class LocalSource @Inject constructor() {

    fun provideLocalSource() {

        Log.d("tag", "local source works")

    }

}