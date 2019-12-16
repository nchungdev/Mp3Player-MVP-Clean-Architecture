package com.nchungdev.domain;

import com.nchungdev.domain.base.MvpInteractor;

import io.reactivex.Completable;

public interface SplashInteractor extends MvpInteractor {

    Completable splashScreen();
}
