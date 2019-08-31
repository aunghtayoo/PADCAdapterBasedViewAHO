package com.padc.classwork.padc_adapterbasedview_aho.data.models;

import com.padc.classwork.padc_adapterbasedview_aho.network.dataagents.EventsDataAgent;
import com.padc.classwork.padc_adapterbasedview_aho.network.dataagents.HttpUrlEventsDataAgentImpl;

public abstract class BaseModel {

    protected EventsDataAgent mDataAgent;

    BaseModel(){
        mDataAgent = HttpUrlEventsDataAgentImpl.getObjInstance();
    }
}
