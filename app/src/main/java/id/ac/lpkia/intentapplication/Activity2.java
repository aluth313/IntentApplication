package id.ac.lpkia.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView nama, nrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        nama = findViewById(R.id.tv_nama);
        nrp = findViewById(R.id.tv_nrp);

        Bundle bundle = getIntent().getExtras();
        String nama1 = bundle.getString("nama");
        String nrp1 = bundle.getString("nrp");

        nama.setText(nama1);
        nrp.setText(nrp1);
    }
}
