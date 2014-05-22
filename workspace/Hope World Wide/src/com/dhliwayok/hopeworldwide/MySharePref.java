package com.dhliwayok.hopeworldwide;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MySharePref {
	private static final String SHARED_PREF = "my.pref";
	private SharedPreferences myPref;
	private Editor editor;
	
	public MySharePref(Context context){
		this.myPref = context.getSharedPreferences(SHARED_PREF, Activity.MODE_PRIVATE);
		this.editor = myPref.edit();
	}

	public String getMyPref(String key){
		return myPref.getString(key, "");
	}
	
	public void saveMyPrefValue(String key, String value){
		editor.putString(key, value);
		editor.commit();
	}
	
	public boolean checkKey(String key){
		if(myPref.contains(key))
			return true;
		else
			return false;
	}
	
	public void clearPref(){
		editor.clear();
		editor.commit();
	}
}
