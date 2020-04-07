package com.crona.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.crona.covid.adapter.CustomAdapterForCronaStateList;
import com.crona.covid.base.BaseActivity;
import com.crona.covid.interfaces.DropDownItemClickListener;
import com.crona.covid.model.CasesTimeSeriesItem;
import com.crona.covid.model.ResponseFromServerForCrona;
import com.crona.covid.model.StatewiseItem;
import com.crona.covid.networking.ApiClient;
import com.crona.covid.networking.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActvity extends BaseActivity implements DropDownItemClickListener {

    RecyclerView recyclerView;
    CustomAdapterForCronaStateList customAdapterForCronaStateList;
    private ApiService newApiService;
    List<StatewiseItem> mStatewiseList=new ArrayList<>();
    TextView tv_date_time;
    TextView today_new;
    TextView tv_confirmed;
    TextView ACTIVE;
    TextView RECOVERED;
    TextView DECEASED;
    TextView last_upadte;
    TextView tv_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_actvity);
        newApiService = ApiClient.getClientFia().create(ApiService.class);

        recyclerView= findViewById(R.id.recyclerview);
        tv_date_time= findViewById(R.id.tv_date_time);
        today_new= findViewById(R.id.today_new);
        tv_confirmed= findViewById(R.id.tv_confirmed);
        ACTIVE= findViewById(R.id.ACTIVE);
        RECOVERED= findViewById(R.id.RECOVERED);
        DECEASED= findViewById(R.id.DECEASED);
        tv_info= findViewById(R.id.tv_info);
        last_upadte= findViewById(R.id.last_upadte);
        recyclerView.setLayoutManager(new LinearLayoutManager(HomeActvity.this));

        customAdapterForCronaStateList = new CustomAdapterForCronaStateList(HomeActvity.this, mStatewiseList, this);
        recyclerView.setAdapter(customAdapterForCronaStateList);
        recyclerView.setNestedScrollingEnabled(false);

        last_upadte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataForStateCrona();

            }
        });
        tv_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchactvity(TermsAndConditionsActivity.class);

            }
        });
        getDataForStateCrona();

    }

    @Override
    public void onDropDownItemClickListener(int position) {
        Intent intent = new Intent(this, DashBoardActivity.class);
        intent.putExtra("state",mStatewiseList.get(position+1).getState());
        startActivity(intent);

    }

    private void getDataForStateCrona() {
        showProgressDialog();
        Call<ResponseFromServerForCrona> call1 = newApiService.getStaeData();
        call1.enqueue(new Callback<ResponseFromServerForCrona>() {
            @Override
            public void onResponse(Call<ResponseFromServerForCrona> call, Response<ResponseFromServerForCrona> response) {
                hideProgressDialog();
                ResponseFromServerForCrona responseFromServerForCrona = response.body();
                mStatewiseList.clear();

                List<CasesTimeSeriesItem> casesTimeSeries = responseFromServerForCrona.getCasesTimeSeries();
                List<StatewiseItem> statewise = responseFromServerForCrona.getStatewise();

                tv_date_time.setText(statewise.get(0).getLastupdatedtime());
                tv_confirmed.setText(statewise.get(0).getConfirmed());
                ACTIVE.setText(statewise.get(0).getActive());
                RECOVERED.setText(statewise.get(0).getRecovered());
                DECEASED.setText(statewise.get(0).getDeaths());
                today_new.setText("Today Case :"+statewise.get(0).getDeltaconfirmed());
                mStatewiseList.addAll(statewise);
                customAdapterForCronaStateList.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<ResponseFromServerForCrona> call, Throwable t) {
                call.cancel();
                hideProgressDialog();
            }
        });
    }
}
