package com.kelascoding.tugas9.model;

import java.util.ArrayList;

public class DataNovel {

    public static String [][] data = new String[][]{
        {
                "Novel Grafis Hujan Bulan Juni",
                "Gramedia Pustaka Utama",
                "2021",
                "https://cdn.gramedia.com/uploads/items/9786020655307_KOMIK_HUJAN_BULAN_JUNI__C-14-1.jpg"
        },
        {
                    "Light Novel Naruto: Blood Prison",
                    "Elex Media Komputindo",
                    "2019",
                    "https://cdn.gramedia.com/uploads/items/719011259_Light_Novel_Naruto_Blood_Prison.jpg"
        },
        {
                    "Cadl-Sebuah Novel Tanpa Huruf E",
                    "Gramedia Pustaka Utama",
                    "2020",
                    "https://cdn.gramedia.com/uploads/items/9786020639581_CADL_C_1_4-1.jpg"
            },
         {
                    "Segi Tiga (Sebuah Novel)",
                    "Elex Media Komputindo",
                    "2020",
                    "https://cdn.gramedia.com/uploads/items/9786020639246_SEGI_TIGA_C_1_4-1.jpg"
            },

            {
                    "Splendor: A Luxe Novel",
                    "Harper Collins",
                    "2018",
                    "https://ebooks.gramedia.com/ebook-covers/17271/thumb_image_normal/HCO_SALN2018MTH07.jpeg"
            },
            {
                    "Distance (Republish dari novel Winter to Summer)",
                    "Stiletto Book",
                    "2016",
                    "https://ebooks.gramedia.com/ebook-covers/32707/general_small_covers/ID_STIL2016MTH05DDNWTS_S.jpg"
            },
    };

    public static ArrayList<Novel> getListData(){
        ArrayList<Novel> list = new ArrayList<>();
        for (String [] aData: data){
            Novel novel = new Novel();
            novel.setJudul(aData[0]);
            novel.setPenerbit(aData[1]);
            novel.setTahunterbit(aData[2]);
            novel.setPhoto(aData[3]);
            list.add(novel);
        }
        return list;
    }
}
