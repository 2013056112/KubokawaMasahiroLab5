package masahiro.kubokawa.com.kubokawamasahirolab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button1 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Activity1.class);
                view.getContext().startActivity(Intent);}
        });

        button2 = (Button) findViewById(R.id.button5);

        button2.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent i = null, chooser = null;
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo://14.594318,120.970607"));
                chooser = Intent.createChooser(i, "Choose map app");
                startActivity(chooser);
            }
        });
    }
}
