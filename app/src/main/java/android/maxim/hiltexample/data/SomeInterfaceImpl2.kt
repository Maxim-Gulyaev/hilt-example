package android.maxim.hiltexample.data

import android.util.Log
import javax.inject.Inject

class SomeInterfaceImpl2 @Inject constructor(): SomeInterface {

    override fun interfaceFunction() {

        Log.d("tag", "interface second function works")

    }
}