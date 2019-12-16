package com.nchungdev.mp3player;

import android.app.Application;

import com.nchungdev.mp3player.di.component.ApplicationComponent;
import com.nchungdev.mp3player.di.component.DaggerApplicationComponent;
import com.nchungdev.mp3player.di.module.ApplicationModule;

public class Mp3PlayerApp extends Application {


    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
