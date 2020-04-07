package com.crona.covid;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.crona.covid.adapter.CustomAdapterForCronaStateList;
import com.crona.covid.adapter.CuustomAdapterForDistrict;
import com.crona.covid.base.BaseActivity;
import com.crona.covid.model.CasesTimeSeriesItem;
import com.crona.covid.model.ResponseFromServerForCrona;
import com.crona.covid.model.StatewiseItem;
import com.crona.covid.model.district.Delta;
import com.crona.covid.model.district.DistrictDataItem;
import com.crona.covid.model.district.ResponseFromServerCronaDistrict;
import com.crona.covid.networking.ApiClient;
import com.crona.covid.networking.ApiService;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashBoardActivity extends BaseActivity {
    RecyclerView recyclerView;
    CuustomAdapterForDistrict cuustomAdapterForDistrict;
    List<DistrictDataItem> districtDataItems=new ArrayList<>();
    List<Delta> deltas=new ArrayList<>();
    private ApiService newApiService;
    String mState="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        newApiService = ApiClient.getClientFia().create(ApiService.class);

        recyclerView= findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(DashBoardActivity.this));
        cuustomAdapterForDistrict = new CuustomAdapterForDistrict(DashBoardActivity.this, districtDataItems);
        recyclerView.setAdapter(cuustomAdapterForDistrict);
        mState = getIntent().getStringExtra("state");

        getDataForStateCrona();

    }
    private void getDataForStateCrona() {
        showProgressDialog();
        Call<List<ResponseFromServerCronaDistrict>> call1 = newApiService.getDistrictData();
        call1.enqueue(new Callback<List<ResponseFromServerCronaDistrict>>() {
            @Override
            public void onResponse(Call<List<ResponseFromServerCronaDistrict>> call, Response<List<ResponseFromServerCronaDistrict> >response) {
                hideProgressDialog();
                List<ResponseFromServerCronaDistrict> responseFromServerCronaDistrict  =response.body();


                 for(int i=0;i<responseFromServerCronaDistrict.size();i++){
                     String state = responseFromServerCronaDistrict.get(i).getState();
                     if(state.equalsIgnoreCase(mState)){
                         List<DistrictDataItem> districtData = responseFromServerCronaDistrict.get(i).getDistrictData();
                         districtDataItems.addAll(districtData);
                         cuustomAdapterForDistrict.notifyDataSetChanged();
                         return;


                     }


                 }



            }

            @Override
            public void onFailure(Call<List<ResponseFromServerCronaDistrict>> call, Throwable t) {
                call.cancel();
                hideProgressDialog();
            }
        });
    }
}
