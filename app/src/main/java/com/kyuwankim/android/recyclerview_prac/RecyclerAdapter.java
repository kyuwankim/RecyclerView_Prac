package com.kyuwankim.android.recyclerview_prac;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kimkyuwan on 2017. 3. 17..
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    int itemLayout;
    ArrayList<Data> datas;
    Context context;


    public RecyclerAdapter(ArrayList<Data> datas, int itemLayout, Context context){
        this.itemLayout = itemLayout;
        this.datas = datas;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        RecyclerViewHolder rv = new RecyclerViewHolder(view);

        return rv;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {

        Data data = datas.get(position);

        holder.tvtitle.setText(data.title);
        holder.tvyeat.setText(data.year);
        holder.tvmonth.setText(data.month);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context , CardviewDetail.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView tvtitle, tvyeat, tvmonth;
        CardView cardView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);

            tvtitle = (TextView) itemView.findViewById(R.id.tv_cardview_title);
            tvyeat = (TextView) itemView.findViewById(R.id.tv_cardview_year);
            tvmonth = (TextView) itemView.findViewById(R.id.tv_cardview_month);
            cardView = (CardView) itemView.findViewById(R.id.cardview);


        }
    }


}
