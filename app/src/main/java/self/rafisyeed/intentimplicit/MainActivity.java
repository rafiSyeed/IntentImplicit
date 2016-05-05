package self.rafisyeed.intentimplicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.button);
        Button bt2 = (Button) findViewById(R.id.button2);
        Button bt3 = (Button) findViewById(R.id.button3);
        Button bt4 = (Button) findViewById(R.id.button4);
        Button bt5 = (Button) findViewById(R.id.button5);
        Button bt6 = (Button) findViewById(R.id.button6);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"));
                startActivity(browser);
                break;
            case R.id.button2:
                Intent dialer = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"));
                startActivity(dialer);
                break;
            case R.id.button3:
                Intent camera = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(camera);
                break;
            case R.id.button4:
                Intent email = new Intent(android.content.Intent.ACTION_SEND);
                email.setType("plain/text");
                startActivity(email);
                break;
            case R.id.button5:
                Intent contact = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(contact);
                break;
            case R.id.button6:
                finish();
                break;
        }
    }
}
