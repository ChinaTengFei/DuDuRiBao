package com.example.george.dudu;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by George on 2017/12/12.
 */

public class UIUtils {
    public static View getView(Context context, int layoutid, ViewGroup root, boolean isAttach) {

        LayoutInflater systemService = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return systemService.inflate(layoutid, root, isAttach);
    }

    public static View getView(Context context, int layoutid, ViewGroup root) {
        return getView(context, layoutid, root, root == null);
    }

    public static View getView(Context context, int layoutid) {
        return getView(context, layoutid, null);
    }

    public static <T extends ViewDataBinding> T  getBinding(LayoutInflater inflater, int layoutid, ViewGroup container, boolean isAttach) {
        return DataBindingUtil.inflate(inflater, layoutid, container, isAttach);
    }

    public static <T extends ViewDataBinding> T  getBinding(LayoutInflater inflater, int layoutid, ViewGroup container) {
        return getBinding(inflater, layoutid, container, container == null);
    }

    public static <T extends ViewDataBinding> T  getBinding(LayoutInflater inflater, int layoutid) {
        return getBinding(inflater, layoutid, null);
    }

    public static <T extends ViewDataBinding> T  getBinding(Context context, int layoutid) {
        return getBinding(getLayoutInflater(context), layoutid, null);
    }

    public static LayoutInflater getLayoutInflater(Context context){
        LayoutInflater systemService = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return systemService;
    }


}
