package com.worldmap.commons.service.factory;

import com.worldmap.commons.dto.request.AddTrackerRequest;
import com.worldmap.commons.dto.response.BaseResponse;
import com.worldmap.commons.persistence.entity.Tracker;

public interface TrackerService {

    public BaseResponse<Tracker> addTracker(AddTrackerRequest addTrackerRequest);
}
