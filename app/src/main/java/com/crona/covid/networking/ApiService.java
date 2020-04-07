package com.crona.covid.networking;



import com.crona.covid.model.ResponseFromServerForCrona;
import com.crona.covid.model.district.ResponseFromServerCronaDistrict;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    //https://api.covid19india.org/data.json
    @GET("data.json")
    Call<ResponseFromServerForCrona> getStaeData();

    @GET("https://api.covid19india.org/v2/state_district_wise.json")
    Call<List<ResponseFromServerCronaDistrict>> getDistrictData();
}

