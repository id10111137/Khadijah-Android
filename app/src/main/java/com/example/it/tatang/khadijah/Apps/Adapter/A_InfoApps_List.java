package com.example.it.tatang.khadijah.Apps.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.it.tatang.khadijah.Apps.Model.M_InfoApps_List;
import com.example.it.tatang.khadijah.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 9/18/2018.
 */

public class A_InfoApps_List extends ArrayAdapter<M_InfoApps_List> {

    private Context context;
    private List<M_InfoApps_List> dataSet = null;
    private ArrayList<M_InfoApps_List> originDataSet = null;
    LayoutInflater inflater;

    private static class ViewHolder {
        TextView ProjectNameProject;
        TextView ProjectStatusProject;
        TextView ProjectDescription;
        TextView ProjectUrlImage;
        TextView ProjectDate;
        TextView ProjectType;
        ImageView ProjectUrl;
    }

    public A_InfoApps_List(ArrayList<M_InfoApps_List> data, Context context) {
        super(context, R.layout.activity_infoapps_list_items, data);
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
    public M_InfoApps_List getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final M_InfoApps_List dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_infoapps_list_items, parent, false);

            viewHolder.ProjectUrl = convertView.findViewById(R.id.id_image_list);
            viewHolder.ProjectDate = convertView.findViewById(R.id.id_project_date);
            viewHolder.ProjectNameProject = convertView.findViewById(R.id.id_project_name);
            viewHolder.ProjectType = convertView.findViewById(R.id.id_project_type);
            viewHolder.ProjectStatusProject  = convertView.findViewById(R.id.id_project_status);
            viewHolder.ProjectUrlImage = convertView.findViewById(R.id.id_project_url);
            viewHolder.ProjectDescription = convertView.findViewById(R.id.txt_project_desc);

            result = convertView;
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Picasso.get().load(dataModel.getProjectUrlImage()).into(viewHolder.ProjectUrl);
        viewHolder.ProjectDate.setText("Project Start :"+dataModel.getProjectDate());
        viewHolder.ProjectNameProject.setText(dataModel.getProjectNameProject());
        viewHolder.ProjectType.setText(dataModel.getProjectType());
        viewHolder.ProjectStatusProject.setText(dataModel.getProjectStatusProject());
        viewHolder.ProjectUrlImage.setText(dataModel.getProjectUrlImage());
        viewHolder.ProjectDescription.setText(dataModel.getProjectDescription());

        return convertView;
    }


}
