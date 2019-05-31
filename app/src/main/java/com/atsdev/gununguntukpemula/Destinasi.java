package com.atsdev.gununguntukpemula;

import android.os.Parcel;
import android.os.Parcelable;

public class Destinasi implements Parcelable {
    private String name, remarks, photo;

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
    }

    public Destinasi() {
    }

    protected Destinasi(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
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
