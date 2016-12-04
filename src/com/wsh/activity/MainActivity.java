package com.wsh.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.dtr.zxing.activity.CaptureActivity;
import com.example.zxingdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_zx = (TextView) findViewById(R.id.tv_zx);
        tv_zx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it =  new Intent(MainActivity.this,CaptureActivity.class);
				startActivity(it);
			}
		});
    }

    
}
