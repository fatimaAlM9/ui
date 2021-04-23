package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Settings extends AppCompatActivity {
 private Button cancel;
 private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancel = (Button) findViewById(R.id.cancel_btn);
        save= (Button) findViewById(R.id.save_btn);


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaptureImage_activity();
            }


        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomescreen_activity();
            }


        });



    }


    public void opencaptureImage_activity(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
    public void openHomescreen_activity(){
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }

    }
