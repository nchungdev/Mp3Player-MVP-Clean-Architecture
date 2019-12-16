package com.nchungdev.mp3player.presenter.base;

import androidx.annotation.NonNull;

import com.nchungdev.domain.base.MvpInteractor;
import com.nchungdev.mp3player.ui.view.MvpView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends MvpView, I extends MvpInteractor> implements MvpPresenter<V, I> {
    private V mView;
    private CompositeDisposable mDisposable;

    @Inject
    public BasePresenter(@NonNull final CompositeDisposable disposable) {
        mDisposable = disposable;
    }

    @Override
    public void onAttach(@NotNull V view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mDisposable.clear();
        mView = null;
    }

    @NonNull
    @Override
    public V getMvpView() {
        return mView;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mDisposable;
    }
}
