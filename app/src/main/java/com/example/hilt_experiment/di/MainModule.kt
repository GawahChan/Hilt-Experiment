package com.example.hilt_experiment.di

import com.example.hilt_experiment.repositories.MainRepository
import com.example.hilt_experiment.repositories.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
abstract class MainModule {

    companion object {
        @Provides
        fun provideString(): String {
            return "hello from DI"
        }
    }

    @Binds
    abstract fun bindMainRepository(
        impl: MainRepositoryImpl
    ): MainRepository
}