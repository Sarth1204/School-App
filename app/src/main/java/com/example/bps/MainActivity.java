package com.example.bps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.icu.text.IDNA;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Opening page Notice
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Notice.class));
            }
        });


        //Opening page Calender.
        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Calender.class));
            }
        });


        //Opening page News.
        Button btn3 = (Button)findViewById(R.id.button3);

        btn3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, News.class));
            }
        });

        //Opening page Events.
        Button btn4 = (Button)findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Events.class));
            }
        });


        //Opening page Timetable.
        Button btn5 = (Button)findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Timetable.class));
            }
        });

        //Opening page Homework.
        Button btn6 = (Button)findViewById(R.id.button6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Homework.class));
            }
        });

        //open apply now link

        OPENLINK=findViewById(R.id.formbutton);

        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://docs.google.com/forms/d/e/1FAIpQLSep1ji2cX00O4eBzzr1DGokMABHzDJtwkwCuvDBWz19aB_WPA/closedform");

            }
        });


        //open website

        OPENLINK= findViewById(R.id.website);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://www.bpsmemorialps.com/");
            }
        });

        //unfinished code for whatsapp

        OPENLINK=findViewById(R.id.button13);

        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink3("");

            }
        });

        // Open Facebook

        OPENLINK=findViewById(R.id.button12);

        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink4("https://www.facebook.com/profile.php?id=100064838510141");

            }
        });

        //Open Youtube

        OPENLINK=findViewById(R.id.button11);

        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink5("https://www.youtube.com/channel/UCIX5VLrpyjnEAocQS71PYPA");

            }
        });


    }


    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void golink3(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    private void golink4(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void golink5(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id = item.getItemId();



        if(id == R.id.info) {
            Intent intent = new Intent(MainActivity.this,App_Info.class);
            startActivity(intent);

            return true;
        }

        else if (id == R.id.profile){
            Intent intent = new Intent(MainActivity.this,Profile.class);
            startActivity(intent);

                return true;
        }

        else if (id == R.id.settings){

            Intent intent = new Intent(MainActivity.this,settings.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.mouse){

            Intent intent = new Intent(MainActivity.this,Mouse.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}