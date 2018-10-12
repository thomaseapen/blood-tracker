package com.comp.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comp.tracker.dto.Assession;
import com.comp.tracker.dto.Initiate;
import com.comp.tracker.dto.Labresult;
import com.comp.tracker.dto.Storage;
import com.comp.tracker.service.TrackingService;

@RestController
@RequestMapping("/api/v1.0/")
public class TrackingController {
	
	@Autowired
	private TrackingService trackingService;
	
	@RequestMapping(value="/initiate",method=RequestMethod.POST)
	public void initiate(@RequestBody Initiate initiate, @RequestHeader(value="API-Uid") String apiUid, @RequestHeader(value="API-Key") String apiKey, @RequestHeader(value="Company-Client-URL") String companyClientUrl) {
		trackingService.initiate(initiate);
	}
	
	
	@RequestMapping(value="/assesion",method=RequestMethod.POST)
	public void assesion(@RequestBody List<Assession> assessionList, @RequestHeader(value="API-Uid") String apiUid, @RequestHeader(value="API-Key") String apiKey, @RequestHeader(value="Company-Client-URL") String companyClientUrl) {
		trackingService.assesion(assessionList);
	}
	
	@RequestMapping(value="/labresult",method=RequestMethod.POST)
	public void labresult(@RequestBody List<Labresult> labResultList, @RequestHeader(value="API-Uid") String apiUid, @RequestHeader(value="API-Key") String apiKey, @RequestHeader(value="Company-Client-URL") String companyClientUrl) {
		trackingService.labresult(labResultList);
	}
	
	@RequestMapping(value="/storage",method=RequestMethod.POST)
	public void storage(@RequestBody List<Storage> storageList, @RequestHeader(value="API-Uid") String apiUid, @RequestHeader(value="API-Key") String apiKey, @RequestHeader(value="Company-Client-URL") String companyClientUrl) {
		trackingService.storage(storageList);
	}

}
