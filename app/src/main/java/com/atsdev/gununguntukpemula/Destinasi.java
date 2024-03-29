package com.atsdev.gununguntukpemula;

import android.os.Parcel;
import android.os.Parcelable;

public class Destinasi implements Parcelable {
    private String name;
    private String remarks;
    private String photo;
    private String deskripsi;
    private String lokasi;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.deskripsi);
        dest.writeString(this.lokasi);
    }

    public Destinasi() {
    }

    protected Destinasi(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.deskripsi = in.readString();
        this.lokasi = in.readString();
    }

    public static final Parcelable.Creator<Destinasi> CREATOR = new Parcelable.Creator<Destinasi>() {
    @Override
    public Destinasi createFromParcel(Parcel source) {
        return new Destinasi(source);
    }
        @Override
        public Destinasi[] newArray(int size) {
            return new Destinasi[size];
        }
    };

}
