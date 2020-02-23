package com.ngyb.newfeaturesix;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/23 17:42
 */
public class ModuleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
    }

    public void BottomSheetDialog(View view) {
        Intent intent = new Intent(this, BottomSheetDialogActivity.class);
        startActivity(intent);
    }

    public void TextInputLayout(View view) {
        Intent intent = new Intent(this, TextInputLayoutActivity.class);
        startActivity(intent);
    }
}
