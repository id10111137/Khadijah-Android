package com.example.it.tatang.khadijah.Apps.quran;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it.tatang.khadijah.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 9/17/2018.
 */

public class Activity_quran extends Fragment {

    View root;

    public Activity_quran() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_alquran, container, false);
        ButterKnife.bind(this, root);
        return root;
    }
}
