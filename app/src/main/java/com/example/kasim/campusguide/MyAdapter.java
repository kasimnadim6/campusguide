package com.example.kasim.campusguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context mContext;
    private List<Card> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        private ImageView thumbnail;

        private MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            thumbnail = view.findViewById(R.id.thumbnail);
        }
    }

    MyAdapter(Context mContext, List<Card> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Card album = list.get(position);

        holder.title.setText(album.getName());

        holder.thumbnail.setImageResource(album.getThumbnail());
        // loading album dropcover using Glide library
        //Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.getAdapterPosition()==0){
                    Intent i =new Intent(mContext,fragment.class);
                    i.putExtra("block",1);
                    mContext.startActivity(i);
                }else if(holder.getAdapterPosition()==1){
                    Intent i =new Intent(mContext,fragment.class);
                    i.putExtra("block",2);
                    mContext.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

