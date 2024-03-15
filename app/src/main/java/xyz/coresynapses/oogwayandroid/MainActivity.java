package xyz.coresynapses.oogwayandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @SuppressLint("ResourceType") View v = this.findViewById(1);

        this.setContentView(v);
    }
}
