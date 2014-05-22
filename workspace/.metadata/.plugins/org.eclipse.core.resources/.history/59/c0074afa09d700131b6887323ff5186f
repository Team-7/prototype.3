package com.dhliwayok.hopeworldwide;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends Activity {
	
	private Button bmiCalc;
	private Button logout;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction("CLEAR_STACK");
		BroadcastReceiver r;
		r = new ActivitiesBroadcastReceiver();
		registerReceiver(r, intentFilter);
		
		TextView view = (TextView) findViewById(R.id.textView1);
		view.setTextColor(Color.BLACK);
		view.setText("Welcome "+LoginActivity.getName());
		
		bmiCalc = (Button) findViewById(R.id.calculateBmi);
		bmiCalc.setOnClickListener(new OnClickListener() {

			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 try {
						startActivity(new Intent(Menu.this, BMI_Activity.class));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		});
		
		logout = (Button) findViewById(R.id.Button02);
		logout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// set the title of the Alert Dialog
				alertDialogBuilder.setTitle("Logout");
				 // set dialog message
				alertDialogBuilder.setMessage("Are you sure you want to logout?").setCancelable(false).setPositiveButton("Yes",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {// if yes is clicked, close
	         
					 try {
							startActivity(new Intent(Menu.this, LoginActivity.class));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 }
			 }).setNegativeButton("No", new DialogInterface.OnClickListener() {
				 public void onClick(DialogInterface dialog,int id) {// if no is clicked, just close
					 // the dialog box and do nothing
					dialog.cancel();
				 }
				});
				
				AlertDialog alertDialog = alertDialogBuilder.create();
				alertDialog.show();
				
			}
		});
		
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onKeyDown(int, android.view.KeyEvent)
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
			// set the title of the Alert Dialog
			alertDialogBuilder.setTitle("Exit Application?");
			 // set dialog message
			alertDialogBuilder.setMessage("Are you sure you want to exit!").setCancelable(false).setPositiveButton("Yes",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {// if yes is clicked, close
                 // current activity
				//Intent intent = new Intent(Menu.this, MainActivity.class);
		        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		        //intent.putExtra("EXIT", false);
		        //startActivity(intent);
				Intent broadcastIntent = new Intent();
				broadcastIntent.setAction("CLEAR_STACK");
				sendBroadcast(broadcastIntent);
			 }
		 }).setNegativeButton("No", new DialogInterface.OnClickListener() {
			 public void onClick(DialogInterface dialog,int id) {// if no is clicked, just close
				 // the dialog box and do nothing
				dialog.cancel();
			 }
			});
			
			AlertDialog alertDialog = alertDialogBuilder.create();
			alertDialog.show();
			
	    }
		return super.onKeyDown(keyCode, event);
	}
	
class ActivitiesBroadcastReceiver extends BroadcastReceiver {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			finish();
		}
	}
	
}
