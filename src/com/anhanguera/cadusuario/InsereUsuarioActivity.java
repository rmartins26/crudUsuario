package com.anhanguera.cadusuario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class InsereUsuarioActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insere_usuario);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.insere_usuario, menu);
		return true;
	}

}
