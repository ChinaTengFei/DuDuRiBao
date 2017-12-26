package com.example.index.applike;


import com.example.componentservice.IndexService;
import com.example.index.serviceimpl.IndexServiceImpl;
import com.examplle.component.componentlib.applicationlike.IApplicationLike;
import com.examplle.component.componentlib.router.Router;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class IndexAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(IndexService.class.getSimpleName(), new IndexServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(IndexService.class.getSimpleName());
    }
}
