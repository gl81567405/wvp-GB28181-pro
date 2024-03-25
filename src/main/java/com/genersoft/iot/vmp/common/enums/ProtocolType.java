package com.genersoft.iot.vmp.common.enums;

public enum ProtocolType {
    HC("hc","海康私有协议"),
    Onvif("onvif","Onvif"),
    GB28181("gb28181","国标协议");

    private final String val;

    private final String desc;
    ProtocolType(String val, String desc) {
        this.val = val;
        this.desc = desc;
    }
    public String getVal() {
        return val;
    }

    public String getDesc() {
        return desc;
    }
}
