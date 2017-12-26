package com.example.discover.applike;

import com.example.componentservice.DiscoverService;
import com.example.discover.serviceimpl.DiscoverServiceImpl;
import com.examplle.component.componentlib.applicationlike.IApplicationLike;
import com.examplle.component.componentlib.router.Router;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class DiscoverAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(DiscoverService.class.getSimpleName(), new DiscoverServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(DiscoverService.class.getSimpleName());
    }
}
