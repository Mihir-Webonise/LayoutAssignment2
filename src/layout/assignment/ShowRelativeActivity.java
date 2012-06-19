package layout.assignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ShowRelativeActivity  extends Activity {
    /** Called when the activity is first created. */
	Button btnDone;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        btnDone = (Button) findViewById(R.id.btnDone);
		btnDone.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText enterName = (EditText) findViewById(R.id.edittxtEnterName);
				EditText enterAge = (EditText) findViewById(R.id.edittxtEnterAge);
				EditText enterGender = (EditText) findViewById(R.id.edittxtEnterGender);
				EditText enterHobbies = (EditText) findViewById(R.id.edittxtEnterHobbies);
				Bundle extras = getIntent().getExtras();
				enterName.setText(extras.getString("username"));
				enterAge.setText(extras.getString("userage"));
				enterGender.setText(extras.getString("usergender"));
				enterHobbies.setText(extras.getString("userhobbies"));
				
			}
		});
		
    }
}
