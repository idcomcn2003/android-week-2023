package com.czh.myapplication;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        addListenerRadioGroup();
    }

    private void addListenerRadioGroup() {
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String city = "";
                // 处理选项的选择事件
                switch (checkedId) {
                    case R.id.radio_button1:
                        // 选中了Option 1
                        city = "北京";
                        break;
                    case R.id.radio_button2:
                        // 选中了Option 2
                        city = "上海";
                        break;
                    case R.id.radio_button3:
                        // 选中了Option 3
                        city = "广州";
                        break;
                    case R.id.radio_button4:
                        // 选中了Option 3
                        city = "深圳";
                        break;
                    default:
                        break;
                }
                textView.setText("您选择的城市是:" + city);
            }
        });
    }


}
