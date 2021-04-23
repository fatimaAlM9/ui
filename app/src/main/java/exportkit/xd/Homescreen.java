package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homescreen extends AppCompatActivity {
private Button detectcolor;
private Button detectobject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        detectcolor =(Button) findViewById(R.id.color);
        detectobject= (Button) findViewById(R.id.object);

        detectcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           openColordetect_activity();
            }
        });

        detectobject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaptureImage_activity();
            }
        });

    }
    public void openColordetect_activity(){
        Intent color = new Intent(this, colordetect.class);
                startActivity(color);
    }

    public void openCaptureImage_activity(){
        Intent object = new Intent(this, captureimage.class);
        startActivity(object);

}}