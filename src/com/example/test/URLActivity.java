package com.example.test;


import android.annotation.SuppressLint;
//Indicates that Lint should ignore the specified warnings for the annotated element.
import android.app.Activity;
//  the Activity class takes care of creating a window for you in which you can place your UI 
import android.os.Bundle;
// A mapping from String values to various Parcelable types.
import android.webkit.WebView;
// This class is the basis upon which you can roll your own web browser or simply display some online content within your Activity.
import com.example.test.R;

public class URLActivity extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	
	// passing the information into the Intent's constructor
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		/* Calling the super.onCreate() method , 
		 *  tells the VM to run the code in addition to the 
		 * existing code in the onCreate() of the parent class.
		 */	
		super.onCreate(savedInstanceState);
		
		//setting your layout from activity_webvie.xml file
		
		setContentView(R.layout.activity_webview);
		
		
		/* creating an object webView from class WebView 
		 *  to which is assigned the id webView of the object 
		 *   created in the xml file */
		
		WebView webView = (WebView)findViewById(R.id.webView);
		
		// Setting the initial scale for this WebView.
		webView.setInitialScale(1);
		 // Enabling JavaScript
		webView.getSettings().setJavaScriptEnabled(true);
		// Enabling Overview mode
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);// enable wide view port
		
		webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);// used to hide strange scroll bar.
		webView.setScrollbarFadingEnabled(false);//disable the scrollbar
		
		// the object webView is loading the url
		webView.loadUrl("http://www.jamix.fi/ruokalistat/app?anro=97090"); 
	}
	
}

