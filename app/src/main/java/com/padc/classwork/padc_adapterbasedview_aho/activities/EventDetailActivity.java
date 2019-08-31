package com.padc.classwork.padc_adapterbasedview_aho.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.padc.classwork.padc_adapterbasedview_aho.R;
import com.padc.classwork.padc_adapterbasedview_aho.adapters.EventDetailImageAdapter;
import com.padc.classwork.padc_adapterbasedview_aho.network.dataagents.HttpUrlEventsDataAgentImpl;

public class EventDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        ViewPager vpEventDetailItems = findViewById(R.id.vp_event_detail_img);

        EventDetailImageAdapter adapter = new EventDetailImageAdapter();
        vpEventDetailItems.setAdapter(adapter);
    }
}
