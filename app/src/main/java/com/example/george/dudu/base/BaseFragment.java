package com.example.george.dudu.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by George on 2017/12/12.
 */

public class BaseFragment extends Fragment {
    protected static String TAG;

    {
        TAG = this.getClass().getSimpleName();
    }

    final public AppCompatActivity getAppCompatActivity() {

        return ((AppCompatActivity) getActivity());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initActionBar(getAppCompatActivity().getSupportActionBar());
    }

    protected void initActionBar(ActionBar supportActionBar) {

    }
}
