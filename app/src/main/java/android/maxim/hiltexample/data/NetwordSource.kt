package android.maxim.hiltexample.data

import android.util.Log
import javax.inject.Inject

class RemoteSource @Inject constructor() {

    fun provideRemoteData() {

        Log.d("tag", "remote source works")

    }

}