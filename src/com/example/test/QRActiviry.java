package com.example.test;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class QRActiviry extends Activity  {

private String scanContent;
private Activity mActivity;

	    

	@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	mActivity = this;        
	
	
	IntentIntegrator integrator = new IntentIntegrator(mActivity);              
	integrator.initiateScan();
	            }
	   
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
	        
	IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
	        
	if (scanResult != null) {
		

		scanContent = scanResult.getContents();
 
		if (scanContent.equals("Elena")) {intent = new Intent (this, GetMenu.class); this.startActivity(intent);	}
 
		else Toast.makeText(getApplicationContext(), "Error",Toast.LENGTH_SHORT).show();	
	}
	
	}
}
