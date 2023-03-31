package android.maxim.hiltexample.ui

import android.maxim.hiltexample.R
import android.maxim.hiltexample.data.LocalSource
import android.maxim.hiltexample.data.RemoteSource
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var localSource: LocalSource
    @Inject lateinit var remoteSource: RemoteSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        localSource.provideLocalSource()
        remoteSource.provideRemoteData()
    }
}