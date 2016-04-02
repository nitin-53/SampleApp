package com.bigsystem.SampleApp;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

import Array.CollectionOfArray;



public class SampleAppActivity extends Activity {
    /** Called when the activity is first created. */

	public CollectionOfArray objArray;
	public Calendar cal;

	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

       TextView txtView=(TextView)findViewById(R.id.date);
       TextView thought=(TextView)findViewById(R.id.thought);
         
        objArray=new CollectionOfArray();
        cal=Calendar.getInstance();
        String date = cal.get(Calendar.DATE) + " " +
                objArray.get_currentMonth(cal.get(Calendar.MONTH)) + ", " + cal.get(Calendar.YEAR);
        String thoughtString = ""+objArray.get_todayThought(cal.get(Calendar.DAY_OF_YEAR));

    	txtView.setText(date);
        thought.setText(thoughtString);
    }

}