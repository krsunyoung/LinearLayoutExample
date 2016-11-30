package com.estsoft.linearlayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by bit-user1 on 2016-11-25.
 */
//super 에 AppCompatActivity class 만들때 추가
public class SampleLayoutCodeActivity extends AppCompatActivity {
    //ctrl+O로 추가
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Hello");

        Button btn = new Button(this);
        btn.setText("button");

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL); // 내용을 밑으로 출력하게끔. 기본은 수평

        linearLayout.addView(textView);
        linearLayout.addView(btn);

        setContentView(linearLayout);
    }
}
