package com.testapplication.jenkins_demo;

import android.widget.ImageView;

/**
 * Created by sagarkudale on 19/04/17.
 */

class MainPresenter {

    IMainAPI api;
    IMainView view;

    public MainPresenter(IMainView view, IMainAPI api) {
        this.view = view;
        this.api = api;
    }

    public void validateUserName() {
        String userName = view.getUserName();
        if (userName.length() >= 5) {
            view.validUsername();
        }
    }
}
