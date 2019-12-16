package com.nchungdev.mp3player.presenter.base

import com.nchungdev.domain.base.MvpInteractor
import com.nchungdev.mp3player.ui.view.MvpView

interface MvpPresenter<V : MvpView, I : MvpInteractor> {

    fun onAttach(view: V)

    fun onDetach()

    fun getMvpView(): V
}
