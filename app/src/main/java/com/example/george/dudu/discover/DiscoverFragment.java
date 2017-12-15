package com.example.george.dudu.discover;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.dudu.R;
import com.example.george.dudu.UIUtils;
import com.example.george.dudu.base.BaseFragment;
import com.example.george.dudu.databinding.FragmentDiscoverBinding;

/**
 * Created by George on 2017/12/12.
 */

public class DiscoverFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDiscoverBinding inflate = UIUtils.getBinding(inflater, R.layout.fragment_discover, container,false);


        return inflate.getRoot();
    }

    public static DiscoverFragment newInstance() {

        Bundle args = new Bundle();

        DiscoverFragment fragment = new DiscoverFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected void initActionBar(ActionBar supportActionBar) {
        super.initActionBar(supportActionBar);
        supportActionBar.setTitle("Discover");
    }
}
