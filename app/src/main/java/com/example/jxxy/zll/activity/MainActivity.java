package com.example.jxxy.zll.activity;

import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.jxxy.zll.R;
import com.example.jxxy.zll.comm.BaseActivity;
import com.example.jxxy.zll.fragment.NavigationFragment;


public class MainActivity extends BaseActivity {

    @Override
    public @LayoutRes
    int getContentViewId(){
        return R.layout.activity_main;
    }
    @Override
    protected void initView(){
        super.initView();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.commit();
    }

}