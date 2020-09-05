package com.example.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Fruitsadapter extends BaseAdapter {

    Context context;
    ArrayList<String>names;

    public Fruitsadapter(Context context, ArrayList<String> names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        v= LayoutInflater.from(context).inflate(R.layout.rootlayout,viewGroup,false);
        TextView tname=v.findViewById(R.id.tname);

        tname.setText(names.get(i));
        return v;
    }
}
