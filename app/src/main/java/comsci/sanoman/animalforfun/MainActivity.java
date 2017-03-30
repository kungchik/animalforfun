package comsci.sanoman.animalforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnStrat);
        final EditText editText= (EditText) findViewById(R.id.txtname);
        button.setOnClickListener(new View.OnClickListener() {//ให้พิมพ์แค่ new On
            @Override
            public void onClick(View view) {
                if (editText.length()==0){ //ุถ้าedittext ว่างยังไม่กรอกชื่อ
                    Toast.makeText(getApplication(),"กรุณาใส่ชื่อก่อน",Toast.LENGTH_SHORT).show();
                }else {
                    String nameString = editText.getText().toString().trim();
                    Toast.makeText(getApplicationContext(), "Hello "+nameString, Toast.LENGTH_SHORT).show();
                    Intent startIntent=new Intent(MainActivity.this,Game.class);
                    startActivity(startIntent);
                }
            }});
    }
}
