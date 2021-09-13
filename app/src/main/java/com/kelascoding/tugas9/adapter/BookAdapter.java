package com.kelascoding.tugas9.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kelascoding.tugas9.R;
import com.kelascoding.tugas9.model.Book;
import com.kelascoding.tugas9.webview.GramediaWebView;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context context;
    private ArrayList<Book> listBook;

    public BookAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Book> getListBook(){
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook){
        this.listBook = listBook;
    }

    @NonNull
    @Override
    public BookAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview_book, parent, false );
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder holder, int position) {
        Book book = getListBook().get(position);
        Glide.with(context)
                .load(book.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(book.getJudul());

    }

    @Override
    public int getItemCount() {
        return getListBook().size();
    }

     class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvTitle;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_cover);
            tvTitle = itemView.findViewById(R.id.title_book);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, GramediaWebView.class);
                    context.startActivity(intent);
                }
            });

        }

         @Override
         public void onClick(View v) {
             int positon = getAdapterPosition();
             Book book = getListBook().get(positon);

             book.setJudul(book.getJudul());
             book.setPenerbit(book.getPenerbit());
             book.setTahunterbit(book.getTahunterbit());
         }
     }
}
