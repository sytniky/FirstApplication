package edu.hillel.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRAS_PARAM1 = "str_extra";
    public static final String START_ACTION = "edu.hillel.firstapplication.ACTHION_NOTHING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvText = (TextView) findViewById(R.id.tvText);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = extras.getString(EXTRAS_PARAM1);
            tvText.setText(str);
        }
    }
}
