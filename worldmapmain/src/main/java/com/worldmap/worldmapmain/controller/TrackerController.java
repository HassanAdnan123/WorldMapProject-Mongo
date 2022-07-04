package com.worldmap.worldmapmain.controller;
import com.worldmap.worldmapmain.dto.request.AddTrackerRequest;
import com.worldmap.commons.dto.response.BaseResponse;
import com.worldmap.commons.service.factory.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/tracker")
public class TrackerController {

    @Autowired
    TrackerService trackerService;

//    @PostMapping("/add")
//    public BaseResponse<Tracker> addTracker(@RequestBody AddTrackerRequest addTrackerRequest){
//        System.out.println("Add tracker was hit.");
//        return trackerService.addTracker(addTrackerRequest);
//    }

    @PostMapping("/add")
    public BaseResponse<String> addTracker(@RequestBody AddTrackerRequest addTrackerRequest){
        System.out.println("Add tracker was hit.");
        BaseResponse<String> baseResponse = new BaseResponse<>();
        baseResponse.setMessage("Add tracker.");
        return baseResponse;
    }

}
