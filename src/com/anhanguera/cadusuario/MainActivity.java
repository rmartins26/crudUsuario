package com.anhanguera.cadusuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button inserir;
	private Button alterar;
	private Button selecionar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		System.out.println("Inicio MainActivit - OnCreate");

		inserir = (Button) findViewById(R.id.btnIncluir);
		alterar = (Button) findViewById(R.id.btnAlterar);
		selecionar = (Button) findViewById(R.id.btnSelecionar);

		inserir.setOnClickListener(this);
		alterar.setOnClickListener(this);
		selecionar.setOnClickListener(this);

		System.out.println("Final MainActivit - OnCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		System.out.println("Inicio MainActivit - onClick");

		Intent intent;

		switch (v.getId()) {
		case R.id.btnAlterar:
			System.out.println("Passou alterar");
			intent = new Intent(this, AlteraUsuarioActivity.class);
			startActivity(intent);
			break;

		case R.id.btnIncluir:
			System.out.println("Passou incluir");
			intent = new Intent(this, InsereUsuarioActivity.class);
			startActivity(intent);
			break;

		case R.id.btnSelecionar:
			System.out.println("Passou selecionar");
			intent = new Intent(this, SelecionaUsuarioActivity.class);
			startActivity(intent);
			break;
			
		case R.id.btnFecha:
			System.out.println("Passou no fechar...");
		    this.onDestroy();
			break;

		}

		System.out.println("Final MainActivit - onClick");
	}

}
