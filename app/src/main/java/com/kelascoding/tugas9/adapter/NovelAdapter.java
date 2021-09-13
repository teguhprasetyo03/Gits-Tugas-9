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
import com.kelascoding.tugas9.model.Novel;
import com.kelascoding.tugas9.webview.GramediaWebView;

import java.util.ArrayList;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.NovelViewHolder> {

    private Context context;
    private ArrayList<Novel> listNovel;

    public NovelAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Novel> getListNovel(){
        return listNovel;
    }

    public void setListNovel(ArrayList<Novel> listNovel){
        this.listNovel = listNovel;
    }

    @NonNull
    @Override
    public NovelAdapter.NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview_book, parent, false );
        return new NovelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NovelAdapter.NovelViewHolder holder, int position) {
        Novel novel = getListNovel().get(position);
        Glide.with(context)
                .load(novel.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(novel.getJudul());

    }

    @Override
    public int getItemCount() {
        return getListNovel().size();
    }

     class NovelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvTitle;

        public NovelViewHolder(@NonNull View itemView) {
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
             Novel novel = getListNovel().get(positon);

             novel.setJudul(novel.getJudul());
             novel.setPenerbit(novel.getPenerbit());
             novel.setTahunterbit(novel.getTahunterbit());
         }
     }
}
