package com.example.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

// ActionBarActivity는 호환성 문제가 있어서 Activity로 바꿉니다.
public class MainActivity extends Activity {

	/* 1. 뭘 사용할 지 선언합니다*/
	
	// activity_main.xml에서 선언했던 text1을 사용할 변수
	TextView txtText1 = null;
	
	// 카운트값 저장할 변수
	int nShow = 0;
	
	// 생성될 때 실행되는 함수@
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 2. text1을 txtText1으로 저장합니다.
        txtText1 = (TextView)findViewById(R.id.text1);
    }
    
    // 화면에 보여질 때 실행되는 함수
    @Override
    protected void onResume(){
        super.onResume();	
        
        //3.  이곳에 코딩(명령)을 합니다.
        txtText1.setText("화면 보여지는 횟수 = " + nShow++);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
