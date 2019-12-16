package com.nchungdev.domain;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Completable;

public class SplashInteractorImpl implements SplashInteractor {

    @Inject
    public SplashInteractorImpl() {

    }

    @Override
    public Completable splashScreen() {
        return Completable.timer(1000, TimeUnit.MILLISECONDS);
    }
}
