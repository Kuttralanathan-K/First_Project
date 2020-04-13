package com.example.juliansharon.securitysystem;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class userlistadapter extends RecyclerView.Adapter<userlistadapter.ViewHolder> {
    public List<USERS> usersList;
    public userlistadapter(List<USERS> usersList){
        this.usersList=usersList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.uname.setText(usersList.get(i).getName());
        viewHolder.udate.setText(usersList.get(i).getDate());
        viewHolder.ureason.setText(usersList.get(i).getReason());
        viewHolder.utime.setText(usersList.get(i).getHour());
        viewHolder.utime1.setText(usersList.get(i).getMin());
        viewHolder.udate1.setText(usersList.get(i).getMonth());
        viewHolder.udate2.setText(usersList.get(i).getYear());

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       View mview;
       public TextView uname;
        public TextView udate;
        public TextView ureason;
        public TextView utime;
        public TextView utime1;
        public TextView udate1;
        public TextView udate2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            uname=(TextView)mview.findViewById(R.id.textView4);
            udate=(TextView)mview.findViewById(R.id.textView8);
            ureason=(TextView)mview.findViewById(R.id.textView9);
            utime=(TextView)mview.findViewById(R.id.textView10);
            utime1=(TextView)mview.findViewById(R.id.textView25);
            udate1=(TextView)mview.findViewById(R.id.textView21);
            udate2=(TextView)mview.findViewById(R.id.textView23);
        }
    }
}
