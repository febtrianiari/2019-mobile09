package id.ac.polinema.tugas1febtria.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import id.ac.polinema.tugas1febtria.R;
import id.ac.polinema.tugas1febtria.models.Buah;

public class BuahAdapter extends RecyclerView.Adapter<BuahAdapter.MyView> {
    List<Buah> buahList;

    public BuahAdapter(List<Buah> buahList) {
        this.buahList = buahList;
    }

    @NonNull
    @Override
    public BuahAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View buahView = layoutInflater.inflate(R.layout.item_buah,parent,false);
        MyView viewHolder = new MyView(buahView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BuahAdapter.MyView holder, int position) {
        Buah buah = buahList.get(position);
        holder.nama.setText(buah.getNamaBuah());
        holder.detail.setText(buah.getDetailBuah());
        holder.gambar.setImageResource(buah.getBuah());
    }

    @Override
    public int getItemCount() {
        return (buahList != null ? buahList.size() : 0);
    }

    public class MyView extends RecyclerView.ViewHolder {
        public TextView nama;
        public TextView detail;
        public ImageView gambar;
        public MyView(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaB);
            detail = itemView.findViewById(R.id.detailB);
            gambar = itemView.findViewById(R.id.gambarB);
        }
    }
}
