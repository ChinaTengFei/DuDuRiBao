package com.example.indexcomponent;

import android.view.ViewGroup;

import com.example.george.dudu.BaseAdapter;
import com.example.george.dudu.util.UIUtils;
import com.example.indexcomponent.databinding.ItemIndexBinding;

/**
 * Created by George on 2017/12/12.
 */

public class IndexAdapter extends BaseAdapter<IndexBean,ItemIndexBinding> {

    @Override
    protected ItemIndexBinding createBinding(ViewGroup parent) {
        ItemIndexBinding binding = UIUtils.getBinding(parent.getContext(), R.layout.item_index);
        return binding;
    }

    @Override
    protected void bind(ItemIndexBinding binding, IndexBean item) {
        binding.setAge(item.getAge());
        binding.setName(item.getmName());
    }

    @Override
    protected boolean areItemsTheSame(IndexBean oldItem, IndexBean newItem) {
        return true;
    }

    @Override
    protected boolean areContentsTheSame(IndexBean oldItem, IndexBean newItem) {
        return true;
    }

}
