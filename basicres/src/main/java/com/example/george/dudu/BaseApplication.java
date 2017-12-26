package com.example.george.dudu;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.george.dudu.base.BaseLifecycleFragment;

/**
 * Created by Administrator on 2017/12/25.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                BaseLifecycleFragment baseLifecycleFragment = new BaseLifecycleFragment();
                ((AppCompatActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(baseLifecycleFragment,true);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
