package andy.project2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Typeface roboto_light = Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf");
        Typeface roboto_bold = Typeface.createFromAsset(getAssets(),"fonts/roboto_bold.ttf");

    }
}
