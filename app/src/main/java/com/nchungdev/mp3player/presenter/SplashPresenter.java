package com.nchungdev.mp3player.presenter;

import com.nchungdev.domain.base.MvpInteractor;
import com.nchungdev.mp3player.presenter.base.MvpPresenter;
import com.nchungdev.mp3player.ui.view.MvpView;

public interface SplashPresenter<V extends MvpView, I extends MvpInteractor> extends MvpPresenter<V, I> {
}
