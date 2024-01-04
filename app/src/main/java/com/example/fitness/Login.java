package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.fitness.modules.data.FirebaseAuthHelper;
import com.example.fitness.modules.ui.login.LoginResult;
import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

//    private EditText editTextEmail;
//    private EditText editTextPassword;
//    private Button buttonRegister;
//    private Button buttonLogin;
//    private Button buttonGoogleSignIn;
//    private LoginButton buttonFacebookSignIn;
//    private FirebaseAuthHelper authHelper;
//    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView username =(TextView) findViewById(R.id.editTextTextEmailAddress);
        TextView password =(TextView) findViewById(R.id.editTextTextPassword);

        Button loginbtn = (Button) findViewById(R.id.loginbutton);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(Login.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(Login.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

//        authHelper = new FirebaseAuthHelper(this);
//
//        // Initialize the Facebook CallbackManager
//        Object callbackManager = CallbackManager.Factory.create();
//
//        // Bind the UI components
//        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
//        editTextPassword = findViewById(R.id.editTextTextPassword);
//        buttonRegister = findViewById(R.id.buttonRegister);
//        buttonLogin = findViewById(R.id.loginbutton);
//        buttonGoogleSignIn = findViewById(R.id.buttonGoogleSignIn);
//        buttonFacebookSignIn = findViewById(R.id.buttonFacebookSignIn);
//
//        // Set up the button listeners
//        buttonRegister.setOnClickListener(v -> {
//            String email = editTextEmail.getText().toString();
//            String password = editTextPassword.getText().toString();
//            // Call the FirebaseAuthHelper to create a new user
//            authHelper.registerNewUser(email, password);
//        });
//
//        buttonLogin.setOnClickListener(v -> {
//            String email = editTextEmail.getText().toString();
//            String password = editTextPassword.getText().toString();
//            // Call the FirebaseAuthHelper to sign in the user
//            authHelper.signInUser(email, password);
//        });
//
//        buttonGoogleSignIn.setOnClickListener(v -> {
//            // Call the FirebaseAuthHelper to start Google sign-in process
//            authHelper.signInWithGoogle();
//        });
//
//        buttonFacebookSignIn.setOnClickListener(v -> {
//            // The actual login process for Facebook is handled by the LoginButton itself,
//            // but you may want to call a method on your FirebaseAuthHelper in the callback
//        });
//
//        // Facebook Callback registration
//        buttonFacebookSignIn.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//            @Override
//            public void onSuccess(LoginResult loginResult) {
//                // App code
//                authHelper.signInWithFacebook(loginResult.getAccessToken());
//            }
//
//            @Override
//            public void onCancel() {
//                // App code
//            }
//
//            @Override
//            public void onError(FacebookException exception) {
//                // App code
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        // Pass the activity result back to the Facebook SDK
//        callbackManager.onActivityResult(requestCode, resultCode, data);
//        // Pass the activity result back to the FirebaseAuthHelper
//        authHelper.onActivityResult(requestCode, resultCode, data);
//    }
//
//
 }
}