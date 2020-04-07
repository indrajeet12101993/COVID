package com.crona.covid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TestedItem{

	@SerializedName("testsconductedbyprivatelabs")
	private String testsconductedbyprivatelabs;

	@SerializedName("totalsamplestested")
	private String totalsamplestested;

	@SerializedName("source")
	private String source;

	@SerializedName("updatetimestamp")
	private String updatetimestamp;

	@SerializedName("totalindividualstested")
	private String totalindividualstested;

	@SerializedName("totalpositivecases")
	private String totalpositivecases;

	@SerializedName("_ckd7g")
	private String ckd7g;

	public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs){
		this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
	}

	public String getTestsconductedbyprivatelabs(){
		return testsconductedbyprivatelabs;
	}

	public void setTotalsamplestested(String totalsamplestested){
		this.totalsamplestested = totalsamplestested;
	}

	public String getTotalsamplestested(){
		return totalsamplestested;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setUpdatetimestamp(String updatetimestamp){
		this.updatetimestamp = updatetimestamp;
	}

	public String getUpdatetimestamp(){
		return updatetimestamp;
	}

	public void setTotalindividualstested(String totalindividualstested){
		this.totalindividualstested = totalindividualstested;
	}

	public String getTotalindividualstested(){
		return totalindividualstested;
	}

	public void setTotalpositivecases(String totalpositivecases){
		this.totalpositivecases = totalpositivecases;
	}

	public String getTotalpositivecases(){
		return totalpositivecases;
	}

	public void setCkd7g(String ckd7g){
		this.ckd7g = ckd7g;
	}

	public String getCkd7g(){
		return ckd7g;
	}

	@Override
 	public String toString(){
		return 
			"TestedItem{" + 
			"testsconductedbyprivatelabs = '" + testsconductedbyprivatelabs + '\'' + 
			",totalsamplestested = '" + totalsamplestested + '\'' + 
			",source = '" + source + '\'' + 
			",updatetimestamp = '" + updatetimestamp + '\'' + 
			",totalindividualstested = '" + totalindividualstested + '\'' + 
			",totalpositivecases = '" + totalpositivecases + '\'' + 
			",_ckd7g = '" + ckd7g + '\'' + 
			"}";
		}
}