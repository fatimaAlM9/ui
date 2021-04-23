package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class captureimage extends AppCompatActivity {
private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captureimage);


        button = (ImageButton) findViewById(R.id.captureImage_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openviewImage_activity();
            }


        });

    }

    public void openviewImage_activity(){
        Intent intent = new Intent(this, viewImage.class);
        startActivity(intent);
    }
}