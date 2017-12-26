package com.example.george.dudu;

import com.examplle.component.componentlib.router.Router;

/**
 * Created by Administrator on 2017/12/16.
 */
public class App extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Router.registerComponent("com.example.indexcomponent.applike.IndexAppLike");
        Router.registerComponent("com.example.discover.applike.DiscoverAppLike");
    }
}
