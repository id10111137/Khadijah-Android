package com.example.it.tatang.khadijah.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.it.tatang.khadijah.Apps.Adapter.A_InfoApps_Cover;
import com.example.it.tatang.khadijah.Apps.Fasilitas.F_Agency;
import com.example.it.tatang.khadijah.Apps.Fasilitas.F_Fasilitas;
import com.example.it.tatang.khadijah.Apps.Fasilitas.F_Member;
import com.example.it.tatang.khadijah.Apps.Fasilitas.F_PaketBox;
import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_Cover;
import com.example.it.tatang.khadijah.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class Activity_Home extends Fragment {

    @BindView(R.id.coverflow)
    FeatureCoverFlow coverFlow;
    A_InfoApps_Cover a_infoApps_cover;
    ArrayList<M_InfoApps_Cover> m_InfoApps_covers;

    public Activity_Home(){ }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_home, container, false);
        ButterKnife.bind(this, root);
        settingDummyData();
        a_infoApps_cover = new A_InfoApps_Cover(getContext(), m_InfoApps_covers);
        coverFlow.setAdapter(a_infoApps_cover);
        coverFlow.setOnScrollPositionListener(onScrollListener());
        return root;
    }


    @OnClick(R.id.bankcardId)
    public void a(View view) {
      Intent  intent;
        intent = new Intent(getActivity(), F_Fasilitas.class);
        startActivity(intent);
    }

    @OnClick(R.id.bankcardId2)
    public void b(View view) {
        Intent  intent;
        intent = new Intent(getActivity(), F_PaketBox.class);
        startActivity(intent);
    }

    @OnClick(R.id.bankcardI3)
    public void c(View view) {
        Intent  intent;
        intent = new Intent(getActivity(), F_Member.class);
        startActivity(intent);
    }

    @OnClick(R.id.bankcardId4)
    public void d(View view) {
        Intent  intent;
        intent = new Intent(getActivity(), F_Agency.class);
        startActivity(intent);
    }



    private FeatureCoverFlow.OnScrollPositionListener onScrollListener() {
        return new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.v("MainActiivty", "position: " + position);
            }
            @Override
            public void onScrolling() {
                Log.i("MainActivity", "scrolling");
            }
        };
    }

    private void settingDummyData() {
        m_InfoApps_covers = new ArrayList<>();
        m_InfoApps_covers.add(new M_InfoApps_Cover("https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Umroh Paket 1"));
        m_InfoApps_covers.add(new M_InfoApps_Cover("https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Umroh Paket 2"));
        m_InfoApps_covers.add(new M_InfoApps_Cover("https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Umroh Paket 3"));
        m_InfoApps_covers.add(new M_InfoApps_Cover("https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Umroh Paket 4"));
    }
}
