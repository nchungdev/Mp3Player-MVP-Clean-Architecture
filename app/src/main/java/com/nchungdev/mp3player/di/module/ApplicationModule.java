package com.nchungdev.mp3player.di.module;

import android.app.Application;
import android.content.Context;

import com.nchungdev.data.BuildConfig;
import com.nchungdev.mp3player.di.ApiInfo;
import com.nchungdev.mp3player.di.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }
}
