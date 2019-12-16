package com.nchungdev.mp3player.presenter;

import androidx.annotation.NonNull;

import com.nchungdev.domain.SplashInteractor;
import com.nchungdev.mp3player.presenter.base.BasePresenter;
import com.nchungdev.mp3player.ui.view.SplashView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class SplashPresenterImpl<V extends SplashView, I extends SplashInteractor> extends BasePresenter<V, I> implements SplashPresenter<V, I> {

    @NonNull
    private final SplashInteractor interactor;

    @Inject
    public SplashPresenterImpl(@NonNull final SplashInteractor interactor, @NonNull CompositeDisposable disposable) {
        super(disposable);
        this.interactor = interactor;
    }

    @Override
    public void onAttach(@NotNull V view) {
        super.onAttach(view);
        final Disposable disposable = interactor.splashScreen().subscribe(() -> getMvpView().openMainActivity());
        getCompositeDisposable().add(disposable);
    }
}
