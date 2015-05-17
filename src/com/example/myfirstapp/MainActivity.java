package com.example.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

// ActionBarActivity�� ȣȯ�� ������ �־ Activity�� �ٲߴϴ�.
public class MainActivity extends Activity {

	/* 1. �� ����� �� �����մϴ�*/
	
	// activity_main.xml���� �����ߴ� text1�� ����� ����
	TextView txtText1 = null;
	
	// ī��Ʈ�� ������ ����
	int nShow = 0;
	
	// ������ �� ����Ǵ� �Լ�@
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 2. text1�� txtText1���� �����մϴ�.
        txtText1 = (TextView)findViewById(R.id.text1);
    }
    
    // ȭ�鿡 ������ �� ����Ǵ� �Լ�
    @Override
    protected void onResume(){
        super.onResume();	
        
        //3.  �̰��� �ڵ�(���)�� �մϴ�.
        txtText1.setText("ȭ�� �������� Ƚ�� = " + nShow++);
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
