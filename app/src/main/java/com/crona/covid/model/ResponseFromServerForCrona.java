package com.crona.covid.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ResponseFromServerForCrona{

	@SerializedName("cases_time_series")
	private List<CasesTimeSeriesItem> casesTimeSeries;

	@SerializedName("tested")
	private List<TestedItem> tested;

	@SerializedName("statewise")
	private List<StatewiseItem> statewise;

	public void setCasesTimeSeries(List<CasesTimeSeriesItem> casesTimeSeries){
		this.casesTimeSeries = casesTimeSeries;
	}

	public List<CasesTimeSeriesItem> getCasesTimeSeries(){
		return casesTimeSeries;
	}

	public void setTested(List<TestedItem> tested){
		this.tested = tested;
	}

	public List<TestedItem> getTested(){
		return tested;
	}

	public void setStatewise(List<StatewiseItem> statewise){
		this.statewise = statewise;
	}

	public List<StatewiseItem> getStatewise(){
		return statewise;
	}

	@Override
 	public String toString(){
		return 
			"ResponseFromServerForCrona{" + 
			"cases_time_series = '" + casesTimeSeries + '\'' + 
			",tested = '" + tested + '\'' + 
			",statewise = '" + statewise + '\'' + 
			"}";
		}
}