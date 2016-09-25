package tk.talcharnes.joketellingapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.MyJokeClass;
import com.example.OtherJokeClass;

public class MainActivity extends AppCompatActivity {
    MyJokeClass myJokeClass;
    OtherJokeClass otherJokeClass;
    String[] jokeArray;
    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myJokeClass = new MyJokeClass();
        otherJokeClass = new OtherJokeClass();

        jokeArray = myJokeClass.getJOKE_ARRAY();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            int jokeArrayCount = 0;
            @Override
            public void onClick(View view) {
                if(jokeArrayCount < jokeArray.length){
                    joke = jokeArray[jokeArrayCount];
                    jokeArrayCount++;
                }
                else{
                    jokeArrayCount = 0;
                    joke = jokeArray[jokeArrayCount];
                }
                Toast.makeText(getApplicationContext(), joke, Toast.LENGTH_SHORT).show();

            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), otherJokeClass.getJoke(), Toast.LENGTH_SHORT).show();

            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
