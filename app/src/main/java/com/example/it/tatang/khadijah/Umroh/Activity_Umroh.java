package com.example.it.tatang.khadijah.Umroh;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;

import com.example.it.tatang.khadijah.Apps.Adapter.A_Umroh;
import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_Cover;
import com.example.it.tatang.khadijah.Apps.Model.M_Umroh;
import com.example.it.tatang.khadijah.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Activity_Umroh extends Fragment {

    @BindView(R.id.id_search_umrah)
    EditText id_search_umrah;

    @BindView(R.id.id_grid_umrah)
    GridView id_grid_umrah;

    A_Umroh a_umroh;
    ArrayList<M_Umroh> m_umrohs;

    public Activity_Umroh(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_umroh, container, false);
        ButterKnife.bind(this, root);
        DummyData();
        a_umroh = new A_Umroh(m_umrohs, getContext());
        id_grid_umrah.setAdapter(a_umroh);
        return root;
    }

    private void DummyData(){
        m_umrohs = new ArrayList<>();
        m_umrohs.add(new M_Umroh("Umroh Satu","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Solusa","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","10","Manasik"));
        m_umrohs.add(new M_Umroh("Umroh Dua","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Manogomi","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","05","-"));
        m_umrohs.add(new M_Umroh("Umroh Tiga","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Kerta","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","1","Manasik"));
        m_umrohs.add(new M_Umroh("Umroh Empat","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Yasa","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","10","-"));
        m_umrohs.add(new M_Umroh("Umroh Lima","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Denma","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","20","Manasik"));
        m_umrohs.add(new M_Umroh("Umroh Enam","https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg","Pt. Samsu","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","Close","2018-09","2018-06","50","-"));


    }
}
