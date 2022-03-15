package com.example.vothitragiang_19510771_btth_tuan5.adapter;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.vothitragiang_19510771_btth_tuan5.model.Donut;
import com.example.vothitragiang_19510771_btth_tuan5.R;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Donut> donutList;
    private int positionSelect = -1;

    public ListAdapter(Context context, int idLayout, List<Donut> donutList) {
        this.context = context;
        this.idLayout = idLayout;
        this.donutList = donutList;
    }

    @Override
    public int getCount() {
        if(donutList.size() != 0 && !donutList.isEmpty()){
            return donutList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
        }

        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvDescription = convertView.findViewById(R.id.textViewDescription);
        TextView tvPrice = convertView.findViewById(R.id.textViewPrice);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        final ConstraintLayout constraintLayout  = convertView.findViewById(R.id.idLinearLayout);
        final Donut donut = donutList.get(position);

        if (donutList != null && !donutList.isEmpty()) {
            tvName.setText(donut.getName());
            tvDescription.setText(donut.getDescription());
            tvPrice.setText(String.valueOf(donut.getPrice()));
            int idLanguage = donut.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.donut_yellow_1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.tasty_donut_1);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.donut_red_1);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.green_donut_1);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, donut.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            constraintLayout.setBackgroundColor(Color.BLUE);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}