package com.example.user.recyclerview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView horizontal_recycler_view;

private ArrayList<String> horizontal_list;

//private HorizontalAdapter horizontalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontal_recycler_view=(RecyclerView)findViewById(R.id.horizontalrv);
        horizontal_list=new ArrayList<String>();
        horizontal_list.add("Horizontal 1 ");
        horizontal_list.add("Horizontal 2 ");
        horizontal_list.add("Horizontal 3 ");
        horizontal_list.add("Horizontal 4 ");
        horizontal_list.add("Horizontal 5 ");
        horizontal_list.add("Horizontal 6 ");
        horizontal_list.add("Horizontal 7 ");
        horizontal_list.add("Horizontal 8 ");
        horizontal_list.add("Horizontal 9 ");
        horizontal_list.add("Horizontal 10 ");




//        horizontalAdapter=new HorizontalAdapter(horizontal_list);
//
//
//        LinearLayoutManager horizontalLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
//
//        horizontal_recycler_view.setAdapter(horizontalAdapter);

    }
    public  class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {
        private List<String> horizontallist;
        public class MyViewHolder extends RecyclerView.ViewHolder
        {
       public TextView textview;
       public MyViewHolder(View view)
          {
      super(view);
      textview=(TextView)view.findViewById(R.id.txtvw);
           }


        }
        public HorizontalAdapter(List<String> horizontallist)
        {
            this.horizontallist=horizontal_list;

        }
        public MyViewHolder onCreateViewHolder(ViewGroup parent,int ViewType)
        {
            View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal,parent,false);
            return new MyViewHolder(itemview);
        }



        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            holder.textview.setText(horizontallist.get(position));
            holder.textview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,holder.textview.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return horizontallist.size();
        }


    }

}
