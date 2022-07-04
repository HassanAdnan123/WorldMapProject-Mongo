package com.worldmap.worldmapmain.dto.request;

import lombok.Data;

@Data
public class AddTrackerRequest {
    private String serialNo;
    private String name;
    private String type;
}
