package com.klarna.inapp;

import java.util.Map;

import com.jockeyjs.Jockey;
import com.jockeyjs.JockeyHandler;
import com.jockeyjs.JockeyImpl;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		
		// Find the WebView object
		WebView webView = (WebView) findViewById(R.id.webview);

		// Jockey Setup
		Jockey jockey = JockeyImpl.getDefault();
	    jockey.configure(webView);

	    //Jokcey event listeners
	    jockey.on("userCreated", new JockeyHandler() {
	        @Override
	        protected void doPerform(Map<Object, Object> payload) {
	        	Log.d("jockey", "User token: "+payload.get("userToken") + " ; Phone Number: "+payload.get("phoneNumber"));
	        }
	    });

	    jockey.on("userReady", new JockeyHandler() {
	        @Override
	        protected void doPerform(Map<Object, Object> payload) {
	        	finish();
	        }
	    });

	    // Read the URL parameter from the intent and load URL 
		String url= getIntent().getStringExtra("WEBVIEW_URL");
		webView.loadUrl(url);

	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
}
