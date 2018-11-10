package com.example.it.tatang.khadijah.Apps.Controller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.it.tatang.khadijah.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 9/12/2018.
 */

public class C_Nv extends Fragment {

    @BindView(R.id.btn_navigation_mInfo)
    BottomNavigationView btn_navigation_mInfo;
    Fragment fragment;
    View root;
    Menu menu;
    String parsingdata;
    Bundle bundle;

    public C_Nv() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        bundle = this.getArguments();
        if (bundle != null) {
            parsingdata = bundle.getString("menu_nv");
        }
        root = inflater.inflate(R.layout.activity_biodata_controller, container, false);
        ButterKnife.bind(this, root);
        if (parsingdata.equals("01")) {
            btn_navigation_mInfo.inflateMenu(R.menu.member_menu);
        } else if (parsingdata.equals("03")) {
            btn_navigation_mInfo.inflateMenu(R.menu.biodata_menu);
        }
        setupNavigationView();
        return root;
    }


    private void setupNavigationView() {

        if (btn_navigation_mInfo != null) {

            // Select first menu item by default and show Fragment accordingly.
            menu = btn_navigation_mInfo.getMenu();
            selectmInfo(menu.getItem(0));

            // Set action to perform when any menu-item is selected.
            btn_navigation_mInfo.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            selectmInfo(item);
                            return false;
                        }
                    });
        }
    }

    protected void selectmInfo(MenuItem item) {
        item.setChecked(true);
        pushFragment(C_Main.getInstance(getContext()).ChooseNv(item.getItemId()));
    }

    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;

        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.frame_mInfo, fragment);
                ft.commit();
            }
        }
    }
}
