package strathmore.com.bbitresource;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainLogin extends AppCompatActivity {

    EditText emailtext,passwordtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button Login=(Button)findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent LoginIntent = new Intent(MainLogin.this, MainHome.class);
                startActivity(LoginIntent);

            }

        });

        Button create = (Button) findViewById(R.id.create);
        emailtext = (EditText) findViewById(R.id.Email);
        passwordtext = (EditText) findViewById(R.id.Password);

        String emaivar = emailtext.getText().toString();
        String passwordvar = passwordtext.getText().toString();

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createIntent = new Intent(MainLogin.this, SignupActivity.class);
                startActivity(createIntent);
            }
        });


    }

}
