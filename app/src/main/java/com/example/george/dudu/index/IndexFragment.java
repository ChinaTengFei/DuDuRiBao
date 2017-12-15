package com.example.george.dudu.index;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.dudu.R;
import com.example.george.dudu.UIUtils;
import com.example.george.dudu.base.BaseFragment;
import com.example.george.dudu.bean.IndexBean;
import com.example.george.dudu.databinding.FragmentIndexBinding;
import com.example.george.dudu.ui.adapter.IndexAdapter;

import java.util.ArrayList;

/**
 * Created by George on 2017/12/12.
 */

public class IndexFragment extends BaseFragment {

    private FragmentIndexBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIUtils.getBinding(getContext(), R.layout.fragment_index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = UIUtils.getBinding(getContext(), R.layout.fragment_index);
        binding.rvIndex.setAdapter(new IndexAdapter());
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<IndexBean> indexBeans = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            indexBeans.add(new IndexBean("name:"+i,i));
        }
        ((IndexAdapter) binding.rvIndex.getAdapter()).replace(indexBeans);
    }

    @Override
    protected void initActionBar(ActionBar supportActionBar) {
        super.initActionBar(supportActionBar);
        supportActionBar.setTitle("Index");
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_action_index,menu);
    }

    public static IndexFragment newInstance() {
        Bundle args = new Bundle();
        IndexFragment fragment = new IndexFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
