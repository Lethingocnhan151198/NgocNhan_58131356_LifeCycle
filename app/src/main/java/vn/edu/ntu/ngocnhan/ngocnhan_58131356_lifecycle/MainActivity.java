package vn.edu.ntu.ngocnhan.ngocnhan_58131356_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","Create Called");
        Toast.makeText(getApplicationContext(),"Create Called",Toast.LENGTH_SHORT).show();
        txtTime = findViewById(R.id.txtTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String date = simpleDateFormat.format(new Date());
        txtTime.setText(date);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","Start Called");
        Toast.makeText(getApplicationContext(),"Start Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","Resume Called");
        Toast.makeText(getApplicationContext(),"Resume Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","Restart Called");
        Toast.makeText(getApplicationContext(),"Restart Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","Pause Called");
        Toast.makeText(getApplicationContext(),"Pause Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","Stop Called");
        Toast.makeText(getApplicationContext(),"Stop Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","Destroy Called");
        Toast.makeText(getApplicationContext(),"Destroy Called",Toast.LENGTH_SHORT).show();
    }
}