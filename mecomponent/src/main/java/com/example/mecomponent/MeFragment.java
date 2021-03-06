package com.example.mecomponent;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.dudu.base.BaseFragment;
import com.example.george.dudu.util.UIUtils;

/**
 * Created by George on 2017/12/12.
 */

public class MeFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewDataBinding inflate = UIUtils.getBinding(inflater, R.layout.fragment_me,container,false);
        return inflate.getRoot();
    }


    public static MeFragment newInstance() {

        Bundle args = new Bundle();

        MeFragment fragment = new MeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initActionBar(ActionBar supportActionBar) {
        super.initActionBar(supportActionBar);
        supportActionBar.setTitle("Me");
    }
}
