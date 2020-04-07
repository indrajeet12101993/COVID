package com.crona.covid.model.district;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Delta{

	@SerializedName("confirmed")
	private int confirmed;

	public void setConfirmed(int confirmed){
		this.confirmed = confirmed;
	}

	public int getConfirmed(){
		return confirmed;
	}

	@Override
 	public String toString(){
		return 
			"Delta{" + 
			"confirmed = '" + confirmed + '\'' + 
			"}";
		}
}