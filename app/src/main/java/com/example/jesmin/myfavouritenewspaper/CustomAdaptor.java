package com.example.jesmin.myfavouritenewspaper;

import android.content.Context;
import android.media.session.PlaybackState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdaptor extends BaseAdapter{
    String banglaPp[];
    int flags[];
    LayoutInflater inflater;

    public CustomAdaptor(Context context,String banglapaper[],int flags[])
    {
        banglaPp=banglapaper;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return banglaPp.length;
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
        image.setImageResource(flags[position]);
        banglapaper.setText(banglaPp[position]);

        return view;
    }
    String engPp;

}
