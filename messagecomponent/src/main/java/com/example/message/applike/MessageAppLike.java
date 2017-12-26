package com.example.message.applike;


import com.example.componentservice.MessageService;
import com.example.message.serviceimpl.MessageServiceImpl;
import com.examplle.component.componentlib.applicationlike.IApplicationLike;
import com.examplle.component.componentlib.router.Router;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class MessageAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(MessageService.class.getSimpleName(), new MessageServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(MessageService.class.getSimpleName());
    }
}
