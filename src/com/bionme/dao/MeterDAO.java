package com.bionme.dao;

import java.util.List;
import com.bionme.domain.Meter;

public interface MeterDAO {
	
	public void saveMeter(Meter meter) ;
	public List<Meter> listMeter() ;

}
