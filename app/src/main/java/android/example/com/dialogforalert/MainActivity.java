package android.example.com.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClckShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Clik OK to continue, click Cancel to stop");
        myAlertBuilder.setPositiveButton(
                getString(R.string.ok_button), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), R.string.ok_btn_message, Toast.LENGTH_SHORT).show();
                    }
                }
        );
        myAlertBuilder.setNegativeButton(
                getString(R.string.cancel_button), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Pressed CANCEL", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        myAlertBuilder.show();
    }
}
