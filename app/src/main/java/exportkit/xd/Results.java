package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Results extends AppCompatActivity {
private Button img;
private Button home;
private FloatingActionButton setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        img = (Button) findViewById(R.id.img_btn);
        home= (Button) findViewById(R.id.homescrn_btn);
        setting =(FloatingActionButton) findViewById(R.id.set_btn);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaptureImage_activity();
            }


        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomescreen_activity();
            }


        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings_activity();
            }


        });


    }


    public void opencaptureImage_activity(){
        Intent intent = new Intent(this, captureimage.class);
        startActivity(intent);
    }
    public void openHomescreen_activity(){
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }
    public void openSettings_activity(){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    }
