package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tutorial extends AppCompatActivity {

    ViewPager mSlideViewPager;
    LinearLayout mDotLayout;
    Button backbtn, nextbtn;

    TextView[] dots;
    ViewPagerAdapter1 viewPagerAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        backbtn = findViewById(R.id.backbtn);
        nextbtn = findViewById(R.id.nextbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (getItem(0) > 0){
                    mSlideViewPager.setCurrentItem(getItem(-1), true);
                }

            }

        });

        nextbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (getItem(0) < 2){
                    mSlideViewPager.setCurrentItem(getItem(1), true);
                } else {
                    Intent intent = new Intent(Tutorial.this, Main2Activity.class);
                    startActivity(intent);
                    finish();
                }

            }

        });

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_layout);

        viewPagerAdapter1 = new ViewPagerAdapter1(this);

        mSlideViewPager.setAdapter(viewPagerAdapter1);

        setUpindicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

    }

    public void setUpindicator(int position){

        dots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0 ; i < dots.length ; i++){

            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.green_light,getApplicationContext().getTheme()));
            mDotLayout.addView(dots[i]);
        }

        dots[position].setTextColor(getResources().getColor(R.color.green_dark,getApplicationContext().getTheme()));

    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);

            if (position > 0){

                backbtn.setVisibility(View.VISIBLE);

            }else {

                backbtn.setVisibility(View.INVISIBLE);

            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getItem(int i){

        return mSlideViewPager.getCurrentItem() + i;
    }

}
