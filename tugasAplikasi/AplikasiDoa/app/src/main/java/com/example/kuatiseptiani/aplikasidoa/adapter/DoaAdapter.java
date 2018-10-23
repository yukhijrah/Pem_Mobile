package com.example.kuatiseptiani.aplikasidoa.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kuatiseptiani.aplikasidoa.DetailActivity;
import com.example.kuatiseptiani.aplikasidoa.R;
import com.example.kuatiseptiani.aplikasidoa.model.Doa;
import com.example.kuatiseptiani.aplikasidoa.viewholder.DoaHolder;

import java.util.List;

/**
 * Created by kuatiseptiani on 23/10/18.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder>{

    Context context;
    List<Doa> item;

    public DoaAdapter(Context context, List<Doa> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, null);
        return new DoaHolder(v);
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtJudulDoa.setText(item.get(position).getJudul());
        //holder.txtAyatDoa.setText(item.get(position).getAyat());
        holder.txtArtiDoa.setText(item.get(position).getArti());

        holder.cardItemDoa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("id_judul", item.get(position).getJudul());
                i.putExtra("id_ayat", item.get(position).getAyat());
                i.putExtra("id_arti", item.get(position).getArti());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}




