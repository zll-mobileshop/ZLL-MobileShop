package com.example.jxxy.zll.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;

import com.example.jxxy.zll.R;
import com.example.jxxy.zll.comm.BaseFragment;

public class NavigationFragment extends BaseFragment implements View.OnClickListener {
    private ImageButton mTbHome;
    private ImageButton mTbCategory;
    private ImageButton mTbCart;
    private ImageButton mTbPersonal;
    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private PersonalFragment personalFragment;

    @Override
    public int getContentViewId() {
        return R.layout.fragment_navigation;
    }

    @Override
    protected void initView(View view) {
        super.initView(view);
        mTbHome = view.findViewById(R.id.ib_home);
        mTbCategory = view.findViewById(R.id.ib_category);
        mTbCart = view.findViewById(R.id.ib_cart);
        mTbPersonal = view.findViewById(R.id.ib_person);

        mTbHome.setOnClickListener(this);
        mTbCategory.setOnClickListener(this);
        mTbCart.setOnClickListener(this);
        mTbPersonal.setOnClickListener(this);
        select(mTbHome);
    }

    private void select(View v) {
        mTbHome.setImageResource(R.drawable.tab_item_home_normal);
        mTbCategory.setImageResource(R.drawable.tab_item_category_normal);
        mTbCart.setImageResource(R.drawable.tab_item_cart_normal);
        mTbPersonal.setImageResource(R.drawable.tab_item_personal_normal);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(homeFragment != null){
            fragmentTransaction.hide(homeFragment);
        }
        if(categoryFragment != null){
            fragmentTransaction.hide(categoryFragment);
        }
        if(cartFragment != null){
            fragmentTransaction.hide(cartFragment);
        }
        if(personalFragment != null){
            fragmentTransaction.hide(personalFragment);
        }
        switch (v.getId()){
            case R.id.ib_home:
                mTbHome.setImageResource(R.drawable.tab_item_home_focus);
                if(homeFragment == null){
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,homeFragment);
                }else{
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case R.id.ib_category:
                mTbCategory.setImageResource(R.drawable.tab_item_category_focus);
                if(categoryFragment == null) {
                    categoryFragment = new CategoryFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,categoryFragment);
                }else{
                    fragmentTransaction.show(categoryFragment);
                }
                break;
            case R.id.ib_cart:
                mTbCart.setImageResource(R.drawable.tab_item_cart_focus);
                if(cartFragment == null){
                    cartFragment = new CartFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,cartFragment);
                }else{
                    fragmentTransaction.show(cartFragment);
                }
                break;
            case R.id.ib_person:
                mTbPersonal.setImageResource(R.drawable.tab_item_personal_focus);
                if(personalFragment == null){
                    personalFragment = new PersonalFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,personalFragment);
                }else{
                    fragmentTransaction.show(personalFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        select(v);
    }
}

