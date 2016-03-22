package authtest.rs.android.com.pushnotifications;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PushActivity extends AppCompatActivity {

    Intent browserIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle getExtras = getIntent().getExtras();
        if(null != getExtras&& getIntent().getExtras().containsKey("message") && getIntent().getExtras().containsKey("author")){

            String mes = getExtras.getString("message");
            String aut = getExtras.getString("author");

            if(aut.equals("URL")){

                browserIntent  = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                        startActivity(browserIntent);

            }

        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}
