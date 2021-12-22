package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.liferay.mobile.screens.auth.login.LoginListener;
import android.widget.Toast;
import com.liferay.mobile.screens.context.User;
import android.os.Bundle;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
public class MainActivity extends AppCompatActivity implements LoginListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login_screenlet);
        loginScreenlet.setListener(this);
    }

    public void onLoginSuccess(User user) {
        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
    }


    public void onLoginFailure(Exception e) {
        Toast.makeText(this, "Couldn't log in " + e.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAuthenticationBrowserShown() {

    }
}