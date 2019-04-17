package com.example.demo.controller;

import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.helper.ErrorMessages;
import com.example.demo.helper.ResultInfo;
import com.example.demo.service.FlightInfoService;

import io.swagger.annotations.ApiOperation;
@RequestMapping(value="/travel")
@RestController
public class FlightController {
	
	private static final Logger log = LoggerFactory.getLogger(FlightController.class) ;

	@Autowired(required=true) FlightInfoService flightService;
	
	@Autowired ResultInfo resultInfo;
	
	public void setFlightService(FlightInfoService flightService) {
		this.flightService = flightService;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

	@ApiOperation(value = "Flight Status API", notes="This API is to retrieve flight details based Flightnumber & date (or) Orgin, Destination & date")
	@GetMapping("/flightstatus")
	 public ResultInfo getStatusbyFlightNumber(@NotNull @RequestParam(value="Flight Number",  required = false) String flightNumber,
			 @NotNull @RequestParam(value="Origin",  required = false) String Origin,
			 @NotNull @RequestParam(value="Destination",  required = false) String Destination,
			 @NotNull @RequestParam(value="Departure Date") String fromDate) {
		
		try {
			log.debug("++++++++++ Entering into getFlightInfobyOrginDestinationAndDate::FlightInfoService ++++++");
			resultInfo = flightService.getFlightInfobyOrginDestinationAndDate(flightNumber, Origin, Destination, fromDate);
			
		}catch(Exception e) {
			log.error("Error while retrieving the flight info from serviceImpl class");
			resultInfo.setErroCode("ERR_UA_1");
			resultInfo.setStatus("ERROR");
			resultInfo.setErrorDesc("Error while retrieving info using Flightnumber & date");
		}
	   
	if( (resultInfo.getStatus() == null) || !(ErrorMessages.ERROR.equals(resultInfo.getStatus()))) {
			log.info(" Returns Success......");
			resultInfo.setErroCode("ERR_UA_12");
			resultInfo.setErrorDesc(null);
			resultInfo.setFlightInfo(resultInfo.getFlightInfo());
			resultInfo.setStatus(ErrorMessages.SUCCESS);
			
		}
	   return resultInfo;
	 }

	
	
}
