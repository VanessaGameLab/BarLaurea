package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonsActivity extends Activity implements OnClickListener {

	//Creating the buttons
	
	private Button urlButton;
	private Button localButton;
	private Button contactButton;
	private Button stampButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		/*the VM to run the code in addition to the 
		 * existing code in the onCreate() of the parent class.*/
		
		super.onCreate(savedInstanceState);
		
		//setting your layout from activity_buttons.xml file

		setContentView(R.layout.activity_buttons);
		
		/*Assigning to the created buttons the IDs of the objects 
		 *   created in the xml file */
		
		urlButton 	= (Button)findViewById(R.id.urlButton);
		localButton	= (Button)findViewById(R.id.localButton);
		contactButton = (Button)findViewById(R.id.contactButton);
		stampButton = (Button)findViewById(R.id.stampButton);
		
		
		// Setting onClickListener for both buttons
		urlButton.setOnClickListener(this);
		localButton.setOnClickListener(this);
		contactButton.setOnClickListener(this);
		stampButton.setOnClickListener(this);
		
	}

	/// If one of the buttons is pressed  its starts the assigned activity for it 
	
	@Override
	public void onClick(View v) {
		if (urlButton.isPressed()) {
			Intent i = new Intent(this, URLActivity.class);
			this.startActivity(i);
			
		} else 
				if (localButton.isPressed()) {
					Intent i = new Intent(this, LocalActivity.class);
					this.startActivity(i);
				}
				
				else 
					
					if (contactButton.isPressed())
					{Intent i = new Intent (this, ContactActivity.class);
					this.startActivity(i);}
					
					else 
						if (stampButton.isPressed()){
							Intent i = new Intent (this, QRActiviry.class);
							this.startActivity(i);
				}
	}

}

