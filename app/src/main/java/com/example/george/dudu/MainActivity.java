package com.example.george.dudu;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.componentservice.DiscoverService;
import com.example.componentservice.IndexService;
import com.example.george.dudu.base.BaseActivity;
import com.example.george.dudu.base.BaseFragment;
import com.example.george.dudu.databinding.ActivityMainBinding;
import com.example.george.dudu.helper.BottomNavigationViewHelper;
import com.example.george.dudu.me.MeFragment;
import com.example.george.dudu.message.MessageFragment;
import com.examplle.component.componentlib.router.Router;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final ArrayList<BaseFragment> baseFragments = new ArrayList<>();
        Router instance = Router.getInstance();
        IndexService indexService = (IndexService) instance.getService(IndexService.class.getSimpleName());
        DiscoverService discoverService = (DiscoverService) instance.getService(DiscoverService.class.getSimpleName());
//        MessageService messageService = (MessageService) instance.getService(MessageService.class.getSimpleName());
//        MeService meService = (MeService) instance.getService(MeService.class.getSimpleName());
        baseFragments.add(indexService.getIndexFragment());
        baseFragments.add(discoverService.getDiscoverFragment());
//        baseFragments.add(messageService.getMessageFragment());
//        baseFragments.add(meService.getMeFragment());
        baseFragments.add(MessageFragment.newInstance());
        baseFragments.add(MeFragment.newInstance());
        activityMainBinding.vpMain.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return baseFragments.get(position);
            }

            @Override
            public int getCount() {
                return baseFragments.size();
            }
        });
        BottomNavigationViewHelper.disableShiftMode(activityMainBinding.bnvBottomView);

        activityMainBinding.bnvBottomView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.menu_index:
                    activityMainBinding.vpMain.setCurrentItem(0);
                    break;
                case R.id.menu_discover:
                    activityMainBinding.vpMain.setCurrentItem(1);
                    break;
                case R.id.menu_message:
                    activityMainBinding.vpMain.setCurrentItem(2);
                    break;
                case R.id.menu_me:
                    activityMainBinding.vpMain.setCurrentItem(3);
                    break;

            }
            return true;
        });

    }
}
