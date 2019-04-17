package xhb.xha.com.livebubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private BubbleLayout blBubble;
    private Button btnBubble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blBubble= (BubbleLayout) findViewById(R.id.blBubble);
        btnBubble= (Button) findViewById(R.id.btnBubble);
        btnBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blBubble.addBubbles();
            }
        });
    }
}
