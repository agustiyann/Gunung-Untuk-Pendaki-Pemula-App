package com.atsdev.gununguntukpemula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridDestinasiAdapter extends RecyclerView.Adapter<GridDestinasiAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Destinasi> listDestinasi;

    public ArrayList<Destinasi> getListDestinasi() {
        return listDestinasi;
    }

    public void setListDestinasi(ArrayList<Destinasi> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    public GridDestinasiAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridDestinasiAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_destinasi, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridDestinasiAdapter.GridViewHolder holder, int position) {
    Glide.with(context)
        .load(getListDestinasi().get(position).getPhoto())
        .apply(new RequestOptions().override(350, 550))
        .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListDestinasi().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
