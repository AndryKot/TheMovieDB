package com.taidang.themoviedb.presentation.di.module

import com.taidang.themoviedb.domain.ConfigurationRepository
import com.taidang.themoviedb.domain.MovieRepository
import com.taidang.themoviedb.domain.SchedulerFactory
import com.taidang.themoviedb.domain.usecase.GetConfigUsecase
import com.taidang.themoviedb.domain.usecase.GetMovieDetailsUsecase
import com.taidang.themoviedb.domain.usecase.GetMoviesUsecase
import dagger.Module
import dagger.Provides

@Module
object UsecaseModule {

    @JvmStatic
    @Provides
    fun providesGetConfigUsecase(schedulerFactory: SchedulerFactory, configurationRepository: ConfigurationRepository): GetConfigUsecase {
        return GetConfigUsecase(schedulerFactory, configurationRepository)
    }

    @JvmStatic
    @Provides
    fun providesGetMoviesUsecase(schedulerFactory: SchedulerFactory, movieRepository: MovieRepository): GetMoviesUsecase {
        return GetMoviesUsecase(schedulerFactory, movieRepository)
    }

    @JvmStatic
    @Provides
    fun providesGetMovieDetailsUsecase(schedulerFactory: SchedulerFactory, movieRepository: MovieRepository): GetMovieDetailsUsecase {
        return GetMovieDetailsUsecase(schedulerFactory, movieRepository)
    }
}