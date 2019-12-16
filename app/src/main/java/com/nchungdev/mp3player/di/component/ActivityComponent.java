package com.nchungdev.mp3player.di.component;

import com.nchungdev.mp3player.di.PerActivity;
import com.nchungdev.mp3player.di.module.ActivityModule;
import com.nchungdev.mp3player.ui.activity.LoginActivity;
import com.nchungdev.mp3player.ui.activity.MainActivity;
import com.nchungdev.mp3player.ui.activity.SplashActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

}
