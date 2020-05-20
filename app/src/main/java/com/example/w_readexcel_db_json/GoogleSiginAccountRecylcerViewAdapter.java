package com.example.w_readexcel_db_json;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GoogleSiginAccountRecylcerViewAdapter extends RecyclerView.Adapter<GoogleSiginAccountRecylcerViewAdapter.GoogleSiginAccountViewHodler> {
    List<GoogleSiginAccountResult> mData;

    public GoogleSiginAccountRecylcerViewAdapter(List<GoogleSiginAccountResult> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public GoogleSiginAccountViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_google_sigin_account,parent,false);
        GoogleSiginAccountViewHodler googleSiginAccountViewHodler = new GoogleSiginAccountViewHodler(view);
        return googleSiginAccountViewHodler;
    }

    @Override
    public void onBindViewHolder(@NonNull GoogleSiginAccountViewHodler holder, int position) {
            holder.txtWid.setText(mData.get(position).getwId());
            holder.txtNoun.setText(mData.get(position).getNoun());
            holder.txtReturn.setText(mData.get(position).getReturna());
            holder.txtDescription.setText(mData.get(position).getDescription());
            holder.txtZlass.setText(mData.get(position).getClazz());
            holder.txtExtend.setText(mData.get(position).getExtend());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class GoogleSiginAccountViewHodler extends RecyclerView.ViewHolder {
        private TextView txtWid,txtNoun,txtReturn,txtDescription,txtZlass,txtExtend;

        public GoogleSiginAccountViewHodler(@NonNull View itemView) {
            super(itemView);

            txtWid =  itemView.findViewById(R.id.txtWid);
            txtNoun =  itemView.findViewById(R.id.txtNoun);
            txtReturn = itemView.findViewById(R.id.txtReturn);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtZlass = itemView.findViewById(R.id.txtZlass);
            txtExtend = itemView.findViewById(R.id.txtExtend);
        }
    }
}
