package com.example.rq.mvpdemo.prescriptiondetail;

import java.util.List;

import com.example.rq.mvpdemo.BasePresenter;
import com.example.rq.mvpdemo.BaseView;
import com.example.rq.mvpdemo.data.PrescriptionDetail;

/**
 * Created by a1056 on 2017/3/15.
 */

public interface PrescriptionDetailContract {
    interface view extends BaseView<presenter> {
        void initAdapter(List<PrescriptionDetail> prescriptionDetailList);
        void setSymptomName(String symptomName);
        void setSymptomIntro(String symptomIntro);
    }

    interface presenter extends BasePresenter {
        void getData(String diseaseName);
        void updateHeader();
    }
}
