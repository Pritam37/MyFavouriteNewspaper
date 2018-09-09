package com.example.jesmin.myfavouritenewspaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomLocal extends BaseAdapter {
    String localPp[];
    int flags3[];
    LayoutInflater inflater;

    public CustomLocal(Context context, String localpaper[], int flags[])
    {
        localPp=localpaper;
        this.flags3=flags;
        inflater=(LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return localPp.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.bangla_items,viewGroup,false);
        ImageView image =view.findViewById(R.id.imageView);
        TextView banglapaper =view.findViewById(R.id.txt_bangla);
        image.setImageResource(flags3[position]);
        banglapaper.setText(localPp[position]);
        return view;
    }
}
