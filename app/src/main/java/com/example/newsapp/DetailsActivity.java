package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapp.Models.NewsHeadlines;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView txt_title, txt_author, txt_time, txt_detail, txt_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.text_detail_title);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");
    }
}