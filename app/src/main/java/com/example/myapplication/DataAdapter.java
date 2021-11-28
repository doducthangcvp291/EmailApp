package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<data> dataList;

    public DataAdapter(Context context, int layout, List<data> dataList) {
        this.context = context;
        this.layout = layout;
        this.dataList = dataList;
    }


    @Override
    public int getCount() {
        return dataList.size();
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        TextView fistofname = (TextView) convertView.findViewById(R.id.textView);
        TextView name = (TextView)  convertView.findViewById(R.id.name);
        TextView date = (TextView)  convertView.findViewById(R.id.date);
        TextView log = (TextView)  convertView.findViewById(R.id.text);
        data Data = dataList.get(position);


        name.setText(Data.getName());
        fistofname.setText(Data.getFistofname());
        date.setText(Data.getDate());
        log.setText(Data.getLog());



        return convertView;
    }
}
