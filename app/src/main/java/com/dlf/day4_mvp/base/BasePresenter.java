package com.dlf.day4_mvp.base;

import java.util.ArrayList;

public abstract class BasePresenter<V extends BaseView> {
    public V mView;
    public ArrayList<BaseModel> models = new ArrayList<>();

    public BasePresenter() {
        initModel();
    }

    public abstract void initModel();
    public void addModel(BaseModel model){
        models.add(model);
    }

    public void bindView(V mView) {
        this.mView = mView;
    }

    public void destroy(){
        mView = null;
        for (int i = 0; i < models.size(); i++) {
            BaseModel baseModel = models.get(i);
//            baseModel.
        }
    }
}
