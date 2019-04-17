package com.example.demo.service;

import com.example.demo.helper.ResultInfo;

public interface FlightInfoService {

	ResultInfo getFlightInfobyOrginDestinationAndDate(String flightNum, String Origin, String Destination, String fromDate) throws Exception;
}
