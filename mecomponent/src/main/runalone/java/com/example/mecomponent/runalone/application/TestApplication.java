package com.example.mecomponent.runalone.application;

import com.example.george.dudu.BaseApplication;

/**
 * Created by mrzhang on 2017/6/20.
 */

public class TestApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        //如果isRegisterCompoAuto为false，则需要通过反射加载组件
//        Router.registerComponent("com.mrzhang.share.applike.ShareApplike");
    }

}
