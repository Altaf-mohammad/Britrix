package android.com.britrix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Auth extends AppCompatActivity {

    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        register = (Button)findViewById(R.id.register);
        login = (Button)findViewById(R.id.Login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerintent = new Intent(Auth.this,Register.class);
                startActivity(registerintent);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent loginintent = new Intent(Auth.this,Login.class);
                startActivity(loginintent);
            }
        });

    }
}
