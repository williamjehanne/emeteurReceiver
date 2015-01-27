package com.william.monemetteurreceiver;

import com.william.monemetteurreceiver.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MonEmetteurBroadcast extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mon_emetteur_broadcast);
	}

	public void onClickBouton(View v) {
		Intent monIntent = new Intent();
		monIntent.setAction("com.william.monreceiverbroadcast.MON_INTENT");
		monIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
		sendBroadcast(monIntent);

		String message = "MainActivity :Intent Detected.";

		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}
}
