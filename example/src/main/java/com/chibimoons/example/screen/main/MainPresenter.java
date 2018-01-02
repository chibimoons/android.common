package com.chibimoons.example.screen.main;

import com.chibimoons.common.base.IPresenter;
import com.chibimoons.common.base.IPresenterView;

import lombok.Setter;


public class MainPresenter implements IPresenter {

    @Setter
    private MainPresenterView presenterView;

    @Override
    public void start() {

    }

    @Override
    public void end() {

    }

    interface MainPresenterView extends IPresenterView {

    }
}
