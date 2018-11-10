package com.example.it.tatang.khadijah.Apps.Controller;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.it.tatang.khadijah.Apps.InfoApps.InfoApps;
import com.example.it.tatang.khadijah.Apps.quran.Activity_quran;
import com.example.it.tatang.khadijah.Apps.SignUp.Activity_Biodata_Login;
import com.example.it.tatang.khadijah.Apps.SignUp.Activity_Biodata_Register;
import com.example.it.tatang.khadijah.Hajji.Activity_Hajji;
import com.example.it.tatang.khadijah.Home.Activity_Home;
import com.example.it.tatang.khadijah.R;
import com.example.it.tatang.khadijah.Umroh.Activity_Umroh;

/**
 * Created by Administrator on 9/17/2018.
 */

public class C_Main {

    private Context mContext;
    Fragment fragment;
    CharSequence setTitle;
    private static C_Main mInstance;
    Bundle bundle;
    C_Nv CNv;

    private C_Main(Context context) {
        mContext = context;
    }

    public static synchronized C_Main getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new C_Main(context);
        }
        return mInstance;
    }

    public Fragment ChooseMenu(int id) {
        fragment = null;
        bundle = new Bundle();
        switch (id) {
            case R.id.menu_home:
                bundle.putString("menu_nv", "01");
                CNv = new C_Nv();
                CNv.setArguments(bundle);
                fragment = CNv;
                break;
            case R.id.menu_alquran:
                fragment = new Activity_quran();
                break;
            case R.id.menu_signup:
                bundle.putString("menu_nv", "03");
                CNv = new C_Nv();
                CNv.setArguments(bundle);
                fragment = CNv;
                break;
            case R.id.menu_hajji:
                fragment = new Activity_Hajji();
                break;
            case R.id.menu_umroh:
                fragment = new Activity_Umroh();
                break;
            case R.id.menu_apps_info:
                fragment = new InfoApps();
                break;
            default:
                bundle.putString("menu_nv", "01");
                CNv = new C_Nv();
                CNv.setArguments(bundle);
                fragment = CNv;
                break;
        }
        return fragment;
    }

    public Fragment ChooseNv(int id) {
        fragment = null;
        switch (id) {
            case R.id.mLogin:
                fragment = new Activity_Biodata_Login();
                break;
            case R.id.mRegister:
                fragment = new Activity_Biodata_Register();
                break;
            case R.id.mHomes:
                fragment = new Activity_Home();
                break;
            case R.id.mUmroh:
                fragment = new Activity_Umroh();
                break;
            case R.id.mHajj:
                fragment = new Activity_Hajji();
                break;
        }
        return fragment;
    }

    public CharSequence setTitle(String id){
        setTitle = null;
            if (id.equals("01")){
                setTitle = "Khadijah-Apps";
            }else if(id.equals("03")){
                setTitle = "SignUp";
            }
        return setTitle;
    }
}
