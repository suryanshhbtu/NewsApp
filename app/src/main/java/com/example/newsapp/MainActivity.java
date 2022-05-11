package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mtech,msports,mentertainment;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    String api = "aa897433241549319b7b00f1ca7276c1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        //assign xml id to java id
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
//
        mhome = (TabItem) findViewById(R.id.home);  // TabItem -> Inside TabLayout -> activity_main.xml
        mscience = (TabItem)  findViewById(R.id.science);
        mhealth = (TabItem)  findViewById(R.id.health);
        mtech = (TabItem)  findViewById(R.id.technology);
        msports = (TabItem)  findViewById(R.id.sports);
        mentertainment = (TabItem)  findViewById(R.id.entertainment);

        ViewPager viewPager = (ViewPager) findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include); //  Inside TabLayout -> activity_main.xml
        // setting pager adapter
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);  // six seasons\\-> no of fragments
        viewPager.setAdapter(pagerAdapter);

        // if someone directly click on tech,etc. -> go to that fragment
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2
                        || tab.getPosition()==3 || tab.getPosition()==4 || tab.getPosition()==5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}