package com.padc.classwork.padc_adapterbasedview_aho.data.models;

import com.padc.classwork.padc_adapterbasedview_aho.data.vos.EventVO;
import com.padc.classwork.padc_adapterbasedview_aho.network.dataagents.EventsDataAgent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventModelImpl extends BaseModel implements EventModel{

    //list - allowed duplicate
    //set - difficult to search

    private static EventModelImpl objInstance;
    private Map<Integer, EventVO> eventsDataRepository;

    private EventModelImpl(){
        eventsDataRepository = new HashMap<>();
    }

    public static EventModelImpl getObjInstance(){
        if(objInstance == null){
            objInstance = new EventModelImpl();
        }
        return objInstance;
    }

    //from network layer
    @Override
    public void getEvents(final GetEventsFromDataLayerDelegate delegate) {
        mDataAgent.getEvents(new EventsDataAgent.GetEventsFromNetworkDelegate() {
            @Override
            public void onSuccess(List<EventVO> events) {
                delegate.onSuccess(events);
            }

            @Override
            public void onFailure(String errorMessage) {
                delegate.onFailure(errorMessage);
            }
        });
    }
}
