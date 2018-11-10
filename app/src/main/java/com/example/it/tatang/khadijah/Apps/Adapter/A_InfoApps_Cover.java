package com.example.it.tatang.khadijah.Apps.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_Cover;
import com.example.it.tatang.khadijah.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 9/18/2018.
 */

public class A_InfoApps_Cover extends BaseAdapter {

    private ArrayList<M_InfoApps_Cover> data;
    private Context mContext;

    public A_InfoApps_Cover(Context mContext, ArrayList<M_InfoApps_Cover> m_InfoApps_Cover) {
        this.mContext = mContext;
        this.data = m_InfoApps_Cover;
    }

    private static class ViewHolder {
        private TextView gameName;
        private ImageView gameImage;

        public ViewHolder(View v) {
            gameImage = (ImageView) v.findViewById(R.id.image);
            gameName = (TextView) v.findViewById(R.id.name);
        }
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public M_InfoApps_Cover getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_infoapps_cover_items, null, false);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.gameName.setText(data.get(position).getName());
        Picasso.get().load(data.get(position).getImageSource()).into(viewHolder.gameImage);
//        convertView.setOnClickListener(onClickListener(position));
        return convertView;
    }


//    private View.OnClickListener onClickListener(final int position) {
//        return new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                final Dialog dialog = new Dialog(mContext);
//                dialog.setContentView(R.layout.activity_infoapps_cover_items_dialog);
//                dialog.setCancelable(true); // dimiss when touching outside
//                dialog.setTitle("Game Details");
//
//                TextView text = (TextView) dialog.findViewById(R.id.name);
//                text.setText(getItem(position).getName());
//                ImageView image = (ImageView) dialog.findViewById(R.id.image);
//                image.setImageResource(getItem(position).getImageSource());
//
//                dialog.show();
//            }
//        };
//    }

}
