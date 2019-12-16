package com.nchungdev.mp3player.di.component;

import android.app.Application;
import android.content.Context;

import com.nchungdev.mp3player.Mp3PlayerApp;
import com.nchungdev.mp3player.di.ApplicationContext;
import com.nchungdev.mp3player.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(Mp3PlayerApp app);

    @ApplicationContext
    Context context();

    Application application();
}