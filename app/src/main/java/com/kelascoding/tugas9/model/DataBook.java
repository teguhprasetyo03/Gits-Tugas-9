package com.kelascoding.tugas9.model;

import java.util.ArrayList;

public class DataBook {

    public static String [][] data = new String[][]{
        {
                "Anatomic Habits",
                "Gramedia Pustaka Utama",
                "2019",
                "https://ebooks.gramedia.com/ebook-covers/49184/thumb_image_normal/ID_AHPK2019MTH09AHP.jpg"
        },
        {
                    "Milea Suara Dari Dilan",
                    "Mizan Publishing",
                    "2021",
                    "https://cdn.gramedia.com/uploads/items/9786020851563_milea_suara_dari_dilan_1.jpg"
        },
        {
                    "Menggapai Asa",
                    "Gramedia Pustaka Utama",
                    "2021",
                    "https://cdn.gramedia.com/uploads/items/Menggapai_asa_page-0001.jpg"
            },
         {
                    "Menuju Pukul Dua Malam",
                    "Elex Media Komputindo",
                    "2021",
                    "https://cdn.gramedia.com/uploads/items/9786230028083_Menuju_Pukul_Dua_Malam_HC.jpg"
            },

            {
                    "Umkm Adalah Kunci",
                    "RAKYAT MERDEKA BOOKS",
                    "2021",
                    "https://cdn.gramedia.com/uploads/items/UMKM_ADALAH_KUNCI.jpg"
            },
            {
                    "Kitab Hitam Turki",
                    "Ircisod",
                    "2021",
                    "https://cdn.gramedia.com/uploads/items/9786236166659.jpeg"
            },
    };

    public static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        for (String [] aData: data){
            Book book = new Book();
            book.setJudul(aData[0]);
            book.setPenerbit(aData[1]);
            book.setTahunterbit(aData[2]);
            book.setPhoto(aData[3]);
            list.add(book);
        }
        return list;
    }
}
