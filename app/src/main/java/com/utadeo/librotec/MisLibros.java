package com.utadeo.librotec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MisLibros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_libros);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_perfil) {
            Intent per = new Intent(this, Perfil.class);
            startActivity(per);
        }else if(id == R.id.action_cerrar){
            Intent cer = new Intent(this, Login.class);
            startActivity(cer);
        }else if(id == R.id.action_libros){
            return true;
        }else if(id == R.id.action_mensajes){
            Intent me = new Intent(this, Mensajes.class);
            startActivity(me);
        }else if(id == R.id.action_principal){
            Intent pri = new Intent(this, MainActivity.class);
            startActivity(pri);
        }
        return super.onOptionsItemSelected(item);
    }
}
