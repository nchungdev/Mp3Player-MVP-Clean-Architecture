
package com.nchungdev.mp3player.di.module;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.nchungdev.domain.SplashInteractor;
import com.nchungdev.domain.SplashInteractorImpl;
import com.nchungdev.mp3player.di.ActivityContext;
import com.nchungdev.mp3player.presenter.SplashPresenter;
import com.nchungdev.mp3player.presenter.SplashPresenterImpl;
import com.nchungdev.mp3player.ui.view.SplashView;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SplashInteractor provideSplashInteractor() {
        return new SplashInteractorImpl();
    }

    @Provides
    SplashPresenter<SplashView, SplashInteractor> provideSplashPresenter(@NonNull SplashInteractor interactor, @NonNull CompositeDisposable disposable) {
        return new SplashPresenterImpl<>(interactor, disposable);
    }
}
