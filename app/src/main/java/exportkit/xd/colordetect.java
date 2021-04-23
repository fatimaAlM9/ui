package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colordetect extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colordetect);

        button = (Button) findViewById(R.id.return_btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhomescreen_activity();
            }


        });

    }
    public void openhomescreen_activity(){
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }
}