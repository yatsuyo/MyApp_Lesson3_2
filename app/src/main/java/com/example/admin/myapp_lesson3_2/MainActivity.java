package com.example.admin.myapp_lesson3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 課題
        Human human = new Human("ヤツ", 32, "アプリ開発");

        human.say();
        human.think();
    }
}
