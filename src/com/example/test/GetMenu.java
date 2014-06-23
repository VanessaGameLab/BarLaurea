package com.example.test;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
	 
	public class GetMenu extends Activity implements OnClickListener {
	
	 private Button button;
	 private Button button1;
	 private Button button2;

	 
	 private int[]  image = new int[] { R.drawable.images, R.drawable.images1, R.drawable.images2, R.drawable.images3, R.drawable.images4 };
	 
	 
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	       
			button = (Button)findViewById(R.id.add);
			button1 = (Button)findViewById(R.id.remove);
			button2 =(Button)findViewById(R.id.clear);
					
			button.setOnClickListener(this);
			button1.setOnClickListener(this);
			button2.setOnClickListener(this);
			
	    }
	 
	    		 
	    		
	    
	    
		@Override
		public void onClick(View v) {
			

			
		}
		
	
	
	}
