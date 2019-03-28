package com.example.airguard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Pass;
    EditText User;
    Button Log;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pass=findViewById(R.id.TextP);
        User=findViewById(R.id.TextU);
        Log=findViewById(R.id.B);

    }

    public void LogIn(View button)
    {
        try
        {
                if(User.getText().toString().equals("Mario"))
                {
                    if(Pass.getText().toString().equals("Rossi"))
                    {
                        Context context = getApplicationContext();
                        CharSequence text = "bravo";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        Intent i = new Intent(MainActivity.this, Homepage.class);
                        startActivity(i);
                        return;
                    }
                }
            Context context = getApplicationContext();
            CharSequence text = "Password o User Errati";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        catch(Exception a)
        {
            System.out.println(a.getMessage());
            Context context = getApplicationContext();
            CharSequence text = "Ecce";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

}
