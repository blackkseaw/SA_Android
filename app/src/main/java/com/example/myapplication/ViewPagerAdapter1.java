package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter1 extends PagerAdapter {

    Context context;
    //    int images[] = {
//
//            R.drawable.image1,
//            R.drawable.image2,
//            R.drawable.book
//
//
//};
    int titles[] = {

            R.string.aprenderAnimaisTitleInfo1,
            R.string.aprenderAnimaisTitleInfo2,
            R.string.aprenderAnimaisTitleInfo3

    };

    int description[] = {

            R.string.aprenderAnimaisInfo1,
            R.string.aprenderAnimaisInfo2,
            R.string.aprenderAnimaisInfo3
    };

    public ViewPagerAdapter1(Context context){

        this.context = context;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }




    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout , container,false);

//        ImageView slidetitleimage = (ImageView) view.findViewById(R.id.titleImage);
        TextView slideTitle = (TextView) view.findViewById(R.id.textTitle);
        TextView slideDesciption = (TextView) view.findViewById(R.id.textDesccription);

//        slidetitleimage.setImageResource(images[position]);
        slideTitle.setText(titles[position]);
        slideDesciption.setText(description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}
