package com.example.vince.youtubeplayertest.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vince.youtubeplayertest.Activities.hub_admin_only.QueueActivity;
import com.example.vince.youtubeplayertest.Activities.users_only.SearchHub;
import com.example.vince.youtubeplayertest.R;

public class MainActivity extends AppCompatActivity {
    Button backendButton;
    Button testSearchButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backendButton = (Button) findViewById(R.id.test_button_database);
        backendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QueueActivity.class));
            }
        });

        testSearchButton = (Button) findViewById(R.id.test_button_search_hubs);
        testSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchHub.class));
            }
        });

        submit = (Button) findViewById(R.id.submit_username);
    }

    public void toBack(View view) {
        startActivity(new Intent(this, BackendTestActivity.class));
    }
}