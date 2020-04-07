package com.crona.covid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.crona.covid.R;
import com.crona.covid.interfaces.DropDownItemClickListener;
import com.crona.covid.model.StatewiseItem;
import com.crona.covid.model.district.Delta;
import com.crona.covid.model.district.DistrictDataItem;

import java.util.ArrayList;
import java.util.List;

public class CuustomAdapterForDistrict extends RecyclerView.Adapter<CuustomAdapterForDistrict.MyViewHolder> {
    private Context mContext;
    List<DistrictDataItem> districtDataItems1;
    List<Delta> deltas;

    public CuustomAdapterForDistrict(Context mContext,   List<DistrictDataItem> districtDataItems) {
        this.mContext = mContext;
        this.districtDataItems1 = districtDataItems;

    }

    @NonNull
    @Override
    public CuustomAdapterForDistrict.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.drop_down_list_item_distict, viewGroup, false);

        return new CuustomAdapterForDistrict.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CuustomAdapterForDistrict.MyViewHolder viewHolder, final int position) {
        viewHolder.tvconfirmed.setText(""+districtDataItems1.get(position).getConfirmed());

        viewHolder.tv_total_new_case.setText(""+districtDataItems1.get(position).getDelta().getConfirmed());
        viewHolder.state.setText("District : "+districtDataItems1.get(position).getDistrict());



    }

    @Override
    public int getItemCount() {
        return districtDataItems1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvconfirmed;

        TextView tv_total_new_case;
        TextView state;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvconfirmed = itemView.findViewById(R.id.tvconfirmed);

            tv_total_new_case = itemView.findViewById(R.id.tv_total_new_case);
            state = itemView.findViewById(R.id.state);
        }
    }
}
