package com.example.mytestapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	TextView errorText;
	EditText username, password;
	String usernameVal;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle", "onCreate was called");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Button loginButton = (Button) findViewById(R.id.loginBtn);

        
        loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent homePage = new Intent(v.getContext(), HomePage.class);
				v.getContext().startActivity(homePage);
		       // errorText = (TextView) findViewById(R.id.errorMessage);
		       // username = (EditText) findViewById(R.id.emailAddress);
		       // password = (EditText) findViewById(R.id.passwordText);
				
				//usernameVal = username.getText().toString();
				
				//if (usernameVal != "malas")
				//{
				//errorText.setVisibility(View.INVISIBLE);
				//}
				//else
			//	{
				//	errorText.setVisibility(View.VISIBLE);
				//}
				
			}
		});
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


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("Life Cycle", "onDestroys was called");
		
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("Life Cycle", "onPause was called");
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("Life Cycle", "onResume was called");
	}
    
    
}
