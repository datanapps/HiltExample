package com.hilt.hiltexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.create
import com.hilt.hiltexample.network.APIServices


@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

    @Provides
    fun provideBaseUrl(): String  = "https://datanapps.com/DNARestAPIs"


    @Provides
    fun provideRetrofit(baseUrl:String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .build();
    }

    @Provides
    fun provideApiService(retrofit: Retrofit) : APIServices = retrofit.create(APIServices::class.java)

}