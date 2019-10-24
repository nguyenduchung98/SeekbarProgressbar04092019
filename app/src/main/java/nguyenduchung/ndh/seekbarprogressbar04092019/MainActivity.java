package nguyenduchung.ndh.seekbarprogressbar04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar mSkCat,mSkFish,mSkDuck;
    CheckBox mCbCat,mCbFish,mCbDuck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        mCbCat=findViewById(R.id.checkboxCat);
        mCbDuck=findViewById(R.id.checkboxDuck);
        mCbFish=findViewById(R.id.checkboxFish);
        mSkCat=findViewById(R.id.seekbarCat);
        mSkFish=findViewById(R.id.seekbarFish);
        mSkDuck=findViewById(R.id.seekbarDuck);

    }
}
