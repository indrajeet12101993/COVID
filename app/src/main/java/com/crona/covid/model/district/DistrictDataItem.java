package com.crona.covid.model.district;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DistrictDataItem{

	@SerializedName("district")
	private String district;

	@SerializedName("delta")
	private Delta delta;

	@SerializedName("confirmed")
	private int confirmed;

	@SerializedName("lastupdatedtime")
	private String lastupdatedtime;

	public void setDistrict(String district){
		this.district = district;
	}

	public String getDistrict(){
		return district;
	}

	public void setDelta(Delta delta){
		this.delta = delta;
	}

	public Delta getDelta(){
		return delta;
	}

	public void setConfirmed(int confirmed){
		this.confirmed = confirmed;
	}

	public int getConfirmed(){
		return confirmed;
	}

	public void setLastupdatedtime(String lastupdatedtime){
		this.lastupdatedtime = lastupdatedtime;
	}

	public String getLastupdatedtime(){
		return lastupdatedtime;
	}

	@Override
 	public String toString(){
		return 
			"DistrictDataItem{" + 
			"district = '" + district + '\'' + 
			",delta = '" + delta + '\'' + 
			",confirmed = '" + confirmed + '\'' + 
			",lastupdatedtime = '" + lastupdatedtime + '\'' + 
			"}";
		}
}