package com.example.it.tatang.khadijah.Apps.InfoApps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.it.tatang.khadijah.Apps.Adapter.A_InfoApps_Cover;
import com.example.it.tatang.khadijah.Apps.Adapter.A_InfoApps_List;
import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_Cover;
import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_List;
import com.example.it.tatang.khadijah.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by Administrator on 9/17/2018.
 */

public class InfoApps extends Fragment {

    @BindView(R.id.coverflow)
    FeatureCoverFlow coverFlow;
    A_InfoApps_Cover a_infoApps_cover;
    A_InfoApps_List a_infoApps_list;
    ArrayList<M_InfoApps_Cover> m_InfoApps_covers;
    ArrayList<M_InfoApps_List> m_infoApps_lists;
    View root;

    @BindView(R.id.id_listview)
    ListView id_listview;

    public InfoApps() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_infoapps, container, false);
        ButterKnife.bind(this, root);
        settingDummyData();
        settingDummyDataListView();

        /*
            Cover In Page
         */

        a_infoApps_cover = new A_InfoApps_Cover(getContext(), m_InfoApps_covers);
        coverFlow.setAdapter(a_infoApps_cover);
        coverFlow.setOnScrollPositionListener(onScrollListener());

        /*
            List In Page
         */

        a_infoApps_list = new A_InfoApps_List(m_infoApps_lists, getContext());
        id_listview.setAdapter(a_infoApps_list);

        return root;
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
        m_InfoApps_covers.add(new M_InfoApps_Cover("https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Umroh Paket 5"));
    }

    private void settingDummyDataListView() {
        m_infoApps_lists = new ArrayList<>();
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
        m_infoApps_lists.add(new M_InfoApps_List("MaraGhita FM", "Close", "Project di buat untuk kebutuhan member radio mara", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg", "201306 - 201307", "Android Mobile Apps", "https://pbs.twimg.com/profile_images/927385916049461248/eC52BMxz_400x400.jpg"));
    }
}
