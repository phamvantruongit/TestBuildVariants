package apptest_buildvariants.eventos.tokyo.testbuildvariants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.txt);
        if(BuildConfig.DEBUG){
            txt.setText(getInformationDebug());
        }else {
            txt.setText(getInformationRelease());
        }

    }
    private String getInformationDebug(){
        StringBuilder builder=new StringBuilder();
        builder.append(getPackageName()+"\n");
        builder.append(BuildConfig.APPLICATION_ID + "\n"+ BuildConfig.BASE_URL + "\n"+ BuildConfig.VERSION_NAME)  ;
        return builder.toString();
    }

    private String getInformationRelease(){
        StringBuilder builder=new StringBuilder();
        builder.append(getPackageName()+"\n");
        builder.append(BuildConfig.APPLICATION_ID + "\n"+ BuildConfig.BASE_URL + "\n"+ BuildConfig.VERSION_NAME)  ;
        return builder.toString();
    }
}
