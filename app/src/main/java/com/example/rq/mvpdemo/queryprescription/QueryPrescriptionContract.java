package com.example.rq.mvpdemo.queryprescription;

import java.util.List;

import com.example.rq.mvpdemo.BasePresenter;
import com.example.rq.mvpdemo.BaseView;

/**
 * Created by a1056 on 2017/3/14.
 */

public interface QueryPrescriptionContract {
    interface view extends BaseView<presenter>{
        void showData(List<String> symptomList);
    }

    interface presenter extends BasePresenter{
        void getData();
    }
}
