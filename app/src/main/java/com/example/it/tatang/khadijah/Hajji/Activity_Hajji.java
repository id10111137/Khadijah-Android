package com.example.it.tatang.khadijah.Hajji;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.example.it.tatang.khadijah.Apps.Adapter.A_Hajj;
import com.example.it.tatang.khadijah.Apps.Model.M_Hajji;
import com.example.it.tatang.khadijah.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Activity_Hajji extends Fragment {

    @BindView(R.id.id_search_hajji)
    EditText id_search_hajj;

    @BindView(R.id.id_hajj_lv)
    ListView id_hajj_lv;
    View root;

    ArrayList<M_Hajji> m_hajjis;
    A_Hajj a_hajj;

    public Activity_Hajji() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_hajji, container, false);
        ButterKnife.bind(this, root);
        DammyData();
        a_hajj = new A_Hajj(m_hajjis, getContext());
        id_hajj_lv.setAdapter(a_hajj);
        return root;
    }

    private void DammyData() {
        m_hajjis = new ArrayList<>();
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));
        m_hajjis.add(new M_Hajji(
                "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Close",
                "2018-06", "2018-08", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "PT. TRISULA SEMESTA", "50", "Hajj Plus"));

    }
}
