package com.crona.covid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class StatewiseItem{

	@SerializedName("recovered")
	private String recovered;

	@SerializedName("deltadeaths")
	private String deltadeaths;

	@SerializedName("deltarecovered")
	private String deltarecovered;

	@SerializedName("active")
	private String active;

	@SerializedName("deltaconfirmed")
	private String deltaconfirmed;

	@SerializedName("state")
	private String state;

	@SerializedName("statecode")
	private String statecode;

	@SerializedName("confirmed")
	private String confirmed;

	@SerializedName("deaths")
	private String deaths;

	@SerializedName("lastupdatedtime")
	private String lastupdatedtime;

	public void setRecovered(String recovered){
		this.recovered = recovered;
	}

	public String getRecovered(){
		return recovered;
	}

	public void setDeltadeaths(String deltadeaths){
		this.deltadeaths = deltadeaths;
	}

	public String getDeltadeaths(){
		return deltadeaths;
	}

	public void setDeltarecovered(String deltarecovered){
		this.deltarecovered = deltarecovered;
	}

	public String getDeltarecovered(){
		return deltarecovered;
	}

	public void setActive(String active){
		this.active = active;
	}

	public String getActive(){
		return active;
	}

	public void setDeltaconfirmed(String deltaconfirmed){
		this.deltaconfirmed = deltaconfirmed;
	}

	public String getDeltaconfirmed(){
		return deltaconfirmed;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setStatecode(String statecode){
		this.statecode = statecode;
	}

	public String getStatecode(){
		return statecode;
	}

	public void setConfirmed(String confirmed){
		this.confirmed = confirmed;
	}

	public String getConfirmed(){
		return confirmed;
	}

	public void setDeaths(String deaths){
		this.deaths = deaths;
	}

	public String getDeaths(){
		return deaths;
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
			"StatewiseItem{" + 
			"recovered = '" + recovered + '\'' + 
			",deltadeaths = '" + deltadeaths + '\'' + 
			",deltarecovered = '" + deltarecovered + '\'' + 
			",active = '" + active + '\'' + 
			",deltaconfirmed = '" + deltaconfirmed + '\'' + 
			",state = '" + state + '\'' + 
			",statecode = '" + statecode + '\'' + 
			",confirmed = '" + confirmed + '\'' + 
			",deaths = '" + deaths + '\'' + 
			",lastupdatedtime = '" + lastupdatedtime + '\'' + 
			"}";
		}
}