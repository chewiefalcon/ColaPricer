package com.example.colapricer;

//import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ImageButton buttonImg = (ImageButton) findViewById(R.id.btnBerrylize1);
        
        
        buttonImg.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				double iNumCans = 0, iNumVolume = 0, iNumPrice = 0;
				double iNumCans2 = 0, iNumVolume2 = 0, iNumPrice2 = 0;
				double iResult = 0, iResult2 = 0;
				EditText numCans = (EditText) findViewById(R.id.numberObjects);
				EditText numVolume = (EditText) findViewById(R.id.volumePerObject);
				EditText numPrice = (EditText) findViewById(R.id.price);
				EditText numCans2 = (EditText) findViewById(R.id.numberObjects2);
				EditText numVolume2 = (EditText) findViewById(R.id.volumePerObject2);
				EditText numPrice2 = (EditText) findViewById(R.id.price2);
				
		    	if ( numCans.length() > 0 ) {
		    		iNumCans = Double.parseDouble(numCans.getText().toString());
		    	}
		    	if ( numVolume.length() > 0 ) {
		    		iNumVolume = Double.parseDouble(numVolume.getText().toString());
		    	}
		    	if ( numPrice.length() > 0 ) {
		    		iNumPrice = Double.parseDouble(numPrice.getText().toString());
		    	}
		    	
		    	if ( numCans2.length() > 0 ) {
		    		iNumCans2 = Double.parseDouble(numCans2.getText().toString());
		    	}
		    	if ( numVolume2.length() > 0 ) {
		    		iNumVolume2 = Double.parseDouble(numVolume2.getText().toString());
		    	}
		    	if ( numPrice2.length() > 0 ) {
		    		iNumPrice2 = Double.parseDouble(numPrice2.getText().toString());
		    	}

		    	if ( ( iNumCans >  0 ) && ( iNumVolume > 0 ) && ( iNumPrice > 0 ) ) {
		    		iResult = iNumPrice / ( iNumCans * iNumVolume ) * 100;
		    	}
		    	
		    	if ( ( iNumCans2 >  0 ) && ( iNumVolume2 > 0 ) && ( iNumPrice2 > 0 ) ) {
		    		iResult2 = iNumPrice2 / ( iNumCans2 * iNumVolume2 ) * 100;
		    	}
		    	TextView txtResults = (TextView) findViewById(R.id.txt_results);
		    	txtResults.setText( String.format("%s = %.4f", txtResults.getHint(), iResult) );

		    	TextView txtResults2 = (TextView) findViewById(R.id.txt_results2);
		    	txtResults2.setText( String.format("%s = %.4f", txtResults.getHint(), iResult2) );
		    	
		    	if ( iResult > iResult2 ) {
		    		
		    	} else if ( iResult < iResult2 ) {
		    		
		    	} else {
		    		
		    	}
			}
			
		});
        
    }

}
