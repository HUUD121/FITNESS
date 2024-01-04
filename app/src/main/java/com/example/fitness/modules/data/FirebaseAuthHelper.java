//package com.example.fitness.modules.data;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.widget.Toast;
//
//import com.example.fitness.R;
//import com.example.fitness.modules.ui.login.LoginResult;
//import com.google.android.gms.auth.api.signin.GoogleSignIn;
//import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
//import com.google.android.gms.auth.api.signin.GoogleSignInClient;
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//import com.google.android.gms.common.api.ApiException;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthCredential;
//import com.google.firebase.auth.FacebookAuthProvider;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.GoogleAuthProvider;
//
//    public class FirebaseAuthHelper {
//
//        private final FirebaseAuth auth;
//        private final GoogleSignInClient googleSignInClient;
//        private final Activity activity;
//
//        public FirebaseAuthHelper(Activity activity) {
//            this.activity = activity;
//            // Initialize Firebase Auth
//            auth = FirebaseAuth.getInstance();
//            // Configure Google Sign In
//            GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                    .requestIdToken(activity.getString(R.string.default_web_client_id))
//                    .requestEmail()
//                    .build();
//            googleSignInClient = GoogleSignIn.getClient(activity, gso);
//        }
//
//        public void registerNewUser(String email, String password) {
//            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
//                if (task.isSuccessful()) {
//                    // Sign in success, update UI with the signed-in user's information
//                    Toast.makeText(activity, "Registration successful.", Toast.LENGTH_SHORT).show();
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Toast.makeText(activity, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
//
//        public void signInUser(String email, String password) {
//            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
//                if (task.isSuccessful()) {
//                    // Sign in success
//                    Toast.makeText(activity, "Sign in successful.", Toast.LENGTH_SHORT).show();
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Toast.makeText(activity, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
//
//        public void signInWithGoogle() {
//            Intent signInIntent = googleSignInClient.getSignInIntent();
//            activity.startActivityForResult(signInIntent, RC_SIGN_IN);
//        }
//
//        public void handleGoogleSignInResult(Intent data) {
//            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
//            try {
//                GoogleSignInAccount account = task.getResult(ApiException.class);
//                firebaseAuthWithGoogle(account.getIdToken());
//            } catch (ApiException e) {
//                Toast.makeText(activity, "Google sign in failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        }
//
//        private void firebaseAuthWithGoogle(String idToken) {
//            AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
//            auth.signInWithCredential(credential)
//                    .addOnCompleteListener(activity, task -> {
//                        if (task.isSuccessful()) {
//                            // Sign in success
//                            Toast.makeText(activity, "Google sign in successful.", Toast.LENGTH_SHORT).show();
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(activity, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    });
//        }
//
//        public void signInWithFacebook(LoginResult.AccessToken token) {
//            AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
//            auth.signInWithCredential(credential)
//                    .addOnCompleteListener(activity, task -> {
//                        if (task.isSuccessful()) {
//                            // Sign in success
//                            Toast.makeText(activity, "Facebook sign in successful.", Toast.LENGTH_SHORT).show();
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(activity, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    });
//        }
//
//        // You can call this method from your Activity's onActivityResult method
//        public void onActivityResult(int requestCode, int resultCode, Intent data) {
//            // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
//            if (requestCode == RC_SIGN_IN) {
//                handleGoogleSignInResult(data);
//            }
//            // Pass the activity result back to the Facebook SDK
//            FirebaseAuthHelper callbackManager = null;
//            callbackManager.onActivityResult(requestCode, resultCode, data);
//        }
//
//        // Add other helper methods as needed...
//    }
//
//
