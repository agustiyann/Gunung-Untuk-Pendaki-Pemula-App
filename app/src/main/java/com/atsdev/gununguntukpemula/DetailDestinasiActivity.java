package com.atsdev.gununguntukpemula;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailDestinasiActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA= "extra_name";
    public static final String EXTRA_REMARK= "extra_keterangan";
    public static final String EXTRA_FOTO= "extra_foto";
    public static final String EXTRA_DETAIL= "extra_detail";
    public static final String EXTRA_LOKASI= "extra_lokasi";

    TextView tvNama, tvRemark, detailTxt, lokasiTxt;
    ImageView fotoDestinasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_destinasi);
        tvNama = findViewById(R.id.tv_item_name);
        tvRemark = findViewById(R.id.tv_item_remarks);
        fotoDestinasi =findViewById(R.id.img_item_photo);
        detailTxt = findViewById(R.id.content_detail);
        lokasiTxt = findViewById(R.id.content_lokasi);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String remark = getIntent().getStringExtra(EXTRA_REMARK);
        String foto = getIntent().getStringExtra(EXTRA_FOTO);
        String detill = getIntent().getStringExtra(EXTRA_DETAIL);
        String lokk = getIntent().getStringExtra(EXTRA_LOKASI);

        tvNama.setText(nama);
        tvRemark.setText(remark);
        detailTxt.setText(detill);
        lokasiTxt.setText(lokk);
        Glide.with(DetailDestinasiActivity.this)
                .load(foto).apply(new RequestOptions()
                .override(350, 550))
                .into(fotoDestinasi);
    }
}
