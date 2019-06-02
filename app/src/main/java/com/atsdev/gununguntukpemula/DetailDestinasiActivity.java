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
    ImageView img;
    TextView nameTxt, remarkTxt, detailTxt, lokasiTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_destinasi);

        Intent intent = getIntent();

        String name= intent.getExtras().getString("name");
        String pos= intent.getExtras().getString("remark");
        int image= intent.getExtras().getInt("photo");
        String detail = intent.getExtras().getString("detail");
        String lokasi = intent.getExtras().getString("lokasi");

        img= findViewById(R.id.img_item_photo);
        nameTxt=findViewById(R.id.tv_item_name);
        remarkTxt=findViewById(R.id.tv_item_remarks);
        detailTxt = findViewById(R.id.content_detail);
        lokasiTxt = findViewById(R.id.content_lokasi);

        img.setImageResource(image);
        nameTxt.setText(name);
        remarkTxt.setText(pos);
        detailTxt.setText(detail);
        lokasiTxt.setText(lokasi);

    }
}
