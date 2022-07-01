package com.worldmap.commons.service.impl;

import com.worldmap.commons.dto.request.AddTrackerRequest;
import com.worldmap.commons.dto.response.BaseResponse;
import com.worldmap.commons.persistence.dao.TrackerRepository;
import com.worldmap.commons.persistence.entity.Tracker;
import com.worldmap.commons.service.factory.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackerServiceImpl implements TrackerService {

    @Autowired
    TrackerRepository trackerRepository;

    @Override
    public BaseResponse<Tracker> addTracker(AddTrackerRequest addTrackerRequest){
        BaseResponse<Tracker> baseResponse = new BaseResponse<>();
        Tracker tracker = trackerRepository.findBySerialNo(addTrackerRequest.getSerialNo());

        if(tracker == null){
            tracker.setName(addTrackerRequest.getName());
            tracker.setSerialNo(addTrackerRequest.getSerialNo());
            tracker.setType(addTrackerRequest.getType());
            trackerRepository.save(tracker);

            tracker = trackerRepository.findBySerialNo(addTrackerRequest.getSerialNo());
            baseResponse.setBody(tracker);
            baseResponse.setMessage("New tracker has been added with the following details. ");
            return baseResponse;
        }
        baseResponse.setBody(tracker);
        baseResponse.setMessage("Tracker already exists for provided Serial Number. ");
        return baseResponse;
    }
}
