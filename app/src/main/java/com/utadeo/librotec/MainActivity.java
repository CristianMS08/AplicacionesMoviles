package com.utadeo.librotec;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_perfil) {
            Intent per = new Intent(this, Perfil.class);
            startActivity(per);
        }else if(id == R.id.action_cerrar){
            Intent cer = new Intent(this, Login.class);
            startActivity(cer);
        }else if(id == R.id.action_libros){
            Intent lib = new Intent(this, MisLibros.class);
            startActivity(lib);
        }else if(id == R.id.action_mensajes){
            Intent me = new Intent(this, Mensajes.class);
            startActivity(me);
        }else if(id == R.id.action_principal){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void toOption(View view){
        Intent op = new Intent(this, Libros.class);
        startActivity(op);
    }
}
