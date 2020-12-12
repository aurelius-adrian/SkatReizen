package de.auxilico.skatreizen;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button krB;
    private Button piB;
    private Button heB;
    private Button kaB;
    private Button grB;
    private Button nuB;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        krB = findViewById(R.id.button3);
        piB = findViewById(R.id.button4);
        heB = findViewById(R.id.button5);
        kaB = findViewById(R.id.button6);
        grB = findViewById(R.id.button7);
        nuB = findViewById(R.id.button8);

        textView = findViewById(R.id.textView);
    }

    public void button (View view) {
        Switch kreuz = findViewById(R.id.switch1);
        Switch pik = findViewById(R.id.switch2);
        Switch herz = findViewById(R.id.switch3);
        Switch karo = findViewById(R.id.switch4);

        TextView textView = findViewById(R.id.textView);

        if (kreuz.isChecked() && pik.isChecked() && herz.isChecked() && karo.isChecked() || !kreuz.isChecked() && !pik.isChecked() && !herz.isChecked() && !karo.isChecked()) {
            textView.setText("Kreuz: 60, Pik: 55, Herz: 50, Karo: 45, Gran: 100, Null: 100");
        } else if (kreuz.isChecked() && pik.isChecked() && herz.isChecked() || !kreuz.isChecked() && !pik.isChecked() && !herz.isChecked()) {
            textView.setText("Kreuz: 48, Pik: 44, Herz: 40, Karo: 36, Gran: 80, Null: 80");
        } else if (kreuz.isChecked() && pik.isChecked() || !kreuz.isChecked() && !pik.isChecked()) {
            textView.setText("Kreuz: 36, Pik: 33, Herz: 30, Karo: 27, Gran: 60, Null: 60");
        } else if (kreuz.isChecked() || !kreuz.isChecked()) {
            textView.setText("Kreuz: 24, Pik: 22, Herz: 20, Karo: 18, Gran: 40, Null: 40");
        }
    }

    private int[] reizen () {
        Switch kreuz = findViewById(R.id.switch1);
        Switch pik = findViewById(R.id.switch2);
        Switch herz = findViewById(R.id.switch3);
        Switch karo = findViewById(R.id.switch4);

        if (kreuz.isChecked() && pik.isChecked() && herz.isChecked() && karo.isChecked() || !kreuz.isChecked() && !pik.isChecked() && !herz.isChecked() && !karo.isChecked()) {
            return new int[]{60, 55, 50, 45, 100, 23};
        } else if (kreuz.isChecked() && pik.isChecked() && herz.isChecked() || !kreuz.isChecked() && !pik.isChecked() && !herz.isChecked()) {
            return new int[]{48, 44, 40, 36, 80, 23};
        } else if (kreuz.isChecked() && pik.isChecked() || !kreuz.isChecked() && !pik.isChecked()) {
            return new int[]{36, 33, 30, 27, 60, 23};
        } else if (kreuz.isChecked() || !kreuz.isChecked()) {
            return new int[]{24, 22, 20, 18, 40, 23};
        }
        return new int[]{0, 0, 0, 0, 0, 0};
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void kr (View view) {
        krB.setBackgroundColor(getColor(R.color.red));
        piB.setBackgroundColor(getColor(R.color.grey));
        heB.setBackgroundColor(getColor(R.color.grey));
        kaB.setBackgroundColor(getColor(R.color.grey));
        grB.setBackgroundColor(getColor(R.color.grey));
        nuB.setBackgroundColor(getColor(R.color.grey));

        textView.setText(String.valueOf(reizen()[0]));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void pi (View view) {
        krB.setBackgroundColor(getColor(R.color.grey));
        piB.setBackgroundColor(getColor(R.color.red));
        heB.setBackgroundColor(getColor(R.color.grey));
        kaB.setBackgroundColor(getColor(R.color.grey));
        grB.setBackgroundColor(getColor(R.color.grey));
        nuB.setBackgroundColor(getColor(R.color.grey));

        textView.setText(String.valueOf(reizen()[1]));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void he (View view) {
        krB.setBackgroundColor(getColor(R.color.grey));
        piB.setBackgroundColor(getColor(R.color.grey));
        heB.setBackgroundColor(getColor(R.color.red));
        kaB.setBackgroundColor(getColor(R.color.grey));
        grB.setBackgroundColor(getColor(R.color.grey));
        nuB.setBackgroundColor(getColor(R.color.grey));

        textView.setText(String.valueOf(reizen()[2]));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void ka (View view) {
        krB.setBackgroundColor(getColor(R.color.grey));
        piB.setBackgroundColor(getColor(R.color.grey));
        heB.setBackgroundColor(getColor(R.color.grey));
        kaB.setBackgroundColor(getColor(R.color.red));
        grB.setBackgroundColor(getColor(R.color.grey));
        nuB.setBackgroundColor(getColor(R.color.grey));

        textView.setText(String.valueOf(reizen()[3]));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void gr (View view) {
        krB.setBackgroundColor(getColor(R.color.grey));
        piB.setBackgroundColor(getColor(R.color.grey));
        heB.setBackgroundColor(getColor(R.color.grey));
        kaB.setBackgroundColor(getColor(R.color.grey));
        grB.setBackgroundColor(getColor(R.color.red));
        nuB.setBackgroundColor(getColor(R.color.grey));

        textView.setText(String.valueOf(reizen()[4]));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void nu (View view) {
        krB.setBackgroundColor(getColor(R.color.grey));
        piB.setBackgroundColor(getColor(R.color.grey));
        heB.setBackgroundColor(getColor(R.color.grey));
        kaB.setBackgroundColor(getColor(R.color.grey));
        grB.setBackgroundColor(getColor(R.color.grey));
        nuB.setBackgroundColor(getColor(R.color.red));

        textView.setText(String.valueOf(reizen()[5]));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void clear (View view) {
        Switch kreuz = findViewById(R.id.switch1);
        Switch pik = findViewById(R.id.switch2);
        Switch herz = findViewById(R.id.switch3);
        Switch karo = findViewById(R.id.switch4);

        kreuz.setChecked(false);
        pik.setChecked(false);
        herz.setChecked(false);
        karo.setChecked(false);

        krB.setBackgroundColor(getColor(R.color.colorPrimary));
        piB.setBackgroundColor(getColor(R.color.colorPrimary));
        heB.setBackgroundColor(getColor(R.color.colorPrimary));
        kaB.setBackgroundColor(getColor(R.color.colorPrimary));
        grB.setBackgroundColor(getColor(R.color.colorPrimary));
        nuB.setBackgroundColor(getColor(R.color.colorPrimary));

        TextView textView = findViewById(R.id.textView);
        textView.setText("--");
    }
}