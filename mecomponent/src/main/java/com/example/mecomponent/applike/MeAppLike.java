package com.example.mecomponent.applike;

import com.example.componentservice.MeService;
import com.example.mecomponent.serviceimpl.MeServiceImpl;
import com.examplle.component.componentlib.applicationlike.IApplicationLike;
import com.examplle.component.componentlib.router.Router;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class MeAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(MeService.class.getSimpleName(), new MeServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(MeService.class.getSimpleName());
    }
}
