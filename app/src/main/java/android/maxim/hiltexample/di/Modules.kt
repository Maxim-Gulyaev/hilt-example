package android.maxim.hiltexample.di

import android.maxim.hiltexample.data.SomeInterface
import android.maxim.hiltexample.data.SomeInterfaceImpl
import android.maxim.hiltexample.data.SomeInterfaceImpl2
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface ActivityModule {

    @Binds
    @SomeInterfaceFirstImpl
    fun provideSomeInterface(someInterfaceImpl: SomeInterfaceImpl): SomeInterface

    @Binds
    @SomeInterfaceSecondImpl
    fun provideSomeInterface2(someInterfaceImpl2: SomeInterfaceImpl2): SomeInterface

}