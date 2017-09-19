package strathmore.com.bbitresource;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    Button create1;
    EditText Email1,password1,phone,fname,password,lname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Email1 = (EditText) findViewById(R.id.Email1);
        password1 = (EditText) findViewById(R.id.Password1);





        create1 = (Button) findViewById(R.id.create1);
        create1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taker = Email1.getText().toString();
                Intent tohome = new Intent(SignupActivity.this,MainHome.class);
                startActivity(tohome);

                Intent senddata = new Intent(SignupActivity.this,MainHome.class);
                senddata.putExtra("x",taker);
                startActivity(senddata);
            }
        });


    }
}
