package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class viewImage extends AppCompatActivity {
private Button retry;
private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        retry = (Button) findViewById(R.id.retry_btn);
        ok = (Button) findViewById(R.id.ok_btn);

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaptureImage_activity();
            }


        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResults_activity();
            }


        });


    }


    public void opencaptureImage_activity(){
        Intent intent = new Intent(this, captureimage.class);
        startActivity(intent);
    }
    public void openResults_activity(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
}