package com.lco.lcoproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lco.lcoproject.Model.User;
import com.lco.lcoproject.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewAdapter> {
    Context context;
    List<User>list;
    public HomeAdapter(Context context,List<User>list){
        this.context=context;
        this.list=list;

    }

    @NonNull
    @Override
    public HomeViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.homeitem,parent,false);
        return new HomeViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewAdapter holder, int position) {
        User data=list.get(position);
        holder.titleHome.setText(data.getName());
        holder.descHOme.setText(data.getCity());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewAdapter extends RecyclerView.ViewHolder{
        TextView titleHome,descHOme;

        public HomeViewAdapter(@NonNull View itemView) {
            super(itemView);
            titleHome=itemView.findViewById(R.id.homeitemtitle);
            descHOme=itemView.findViewById(R.id.homeitemdesc);

        }
    }

}
