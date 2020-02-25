package com.example.balance;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.TipsViewHolder>{
    ArrayList<Tips> tips ;

    public RecyclerViewAdapter(ArrayList<Tips> tips) {
        this.tips = tips;
    }


    @NonNull
    @Override
    public TipsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_advices,null,false);
        TipsViewHolder tipsViewHolder = new TipsViewHolder(v);
        return tipsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.TipsViewHolder holder, int position) {
        Tips tip = tips.get(position);
        holder.img.setImageResource(tip.getImg());
        holder.name.setText(tip.getName());
        holder.des.setText(tip.getDes());

    }

    @Override
    public int getItemCount() {
       return tips.size();
    }

    public class TipsViewHolder extends RecyclerView.ViewHolder {
        ImageView img ;
        TextView name , des ;

        TipsViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.tip_img);
            name=itemView.findViewById(R.id.tip_name);
            des=itemView.findViewById(R.id.tip_desc);
    }
}


}
