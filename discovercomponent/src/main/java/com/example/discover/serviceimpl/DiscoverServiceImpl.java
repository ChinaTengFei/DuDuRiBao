package com.example.discover.serviceimpl;

import com.example.componentservice.DiscoverService;
import com.example.discover.DiscoverFragment;
import com.example.george.dudu.base.BaseFragment;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class DiscoverServiceImpl implements DiscoverService {

    @Override
    public BaseFragment getDiscoverFragment() {
        return DiscoverFragment.newInstance();
    }
}
