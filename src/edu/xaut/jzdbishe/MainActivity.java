package edu.xaut.jzdbishe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	private EditText username = null;
//	private EditText password = null;
//	private Button register = null;
	private Button login = null;
	private String usernameStr = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		username = (EditText)findViewById(R.id.username);
//		password = (EditText)findViewById(R.id.password);
		
//		register = (Button)findViewById(R.id.register);
		login = (Button)findViewById(R.id.login);
		
		usernameStr = username.getText().toString();
//		passwordStr = password.getText().toString();
		
//		register.setOnClickListener(new OnClickListener(){
//
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				Intent intent = new Intent();
//				Bundle bundle = new Bundle();
//				bundle.putString("username", usernameStr);
//				bundle.putString("password", passwordStr);
//				intent.putExtra("info", bundle);
//				intent.setClass(MainActivity.this, ShowInfo.class);
//				startActivity(intent);
//			}
//			
//		});
		
		login.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				Bundle bundle = new Bundle();
				bundle.putString("username", usernameStr);
				intent.putExtra("info", bundle);
				intent.setClass(MainActivity.this, ActivityRecognition.class);
				startActivity(intent);
			}
			
		});
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
