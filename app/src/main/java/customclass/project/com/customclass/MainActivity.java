package customclass.project.com.customclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);

        ReportCard reportCard = new ReportCard("Abhishek Kushwaha", 5245875,77, 50, 70,70, 67,78);
        textView.setText(reportCard.displayResult());
    }
}
