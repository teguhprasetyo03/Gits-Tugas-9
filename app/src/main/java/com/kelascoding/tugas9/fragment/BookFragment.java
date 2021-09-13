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
import com.kelascoding.tugas9.model.Book;
import com.kelascoding.tugas9.model.DataBook;

import java.util.ArrayList;


public class BookFragment extends Fragment {

    private RecyclerView rvBook;
    private ArrayList<Book> list = new ArrayList<>();


    public BookFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view =  inflater.inflate(R.layout.fragment_book, container, false);
       rvBook = view.findViewById(R.id.bookfragment);
       rvBook.setHasFixedSize(true);

       list.addAll(DataBook.getListData());
       showRecyclerBook();

       return view;
    }

    private void showRecyclerBook() {
        rvBook.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        BookAdapter bookAdapter = new BookAdapter(this.getContext());
        bookAdapter.setListBook(list);
        rvBook.setAdapter(bookAdapter);
    }
}