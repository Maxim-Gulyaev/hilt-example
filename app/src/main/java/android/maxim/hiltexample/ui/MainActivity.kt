package android.maxim.hiltexample.ui

import android.maxim.hiltexample.R
import android.maxim.hiltexample.data.LocalSource
import android.maxim.hiltexample.data.RemoteSource
import android.maxim.hiltexample.data.SomeInterface
import android.maxim.hiltexample.di.SomeInterfaceFirstImpl
import android.maxim.hiltexample.di.SomeInterfaceSecondImpl
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var localSource: LocalSource
    @Inject lateinit var remoteSource: RemoteSource

    @Inject
    @SomeInterfaceFirstImpl
    lateinit var someInterface: SomeInterface

    @Inject
    @SomeInterfaceSecondImpl
    lateinit var someInterface2: SomeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        localSource.provideLocalSource()
        remoteSource.provideRemoteData()
        someInterface.interfaceFunction()
        someInterface2.interfaceFunction()
    }
}