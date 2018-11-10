package com.example.it.tatang.khadijah.Apps.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.it.tatang.khadijah.Apps.Model.M_Hajji;
import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_List;
import com.example.it.tatang.khadijah.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Administrator on 9/27/2018.
 */

public class A_Hajj extends ArrayAdapter<M_Hajji> {

    private Context context;
    private List<M_Hajji> dataSet = null;
    private ArrayList<M_Hajji> originDataSet = null;
    LayoutInflater inflater;

    private static class ViewHolder {
        ImageView id_image_hajj;
        CircleImageView id_image_hajj_close;
        TextView id_txt_judul;
        TextView id_txt_desc;
        TextView id_depart_arival;
        TextView id_qty_hajji;
    }

    public A_Hajj(ArrayList<M_Hajji> data, Context context) {
        super(context, R.layout.activity_hajji_items, data);
        this.dataSet = data;
        this.context = context;
        inflater = LayoutInflater.from(getContext());
        this.originDataSet = new ArrayList<>();
        this.originDataSet.addAll(data);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public M_Hajji getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final M_Hajji dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_hajji_items, parent, false);

            viewHolder.id_image_hajj = convertView.findViewById(R.id.id_image_hajj);
            viewHolder.id_image_hajj_close = convertView.findViewById(R.id.id_image_hajj_close);
            viewHolder.id_txt_judul = convertView.findViewById(R.id.id_txt_judul);
            viewHolder.id_txt_desc = convertView.findViewById(R.id.id_txt_desc);
            viewHolder.id_depart_arival  = convertView.findViewById(R.id.id_depart_arival);
            viewHolder.id_qty_hajji = convertView.findViewById(R.id.id_qty_hajji);

            result = convertView;
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Picasso.get().load(dataModel.getUrlImage()).into(viewHolder.id_image_hajj);
        Picasso.get().load("data:image/png;base64,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").into(viewHolder.id_image_hajj_close);

        viewHolder.id_txt_judul.setText(dataModel.getTitleHajj());
        viewHolder.id_txt_desc.setText(dataModel.getDescription());
        viewHolder.id_depart_arival.setText("Berangkat:"+dataModel.getDateArival()+", Pulang :"+dataModel.getDateDeparture());
        viewHolder.id_qty_hajji.setText("Qty Keberangkatan : "+dataModel.getQty());


        return convertView;
    }

}
