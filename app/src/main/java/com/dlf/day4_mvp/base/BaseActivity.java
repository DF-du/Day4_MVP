package com.dlf.day4_mvp.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView{
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        initPresenter();
        if (mPresenter != null) {
//            mPresenter.
        }
        initView();
        initData();
        initListener();
    }

    public abstract void initPresenter();

    public abstract void initListener();//点击事件

    public abstract void initData();//初始化数据

    public abstract void initView();//绑定控件

    public abstract int getLayout();//获取布局


}
