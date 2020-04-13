package com.example.juliansharon.securitysystem;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class generator extends AppCompatActivity {
    ImageView imageView;
    Button create;
    TextView infor;
    FirebaseDatabase fb;
    DatabaseReference dd;
    public  String _DATE,_MONTH,_HOURS,_YEAR,_MINUTES,NAME1,DATE1,MONTH1,HOURS1,YEAR1,MINUTES1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        imageView=findViewById(R.id.image);
        create=(Button)findViewById(R.id.gen_btn);
        infor=(TextView)findViewById(R.id.info);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb = FirebaseDatabase.getInstance();
                dd = fb.getReference();

                DATE1 = Main7Activity.userdate;
                NAME1 = Main7Activity.username;

                MINUTES1 = Main7Activity.usertime1;
               if(Payment.flag==1)
               {
                infor.setText("HAPPY JOURNEY.....");
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try {

                    BitMatrix bitMatrix = multiFormatWriter.encode("NAME   " + NAME1 + "   ALLOWED", BarcodeFormat.QR_CODE, 200, 200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    imageView.setImageBitmap(bitmap);

                } catch (WriterException e) {
                    e.printStackTrace();
                } }
                else
               {
                   infor.setText("Please pay to proceed....");
               }


            }

    });
}
}
