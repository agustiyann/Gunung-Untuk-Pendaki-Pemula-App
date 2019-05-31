package com.atsdev.gununguntukpemula;

import java.util.ArrayList;

public class DestinasiData {
    public static String[][] data = new String[][]{
            {"Gunung Nglanggeran", "Jogja (700 mdpl)", "https://upload.wikimedia.org/wikipedia/commons/b/bb/Bukit_Nglanggeran.jpg"},
            {"Gunung Besek", "Wonogiri (850 mdpl)", "https://backpackerjakarta.com/wp-content/uploads/2016/10/bukit-besek-2.jpg"},
            {"Gunung Panderman", "Batu (2,045 mdpl)", "http://vakansi.id/wp-content/uploads/2018/02/Jatah-Libur-Cuma-Sehari-Cobalah-Mendaki-Gunung-Panderman-via-liburmulu.jpg"},
            {"Puncak Gadjah", "Purbalingga (1,440 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109093535/gunung-pemula-1.jpg"},
            {"Gunung Papandayan", "Garut (2,665 mdpl)", "https://upload.wikimedia.org/wikipedia/commons/7/7c/Taman_Wisata_Alam_Gunung_Papandayan_Kabupaten_Garut_Jawa_Barat.jpg"},
            {"Gunung Andong", "Magelang (1,463 mdpl)", "https://media.travelingyuk.com/wp-content/uploads/2018/09/Gunung-Andong.jpg"},
            {"Gunung Ijen", "Banyuwangi (2,779 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg"},
            {"Gunung Batur", "Bali (1,717 mdpl)", "https://gpswisataindonesia.info/wp-content/uploads/2017/12/gunung_batur-800x530.jpg"},
            {"Gunung Sibayak", "Karo (2,094 mdpl)", "https://2.bp.blogspot.com/-eqyZ3vCw5ww/Wb-ka5rpOfI/AAAAAAAAPNU/ajWPfTVNbIgg7ihvLww8E6T2sL_kHc52gCLcBGAs/s1600/IMG_20170821_083512_753.jpg"},
            {"Gunung Penanggungan", "Mojokerto (1,653 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109095151/gunung-pemula-7-1024x571.jpeg"}
    };

    public static ArrayList<Destinasi> getListData(){
        Destinasi destinasi = null;
        ArrayList<Destinasi> list = new ArrayList<>();
        for (String[] aData : data) {
            destinasi = new Destinasi();
            destinasi.setName(aData[0]);
            destinasi.setRemarks(aData[1]);
            destinasi.setPhoto(aData[2]);

            list.add(destinasi);
        }

        return list;
    }
}
