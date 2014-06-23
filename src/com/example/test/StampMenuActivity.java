package com.example.test;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
	 
	public class GetMenu extends Activity implements OnClickListener {
	
		//should change the name of this class to, for example, StampMenuActivity , should be noun phrase
		private Button addBtn;
		private Button removeBtn;
		private Button clearBtn;		 
		private int[]  image = new int[] { R.drawable.images, R.drawable.images1, R.drawable.images2, R.drawable.images3, R.drawable.images4 };
			
		private TextView resultTextView;
		private static final String RESULT_NUMBER="resultNumber";
		private SharedPreferences settings;
		private int result;
			
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	       
			addBtn = (Button)findViewById(R.id.add);
			removeBtn = (Button)findViewById(R.id.remove);
			clearBtn =(Button)findViewById(R.id.clear);
		
			addBtn.setOnClickListener(this);
			removeBtn.setOnClickListener(this);
			clearBtn.setOnClickListener(this);
			
			resultTextView = (TextView) findViewById(R.id.textView1);
			settings = getPreferences(MODE_PRIVATE);
			result=settings.getInt(RESULT_NUMBER, 0);
	    	resultTextView.setText(Integer.toString(result));
	    }	
	    
	    private void returnResult(String operation){
	    	//get current result
	    	result=settings.getInt(RESULT_NUMBER, 0);
	    	
	    	//calculate result based on operation
	    	if (operation=="+"){
	    		result++;
	    	}
	    	if (operation=="-"){
	    		result=result-1;
	    	}
	    	if (operation=="reset"){
	    		result=0;
	    	}
	    	
	    	//save preferences 
	    	SharedPreferences.Editor editor = settings.edit();
	    	editor.putInt(RESULT_NUMBER, result);
			editor.commit();
			
			//display result
			result=settings.getInt(RESULT_NUMBER, 0);
			resultTextView.setText(Integer.toString(result));
	    }

		@Override
		public void onClick(View v) {
			switch(v.getId()) {
		    case R.id.add:
		    	returnResult("+");
		        break;
		    case R.id.remove:
		    	returnResult("-");
		    	break;
		    case R.id.clear:
		    	returnResult("reset");
		        break;
		    }	
		}
	}
