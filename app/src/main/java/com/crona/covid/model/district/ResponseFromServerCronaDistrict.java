package com.crona.covid.model.district;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ResponseFromServerCronaDistrict{

	@SerializedName("districtData")
	private List<DistrictDataItem> districtData;

	@SerializedName("state")
	private String state;

	public void setDistrictData(List<DistrictDataItem> districtData){
		this.districtData = districtData;
	}

	public List<DistrictDataItem> getDistrictData(){
		return districtData;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"ResponseFromServerCronaDistrict{" + 
			"districtData = '" + districtData + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}