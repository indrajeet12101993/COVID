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

import java.util.List;


public class CustomAdapterForCronaStateList extends RecyclerView.Adapter<CustomAdapterForCronaStateList.MyViewHolder> {
    private Context mContext;
    private List<StatewiseItem> regionLists;
    DropDownItemClickListener dropDownItemClickListener;

    public CustomAdapterForCronaStateList(Context mContext, List<StatewiseItem> regionLists, DropDownItemClickListener dropDownItemClickListener) {
        this.mContext = mContext;
        this.regionLists = regionLists;
        this.dropDownItemClickListener = dropDownItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.drop_down_list_item, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, final int position) {
        viewHolder.tvconfirmed.setText(regionLists.get(position+1).getConfirmed());
        viewHolder.ACTIVE.setText(regionLists.get(position+1).getActive());
        viewHolder.RECOVERED.setText(regionLists.get(position+1).getRecovered());
        viewHolder.DECEASED.setText(regionLists.get(position+1).getDeaths());
        viewHolder.tv_total_new_case.setText(regionLists.get(position+1).getDeltaconfirmed());
        viewHolder.state.setText("State : "+regionLists.get(position+1).getState());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dropDownItemClickListener.onDropDownItemClickListener(position);
            }
        });

        viewHolder.btn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dropDownItemClickListener.onDropDownItemClickListener(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return regionLists.size()-1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvconfirmed;
        TextView ACTIVE;
        TextView RECOVERED;
        TextView DECEASED;
        TextView tv_total_new_case;
        TextView state;
        Button btn_more;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvconfirmed = itemView.findViewById(R.id.tvconfirmed);
            ACTIVE = itemView.findViewById(R.id.ACTIVE);
            RECOVERED = itemView.findViewById(R.id.RECOVERED);
            DECEASED = itemView.findViewById(R.id.DECEASED);
            tv_total_new_case = itemView.findViewById(R.id.tv_total_new_case);
            state = itemView.findViewById(R.id.state);
            btn_more = itemView.findViewById(R.id.btn_more);
        }
    }
}
