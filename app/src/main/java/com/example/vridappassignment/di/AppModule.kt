package com.example.vridappassignment.di

import androidx.annotation.Keep
import com.example.vridappassignment.data.datasource.BlogDataSource
import com.example.vridappassignment.data.repository.BlogRepository
import com.example.vridappassignment.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Keep
@InstallIn(SingletonComponent::class)
@Module
object AppModule {

  @Provides
  fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
      .baseUrl("https://blog.vrid.in/wp-json/wp/v2/")
      .addConverterFactory(GsonConverterFactory.create())
      .build()
  }

  @Provides
  fun provideApiService(retrofit: Retrofit): ApiService {
    return retrofit.create(ApiService::class.java)
  }

  @Provides
  fun provideDataSource(apiService: ApiService): BlogDataSource {
    return BlogDataSource(apiService)
  }

  @Provides
  fun provideMovieRepository(blogDataSource: BlogDataSource): BlogRepository {
    return BlogRepository(blogDataSource)
  }
}
