package com.example.eventhandling;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button btnClick;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnClick = (Button) findViewById(R.id.btnClick);
        
        OnClickListener listener = new OnClickListener(){
        	 
        
        	
        	public void onClick(View arg0)
        	{
        		btnClick.setText("Button was clicked");
        		
        	}

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
        	
        };
        
        	btnClick.setOnClickListener((android.view.View.OnClickListener) listener);
        	
        	
        
    

    }
   
    
}
