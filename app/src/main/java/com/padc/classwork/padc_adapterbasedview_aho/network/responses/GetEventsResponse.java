package com.padc.classwork.padc_adapterbasedview_aho.network.responses;

import com.padc.classwork.padc_adapterbasedview_aho.data.vos.EventVO;

import java.util.List;

public class GetEventsResponse {

    private String message;
    private String code;
    private List<EventVO> eventList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<EventVO> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventVO> eventList) {
        this.eventList = eventList;
    }
}
