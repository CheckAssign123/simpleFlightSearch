package com.example.demo.helper;

import java.util.Map;

public class ResultInfo {

	private String ErroCode;
	private String Status;
	private String ErrorDesc;
	private Map<String, String> FlightInfo;
	
	public String getErroCode() {
		return ErroCode;
	}
	public void setErroCode(String erroCode) {
		ErroCode = erroCode;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Map<String, String> getFlightInfo() {
		return FlightInfo;
	}
	public void setFlightInfo(Map<String, String> flightInfo) {
		FlightInfo = flightInfo;
	}
	
	public String getErrorDesc() {
		return ErrorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		ErrorDesc = errorDesc;
	}
	}
