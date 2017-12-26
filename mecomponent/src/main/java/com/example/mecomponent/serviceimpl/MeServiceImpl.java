package com.example.mecomponent.serviceimpl;

import com.example.componentservice.MeService;
import com.example.george.dudu.base.BaseFragment;
import com.example.mecomponent.MeFragment;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class MeServiceImpl implements MeService {

    @Override
    public BaseFragment getMeFragment() {
        return MeFragment.newInstance();
    }
}
