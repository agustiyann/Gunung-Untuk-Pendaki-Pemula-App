package com.atsdev.gununguntukpemula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListDestinasiAdapter extends RecyclerView.Adapter<ListDestinasiAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Destinasi> listDestinasi;

    public ArrayList<Destinasi> getListDestinasi() {
        return listDestinasi;
    }

    void setListDestinasi(ArrayList<Destinasi> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    ListDestinasiAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ListDestinasiAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_destinasi, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDestinasiAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListDestinasi().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListDestinasi().get(position).getRemarks());

        Glide.with(context)
                .load(getListDestinasi().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListDestinasi().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
