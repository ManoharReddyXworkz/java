package com.xworkz.Bars.runner;

import com.xworkz.Bars.dao.BarDao;
import com.xworkz.Bars.dao.BarDaoImpl;
import com.xworkz.Bars.dto.BarDto;

public class RunnerBar {

public static void main(String[] args) {
		
		Double avrCollectionPerDay = 27000.00;
		Double avrCollectionPerMonth = avrCollectionPerDay*3;
		
		BarDto dto6 = new BarDto();
		
//		BarDTO dto6 = new BarDTO(5,"PumpHouse","Jp-Nagar","",avrCollectionPerDay,avrCollectionPerMonth);
		
		BarDto dto = new BarDto();
		dto.setId(1);
		dto.setBarName("Shilpa");
		dto.setLocation("BTM");
		dto.getType().getBar();
		dto.setAvrCollectionPerDay(avrCollectionPerDay);
		dto.setAvrCollectionPerMonth(avrCollectionPerMonth);

		BarDto dto1 = new BarDto();
		dto1.setId(4);
		dto1.setBarName("JQubes");
		dto1.setLocation("BSK");
		dto1.getType().getBar();
		dto1.setAvrCollectionPerDay(avrCollectionPerDay);
		dto1.setAvrCollectionPerMonth(avrCollectionPerMonth);
		
		BarDto dto2 = new BarDto();
		dto2.setId(5);
		dto2.setBarName("1522");
		dto2.setLocation("Jp-Nager");
		dto2.getType().getBar();
		dto2.setAvrCollectionPerDay(avrCollectionPerDay);
		dto2.setAvrCollectionPerMonth(avrCollectionPerMonth);
		

		BarDto dto3 = new BarDto();
		dto3.setId(2);
		dto3.setBarName("Drink & Dive");
		dto3.setLocation("RR-Nager");
		dto3.getType().getBar();
		dto3.setAvrCollectionPerDay(avrCollectionPerDay);
		dto3.setAvrCollectionPerMonth(avrCollectionPerMonth);

		BarDto dto4 = new BarDto();
		dto4.setId(3);
		dto4.setBarName("Stories");
		dto4.setLocation("Jp-Nager");
		dto4.getType().getBar();
		dto4.setAvrCollectionPerDay(avrCollectionPerDay);
		dto4.setAvrCollectionPerMonth(avrCollectionPerMonth);
		


		
		BarDao barDAO = new BarDaoImpl();
		BarDao.save(dto);
		BarDao.save(dto1);
		BarDao.save(dto2);
		BarDao.save(dto3);
		BarDao.save(dto4);
	}
}
