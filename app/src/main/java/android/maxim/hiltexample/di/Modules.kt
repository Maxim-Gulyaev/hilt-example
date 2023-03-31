package android.maxim.hiltexample.di

import android.maxim.hiltexample.data.SomeInterface
import android.maxim.hiltexample.data.SomeInterfaceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface ActivityModule {

    @Binds
    fun provideSomeInterface(someInterfaceImpl: SomeInterfaceImpl): SomeInterface

}