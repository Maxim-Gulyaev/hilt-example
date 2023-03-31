package android.maxim.hiltexample.data

import android.util.Log
import javax.inject.Inject

class SomeInterfaceImpl @Inject constructor(): SomeInterface {

    override fun interfaceFunction() {

        Log.d("tag", "interface function works")

    }
}