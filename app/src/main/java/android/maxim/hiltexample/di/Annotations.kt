package android.maxim.hiltexample.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class SomeInterfaceFirstImpl

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class SomeInterfaceSecondImpl