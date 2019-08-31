package com.padc.classwork.padc_adapterbasedview_aho.data.models;

import com.padc.classwork.padc_adapterbasedview_aho.data.vos.EventVO;

import java.util.List;

public interface EventModel {

    void getEvents(GetEventsFromDataLayerDelegate delegate);

    //connection activity <-> data
    interface GetEventsFromDataLayerDelegate {
        void onSuccess(List<EventVO> events);
        void onFailure(String errorMessage);
    }
}
