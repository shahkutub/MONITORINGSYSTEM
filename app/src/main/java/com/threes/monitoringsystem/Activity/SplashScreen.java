package com.threes.monitoringsystem.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.threes.monitoringsystem.Activity.utils.PersistentUser;
import com.threes.monitoringsystem.R;

/**
 * Created by Sadi on 2/11/2018.
 */

public class SplashScreen extends AppCompatActivity{

    private static int SPLASH_TIME_OUT = 3000;
    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        con = this;
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                if(PersistentUser.isLogged(con)){
//                    Operation operation = new Operation(con);
//                    operation.loginWithServer(con, PersistData.getStringData(con, AppConstant.userEmail),PersistData.getStringData(con, AppConstant.userPassword));
                    startActivity(new Intent(con,MainActivity.class));
                    finish();
                }else {
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        }, SPLASH_TIME_OUT);
    }
}
