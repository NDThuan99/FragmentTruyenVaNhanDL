package thuan.ndt.fragmenttruyenvanhandl;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentA extends Fragment {

    TextView txtFragmentA;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmnet_a, container, false);

        txtFragmentA = (TextView)view.findViewById(R.id.textFragmentA);

        //nhận dữ liệu
        Bundle bundle = getArguments();
        if (bundle != null){
            txtFragmentA.setText(bundle.getString("chuoi"));
        }

        return view;
    }
}
