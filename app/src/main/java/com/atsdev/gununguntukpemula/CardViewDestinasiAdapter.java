package com.atsdev.gununguntukpemula;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewDestinasiAdapter extends RecyclerView.Adapter<CardViewDestinasiAdapter.CardViewViewHolder> {
    public CardViewDestinasiAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Destinasi> getListDestinasi() {
        return listDestinasi;
    }

    public void setListDestinasi(ArrayList<Destinasi> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    private ArrayList<Destinasi> listDestinasi;


    @NonNull
    @Override
    public CardViewDestinasiAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_destinasi, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewDestinasiAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        final Destinasi p = getListDestinasi().get(i);

        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Suka "+getListDestinasi().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListDestinasi().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.imgPhoto.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailDestinasiActivity.class);
                intent.putExtra(DetailDestinasiActivity.EXTRA_NAMA, getListDestinasi().get(position).getName());
                intent.putExtra(DetailDestinasiActivity.EXTRA_REMARK, getListDestinasi().get(position).getRemarks());
                intent.putExtra(DetailDestinasiActivity.EXTRA_FOTO, getListDestinasi().get(position).getPhoto());
                intent.putExtra(DetailDestinasiActivity.EXTRA_DETAIL, getListDestinasi().get(position).getDeskripsi());
                intent.putExtra(DetailDestinasiActivity.EXTRA_LOKASI, getListDestinasi().get(position).getLokasi());
                context.startActivity(intent);
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListDestinasi().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }
}
