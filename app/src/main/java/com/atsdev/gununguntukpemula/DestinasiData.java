package com.atsdev.gununguntukpemula;

import java.util.ArrayList;

public class DestinasiData {
    public static String[][] data = new String[][]{

            {"Puncak Gadjah", "Purbalingga (1,440 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109093535/gunung-pemula-1.jpg", "as","as"},
            {"Gunung Papandayan", "Garut (2,665 mdpl)", "https://upload.wikimedia.org/wikipedia/commons/7/7c/Taman_Wisata_Alam_Gunung_Papandayan_Kabupaten_Garut_Jawa_Barat.jpg","as","as"},
            {"Gunung Andong", "Magelang (1,463 mdpl)", "https://media.travelingyuk.com/wp-content/uploads/2018/09/Gunung-Andong.jpg","as","as"},
            {"Gunung Ijen", "Banyuwangi (2,779 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg","as","as"},
            {"Gunung Batur", "Bali (1,717 mdpl)", "https://gpswisataindonesia.info/wp-content/uploads/2017/12/gunung_batur-800x530.jpg","as","as"},
            {"Gunung Sibayak", "Karo (2,094 mdpl)", "https://2.bp.blogspot.com/-eqyZ3vCw5ww/Wb-ka5rpOfI/AAAAAAAAPNU/ajWPfTVNbIgg7ihvLww8E6T2sL_kHc52gCLcBGAs/s1600/IMG_20170821_083512_753.jpg","as","as"},

    };

    public static ArrayList<Destinasi> getListData(){
        Destinasi destinasi = null;
        ArrayList<Destinasi> list = new ArrayList<>();
        for (String[] aData : data) {
            destinasi = new Destinasi();
            destinasi.setName(aData[0]);
            destinasi.setRemarks(aData[1]);
            destinasi.setPhoto(aData[2]);
            destinasi.setDeskripsi(aData[3]);
            destinasi.setLokasi(aData[4]);

            list.add(destinasi);
        }

        return list;
    }
}
