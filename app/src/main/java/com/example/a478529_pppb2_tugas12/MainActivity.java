package com.example.a478529_pppb2_tugas12;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button_start;
    private ImageView copcar;
    private ImageView jefferson;
    private ImageView morton;
    private ImageView schmidt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start = findViewById(R.id.button_start);
        copcar = findViewById(R.id.copcar);
        jefferson = findViewById(R.id.jefferson);
        morton = findViewById(R.id.morton);
        schmidt = findViewById(R.id.schmidt);

        copcar.setVisibility(View.VISIBLE);
        jefferson.setVisibility(View.VISIBLE);
        morton.setVisibility(View.VISIBLE);
        schmidt.setVisibility(View.VISIBLE);

        ObjectAnimator copcarAnimator = ObjectAnimator.ofFloat(copcar, "X", 30);
        ObjectAnimator jeffersonrAnimator = ObjectAnimator.ofFloat(jefferson, "X", 30);
        ObjectAnimator mortonAnimator = ObjectAnimator.ofFloat(morton, "X", 30);
        ObjectAnimator schmidtAnimator = ObjectAnimator.ofFloat(schmidt, "X", 30);

        copcarAnimator.setDuration(1500);
        jeffersonrAnimator.setDuration(1000);
        mortonAnimator.setDuration(2000);
        schmidtAnimator.setDuration(500);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(
                        copcarAnimator,
                        jeffersonrAnimator,
                        mortonAnimator,
                        schmidtAnimator
                );

                animatorSet.start();
            }
        });
    }
}
