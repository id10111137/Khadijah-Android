package com.example.it.tatang.khadijah.Apps.SignUp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it.tatang.khadijah.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 9/12/2018.
 */

public class Activity_Biodata_Register extends Fragment {

    public Activity_Biodata_Register(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_biodata_register, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

}
