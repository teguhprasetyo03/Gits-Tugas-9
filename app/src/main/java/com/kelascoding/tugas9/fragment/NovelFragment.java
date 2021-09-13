package com.kelascoding.tugas9.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelascoding.tugas9.R;
import com.kelascoding.tugas9.adapter.BookAdapter;
import com.kelascoding.tugas9.adapter.NovelAdapter;
import com.kelascoding.tugas9.model.Book;
import com.kelascoding.tugas9.model.DataBook;
import com.kelascoding.tugas9.model.DataNovel;
import com.kelascoding.tugas9.model.Novel;

import java.util.ArrayList;


public class NovelFragment extends Fragment {
    private RecyclerView rvNovel;
    private ArrayList<Novel> list = new ArrayList<>();

    public NovelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_novel, container, false);
        rvNovel = view.findViewById(R.id.novelfragment);
        rvNovel.setHasFixedSize(true);

        list.addAll(DataNovel.getListData());
        showRecyclerNovel();

        return view;
    }

    private void showRecyclerNovel() {
        rvNovel.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        NovelAdapter novelAdapter = new NovelAdapter(this.getContext());
        novelAdapter.setListNovel(list);
        rvNovel.setAdapter(novelAdapter);
    }
}