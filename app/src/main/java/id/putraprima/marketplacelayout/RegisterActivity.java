package id.putraprima.marketplacelayout;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void clickKembaliLogin(View view) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
    public void clickProfile(View view) {
        Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}