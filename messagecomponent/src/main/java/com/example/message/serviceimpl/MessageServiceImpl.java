package com.example.message.serviceimpl;

import com.example.componentservice.MessageService;
import com.example.george.dudu.base.BaseFragment;
import com.example.message.MessageFragment;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class MessageServiceImpl implements MessageService {
    @Override
    public BaseFragment getMessageFragment() {
        return MessageFragment.newInstance();
    }
}
