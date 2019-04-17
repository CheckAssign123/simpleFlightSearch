package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.helper.Constants;
import com.example.demo.helper.ResultInfo;

public class FlightInfoServiceImpl implements FlightInfoService{

	

	@Override
	public ResultInfo getFlightInfobyOrginDestinationAndDate(String flightNum, String Origin, String Destination, String fromDate)
			throws Exception {
		
		Map<String, String > FInfo= new HashMap<String, String>();
		ResultInfo resultInfo = new ResultInfo();
		
		if((Origin.equalsIgnoreCase(Constants.UA2005) || 
				(Origin.equalsIgnoreCase(Constants.IAH) && 
						Destination.equalsIgnoreCase(Constants.ORD))) && 
				                        fromDate.equalsIgnoreCase("2018-01-31") ) {

			FInfo.put("flightNumber", "2005");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T05:10:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T07:57:00");
			FInfo.put("aircraft", "Airbus A320");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:47");
			FInfo.put("status", "Arrived at Gate");
			resultInfo.setFlightInfo(FInfo);
		
		}else if(flightNum.equalsIgnoreCase(Constants.UA0638) ||
				(Origin.equalsIgnoreCase(Constants.IAH) && 
				      Destination.equalsIgnoreCase(Constants.ORD)) && 
				                   fromDate.equalsIgnoreCase("2018-01-31")  ) {
			
			
			FInfo.put("flightNumber", "0638");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T05:10:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T07:57:00");
			FInfo.put("aircraft", "Boeing 737-900");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:33");
			FInfo.put("status", "Arrived at Gate");
			resultInfo.setFlightInfo(FInfo);
			
		}else if(flightNum.equalsIgnoreCase(Constants.UA1160) ||
				(Origin.equalsIgnoreCase(Constants.IAH) && 
					      Destination.equalsIgnoreCase(Constants.ORD)) 
									&& fromDate.equalsIgnoreCase("2018-01-31")  ) {
			
			
			FInfo.put("flightNumber", "0638");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T05:10:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T07:57:00");
			FInfo.put("aircraft", "Boeing 737-900");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:33");
			FInfo.put("status", "Arrived at Gate");
			resultInfo.setFlightInfo(FInfo);
			
		}else if(flightNum.equalsIgnoreCase(Constants.UA1256) ||
				(Origin.equalsIgnoreCase(Constants.IAH) && 
					      Destination.equalsIgnoreCase(Constants.ORD))
									&& fromDate.equalsIgnoreCase("2018-01-31")  ) {
			
			FInfo.put("flightNumber", "1256");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T14:22:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T17:01:00");
			FInfo.put("aircraft", "Boeing 737-800");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:41");
			FInfo.put("status", "On Time");
			resultInfo.setFlightInfo(FInfo);
			
		}else if(flightNum.equalsIgnoreCase(Constants.UA2153)  ||
				(Origin.equalsIgnoreCase(Constants.IAH) && 
					      Destination.equalsIgnoreCase(Constants.ORD))&&
										fromDate.equalsIgnoreCase("2018-01-31") ) {
			
			FInfo.put("flightNumber", "2153");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T05:10:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T07:57:00");
			FInfo.put("aircraft", "Boeing 737-800");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:47");
			FInfo.put("status", "On Time");
			resultInfo.setFlightInfo(FInfo);
			
		}else if(flightNum.equalsIgnoreCase(Constants.UA2155)  ||
				(Origin.equalsIgnoreCase(Constants.IAH) && 
					      Destination.equalsIgnoreCase(Constants.ORD))
									&& fromDate.equalsIgnoreCase("2018-01-31")  ) {
			
			FInfo.put("flightNumber", "2155");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T18:10:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T07:57:00");
			FInfo.put("aircraft", "Boeing 737-900");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:39");
			FInfo.put("status", "On Time");
			resultInfo.setFlightInfo(FInfo);
			
		}else if(flightNum.equalsIgnoreCase(Constants.UA2131)||
					(Origin.equalsIgnoreCase(Constants.IAH) && 
						      Destination.equalsIgnoreCase(Constants.ORD))&& fromDate.equalsIgnoreCase("2018-01-31")  ) {
			
			FInfo.put("flightNumber", "2131");
			FInfo.put("carrier", "UA");
			FInfo.put("origin", "IAH");
			FInfo.put("departure", "2018-01-31T19:49:00");
			FInfo.put("destination", "ORD");
			FInfo.put("arrival", "2018-01-31T22:00:00");
			FInfo.put("aircraft", "Boeing 737-900");
			FInfo.put("distance", "925");
			FInfo.put("travelTime", "02:31");
			FInfo.put("status", "On Time");
			resultInfo.setFlightInfo(FInfo);
			
		}
		return resultInfo;
	}

}
