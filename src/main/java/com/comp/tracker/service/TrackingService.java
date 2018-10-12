package com.comp.tracker.service;

import java.util.List;

import com.comp.tracker.dto.Assession;
import com.comp.tracker.dto.Initiate;
import com.comp.tracker.dto.Labresult;
import com.comp.tracker.dto.Storage;

public interface TrackingService {
	
	public void initiate(Initiate initiate);
	public void assesion(List<Assession> assesionList);
	public void labresult(List<Labresult> labResultList);
	public void storage(List<Storage> storageList);

}
