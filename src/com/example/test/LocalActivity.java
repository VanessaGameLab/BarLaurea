package com.example.test;


import android.app.Activity;
//the Activity class takes care of creating a window for you in which you can place your UI 
import android.os.Bundle;
//A mapping from String values to various Parcelable types.
import android.webkit.WebView;
//This class is the basis upon which you can roll your own web browser or simply display some online content within your Activity.
import com.example.test.R;

public class LocalActivity extends Activity {

	@Override
	// passing the information into the Intent's constructor

	protected void onCreate(Bundle savedInstanceState) {
		
		/* Calling the super.onCreate() method , 
		 *  tells the VM to run the code in addition to the 
		 * existing code in the onCreate() of the parent class.
		 */		
		super.onCreate(savedInstanceState);
				
		//setting your layout from activity_webview.xml file

		setContentView(R.layout.activity_webview);
		
		// Creating a string object data
		
		StringBuffer data = new StringBuffer(); 
		
		// Converting the string data into an HTML in the Webview
		
		data.append("<div>");
		data.append("Menu");
		data.append("<br/>");
		data.append("<br/>1. Cofee 1,30"); 
		data.append("<br/>2. Smoothie 2,70");
		data.append("<br/>3. Tea 0,80");
		data.append("<br/>4. .....");
		data.append("</div>");
		
		
		/* creating an object webView from class WebView 
		 *  to which is assigned the id webView of the object 
		 *   created in the xml file */
		
		WebView webView = (WebView)findViewById(R.id.webView);
		
		// passing the converted data to the webview
		
		webView.loadData(data.toString(), "text/html", "UTF-8");	}
	
}
