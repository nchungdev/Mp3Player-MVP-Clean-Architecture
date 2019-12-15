package com.nchungdev.mp3player.presenter

import com.nchungdev.mp3player.ui.view.BaseView
import com.nchungdev.usecase.BaseInteractor

interface BasePresenter<V : BaseView, I : BaseInteractor> {

    fun onAttach(view: V)

    fun onDetach()

    fun getMvpView(): V

    fun getInteractor(): I
}