package com.example.index.serviceimpl;

import com.example.componentservice.IndexService;
import com.example.george.dudu.base.BaseFragment;
import com.example.index.IndexFragment;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class IndexServiceImpl implements IndexService {
    @Override
    public BaseFragment getIndexFragment() {
        return IndexFragment.newInstance();
    }
}
