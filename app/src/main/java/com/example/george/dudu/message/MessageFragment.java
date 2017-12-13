package com.example.george.dudu.message;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.dudu.R;
import com.example.george.dudu.UIUtils;
import com.example.george.dudu.base.BaseFragment;

/**
 * Created by George on 2017/12/12.
 */

public class MessageFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewDataBinding inflate =UIUtils.getBinding(inflater,R.layout.fragment_message,container,false);
        return inflate.getRoot();
    }

    public static MessageFragment newInstance() {

        Bundle args = new Bundle();

        MessageFragment fragment = new MessageFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
