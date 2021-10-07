package thuan.ndt.fragmenttruyenvanhandl;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.buttonMain);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = new FragmentA();
                //put dữ liệu vào
                Bundle bundle = new Bundle();
                bundle.putString("chuoi", "nguyễn đức thuận");
                fragmentA.setArguments(bundle);
                fragmentTransaction.add(R.id.myLinearLayout, fragmentA);
                fragmentTransaction.commit();

            }
        });
    }
}