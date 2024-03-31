package com.rico.cobafragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rico.cobafragment.R;
import com.rico.cobafragment.model.modelDatar;

import java.util.List;

public class adapterBangunDatar extends RecyclerView.Adapter<adapterBangunDatar.ViewHolder>{
    Context context;
    List<modelDatar> listData;
    private ItemClickListener mClickListener;
    private int layout;
    public adapterBangunDatar(Context context, int layout, List<modelDatar> figure) {
        this.context = context;
        this.layout = layout;
        this.listData = figure;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterBangunDatar.ViewHolder holder, int position) {
        final modelDatar itemsDatar = this.listData.get(position);
        holder.namaBangun.setText(itemsDatar.getNamaBangun());
        Glide.with(holder.imageUrl).load(itemsDatar.getImageUrl()).into(holder.imageUrl);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaBangun;
        ImageView imageUrl;
        public ViewHolder(View view) {
            super(view);
            namaBangun = view.findViewById(R.id.tvbangunDatar);
            imageUrl = view.findViewById(R.id.ivDatar);
            view.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}
