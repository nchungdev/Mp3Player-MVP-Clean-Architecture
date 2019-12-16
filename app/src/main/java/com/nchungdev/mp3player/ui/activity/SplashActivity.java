package com.nchungdev.mp3player.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.nchungdev.domain.SplashInteractor;
import com.nchungdev.mp3player.presenter.base.SplashPresenter;
import com.nchungdev.mp3player.ui.view.SplashView;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenter<SplashView, SplashInteractor> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        mPresenter.onAttach(this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void openMainActivity() {
        final Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }
}
