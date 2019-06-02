package com.atsdev.gununguntukpemula;

import java.util.ArrayList;

public class DestinasiData {
    public static String[][] data = new String[][]{

            {"Puncak Gadjah", "Purbalingga (1,440 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109093535/gunung-pemula-1.jpg",
                    "Puncak Gadjah merupakan bagian dari rangkaian Gunung Pulosari, Purbalingga yang terletak di kaki Gunung Slamet. Di sinilah kamu bisa menikmati panorama golden sunrise dengan latar belakang Gunung Sindoro yang mengagumkan. Untuk mencapai puncak, kamu hanya membutuhkan waktu 30 menit hingga satu jam dari area parkir di Desa Karangreja. Jika hendak berburu sunrise jangan lupa menggunakan jaket tebal ya, karena suhu di sini bisa sangat dingin hingga 15 derajat Celcius lho.",
                    "Kabupaten Pemalang, Jawa Tengah"},
            {"Gunung Papandayan", "Garut (2,665 mdpl)", "https://upload.wikimedia.org/wikipedia/commons/7/7c/Taman_Wisata_Alam_Gunung_Papandayan_Kabupaten_Garut_Jawa_Barat.jpg",
                    "Selain medannya yang landai, kamu juga akan dimudahkan dengan segala fasilitas untuk para pendaki di sepanjang jalur pendakian menuju puncak. Mulai dari toilet hingga warung makan di atas puncak bisa dengan mudah kamu temui. Meskipun tergolong mudah, namun pemandangan yang ditawarkan sepanjang jalur pendakian tidak bisa diremehkan. Salah satunya adalah menikmati suasana mistis di Hutan Mati. Pokoknya tidak akan menyesal deh naik Gunung Papandayan.",
                    "Kabupaten Garut, Jawa Barat"},
            {"Gunung Andong", "Magelang (1,463 mdpl)", "https://media.travelingyuk.com/wp-content/uploads/2018/09/Gunung-Andong.jpg",
                    "Tidak jauh dari Jogja, kamu bisa melanjutkan perjalanan pendakian ke Magelang dan naik ke puncak Gunung Andong. Gunung Andong memiliki jalur dan papan petunjuk yang jelas. Sehingga kamu tidak perlu takut tersesat. Dengan berjalan kaki kamu bisa mencapai puncak dalam waktu kurang dari dua jam. Keunikan Gunung Andong ini terlihat dari bagian puncaknya yang menyerupai punuk unta. Jika berani kamu bisa memacu adrenalin dengan melewati punuk unta tersebut melalui jalan setapak sempit yang diapit jurang. Dijamin akan jadi pengalaman yang seru dan mendebarkan.",
                    "Kabupaten Magelang, Jawa Tengah"},
            {"Gunung Ijen", "Banyuwangi (2,779 mdpl)", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg",
                    "Dengan jalur pendakian yang lebar dan tidak terlalu curam, Gunung Ijen menjadi salah satu gunung favorit para pendaki pemula. Untuk menuju puncak, kamu perlu waktu minimal tiga jam pendakian. Dengan ketinggian mendekati 3,000 mdpl, pemandangan di atas puncak saat matahari terbit sangat spektakuler. Belum lagi fenomena blue fire yang melegenda di Kawah Ijen. Setidaknya, sekali seumur hidup wajib banget menginjakkan kaki di puncak Gunung Ijen.",
                    "perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur"},
            {"Gunung Batur", "Bali (1,717 mdpl)", "https://gpswisataindonesia.info/wp-content/uploads/2017/12/gunung_batur-800x530.jpg",
                    "Meski tergolong cukup tinggi, namun Gunung batur termasuk ramah untuk para pendaki pemula lho. Namun, pastikan kamu memiliki fisik yang prima sebelum mendaki ya. Setidaknya butuh waktu dua jam untuk bisa mencapai puncak Gunung Batur. Keindahan kalderanya yang luas dan padang rumput menghijau menjadi daya tarik utama para pendaki yang mampir ke sini. Selain itu, kamu juga bisa lho berkemah di tepi Danau Batur sambil stargazing langit malam Pulau Dewata yang mempesona.",
                    "Kabupaten Bangli, Bali"},
            {"Gunung Sibayak", "Karo (2,094 mdpl)", "https://2.bp.blogspot.com/-eqyZ3vCw5ww/Wb-ka5rpOfI/AAAAAAAAPNU/ajWPfTVNbIgg7ihvLww8E6T2sL_kHc52gCLcBGAs/s1600/IMG_20170821_083512_753.jpg",
                    "Siapa bilang gunung berapi hanya untuk pendaki berpengalaman? Gunung Sibayak adalah salah satu gunung berapi aktif di kawasan Dataran Tinggi Karo Sumatera Utara. Melalui jalur Desa Semangat Gunung kamu bisa menemukan jalur pendakian yang relatif mudah lho. Pemandangan khas gunung berapi dengan batuan cadas dan kawah aktif menjadi daya tarik utama dari Gunung Sibayak. Pemandangan matahari terbitnya juga jadi salah satu agenda penting yang tidak boleh kamu lewatkan. Tertarik menginjakkan kaki di Gunung Sibayak?",
                    "Kabupaten Karo, Sumatra Utara"},

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
