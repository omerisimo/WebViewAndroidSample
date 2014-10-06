package com.klarna.inapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void openWebView(View view) {
		EditText urlEditText = (EditText)findViewById(R.id.url);
		// Build new Intent to open the WebViewActivity
		Intent intent = new Intent(this, WebViewActivity.class);
		// Add a parameter to the Intent with the URL from the text field
		intent.putExtra("WEBVIEW_URL", urlEditText.getText().toString());
		startActivity(intent);
	}
}
