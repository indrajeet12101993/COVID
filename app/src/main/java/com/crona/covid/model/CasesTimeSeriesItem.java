package com.crona.covid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CasesTimeSeriesItem{

	@SerializedName("date")
	private String date;

	@SerializedName("dailyrecovered")
	private String dailyrecovered;

	@SerializedName("totalconfirmed")
	private String totalconfirmed;

	@SerializedName("totaldeceased")
	private String totaldeceased;

	@SerializedName("dailydeceased")
	private String dailydeceased;

	@SerializedName("totalrecovered")
	private String totalrecovered;

	@SerializedName("dailyconfirmed")
	private String dailyconfirmed;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setDailyrecovered(String dailyrecovered){
		this.dailyrecovered = dailyrecovered;
	}

	public String getDailyrecovered(){
		return dailyrecovered;
	}

	public void setTotalconfirmed(String totalconfirmed){
		this.totalconfirmed = totalconfirmed;
	}

	public String getTotalconfirmed(){
		return totalconfirmed;
	}

	public void setTotaldeceased(String totaldeceased){
		this.totaldeceased = totaldeceased;
	}

	public String getTotaldeceased(){
		return totaldeceased;
	}

	public void setDailydeceased(String dailydeceased){
		this.dailydeceased = dailydeceased;
	}

	public String getDailydeceased(){
		return dailydeceased;
	}

	public void setTotalrecovered(String totalrecovered){
		this.totalrecovered = totalrecovered;
	}

	public String getTotalrecovered(){
		return totalrecovered;
	}

	public void setDailyconfirmed(String dailyconfirmed){
		this.dailyconfirmed = dailyconfirmed;
	}

	public String getDailyconfirmed(){
		return dailyconfirmed;
	}

	@Override
 	public String toString(){
		return 
			"CasesTimeSeriesItem{" + 
			"date = '" + date + '\'' + 
			",dailyrecovered = '" + dailyrecovered + '\'' + 
			",totalconfirmed = '" + totalconfirmed + '\'' + 
			",totaldeceased = '" + totaldeceased + '\'' + 
			",dailydeceased = '" + dailydeceased + '\'' + 
			",totalrecovered = '" + totalrecovered + '\'' + 
			",dailyconfirmed = '" + dailyconfirmed + '\'' + 
			"}";
		}
}