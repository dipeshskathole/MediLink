package com.example.medilink;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorsDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dipesh kathole ", "Hospital Address : Vasind ", "Exp : 15yrs", "Mobile No:0721577451","2500"},
                    {"Doctor Name : Yuvraj Kolekar ", "Hospital Address :Panvel ", "Exp : 13yrs", "Mobile No:0714228749","2000"},
                    {"Doctor Name : Benjamin Thompson", "Hospital Address : Mumbai", "Exp : 8yrs", "Mobile No:0790074955","1800"},
                    {"Doctor Name : Luca Rossi", "Hospital Address : Virar", "Exp : 13yrs", "Mobile No:0724949342","2000"},
                    {"Doctor Name : Om Kale ", "Hospital Address :Ulwe ", "Exp : 14yrs", "Mobile No:0769319921","2300"},
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Dipesh kathole ", "Hospital Address :Panvel ", "Exp : 15yrs", "Mobile No:0721577451","2500"},
                    {"Doctor Name : Yuvraj Kolekar", "Hospital Address : Thane", "Exp : 13yrs", "Mobile No:0714228749","2000"},
                    {"Doctor Name : Om Kale", "Hospital Address : Kalyan", "Exp : 8yrs", "Mobile No:0790074955","1800"},
                    {"Doctor Name : Luca Rossi", "Hospital Address : Vashi", "Exp : 13yrs", "Mobile No:0724949342","2000"},
                    {"Doctor Name : Benjamin Thompson", "Hospital Address :Seawoods ", "Exp : 14yrs", "Mobile No:0769319921","2300"},
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Yuvraj Kolekar ", "Hospital Address : Airoli", "Exp : 15yrs", "Mobile No:0721577451","2500"},
                    {"Doctor Name : Olivia Patel", "Hospital Address : Vasia", "Exp : 13yrs", "Mobile No:0714228749","2000"},
                    {"Doctor Name : Dipesh kathole ", "Hospital Address : Vasind", "Exp : 8yrs", "Mobile No:0790074955","1800"},
                    {"Doctor Name : Jacob Martinez", "Hospital Address : Bandra", "Exp : 13yrs", "Mobile No:0724949342","2000"},
                    {"Doctor Name : Om Kale", "Hospital Address : Kasara", "Exp : 14yrs", "Mobile No:0769319921","2300"},
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Om Kale  ", "Hospital Address : Bhivandi", "Exp : 15yrs", "Mobile No:0721577451","2500"},
                    {"Doctor Name : Benjamin Thompson", "Hospital Address : Seawoods", "Exp : 13yrs", "Mobile No:0714228749","2000"},
                    {"Doctor Name : Dipesh kathole", "Hospital Address : Kharghar", "Exp : 8yrs", "Mobile No:0790074955","1800"},
                    {"Doctor Name : Olivia Patel", "Hospital Address : Dombivli", "Exp : 13yrs", "Mobile No:0724949342","2000"},
                    {"Doctor Name : Yuvraj Kolekar", "Hospital Address : Mansarovar", "Exp : 14yrs", "Mobile No:0769319921","2300"},
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Jacob Martinez", "Hospital Address : Kalyan", "Exp : 15yrs", "Mobile No:0721577451","2500"},
                    {"Doctor Name : Luca Rossi", "Hospital Address : Shahapur", "Exp : 13yrs", "Mobile No:0714228749","2000"},
                    {"Doctor Name : Yuvraj Kolekar", "Hospital Address : Alibag", "Exp : 8yrs", "Mobile No:0790074955","1800"},
                    {"Doctor Name : Om Kale", "Hospital Address : Panvel", "Exp : 13yrs", "Mobile No:0724949342","2000"},
                    {"Doctor Name : Dipesh kathole", "Hospital Address Mumbai: Vasind", "Exp : 14yrs", "Mobile No:0769319921","2300"},
            };

    TextView tv ;
    Button btn ;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonLTBack);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physician")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorsDetailsActivity.this,FindDoctorActivity.class));
            }
        });
        list = new ArrayList();
        for (int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees"+" "+doctor_details[i][4]+"Rs");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewLT);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(DoctorsDetailsActivity.this,BookAppoinmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);

            }
        });

    }
}