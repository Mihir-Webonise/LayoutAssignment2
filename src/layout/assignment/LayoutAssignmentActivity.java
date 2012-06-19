package layout.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class LayoutAssignmentActivity extends Activity {
	/** Called when the activity is first created. */
	Button btnDone;
	Intent intent;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btnDone = (Button) findViewById(R.id.btnDone);
		btnDone.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText enterName = (EditText) findViewById(R.id.edittxtEnterName);
				EditText enterAge = (EditText) findViewById(R.id.edittxtEnterAge);
				RadioGroup gender = (RadioGroup) findViewById(R.id.radiogrpGender);
				intent = new Intent(LayoutAssignmentActivity.this, ShowRelativeActivity.class);
				intent.putExtra("username", ""+enterName.getText());
				intent.putExtra("userage", ""+enterAge.getText());
				intent.putExtra("usergender", ""+gender.getCheckedRadioButtonId());
				intent.putExtra("userhobbies", "Swimming, Basketball");
				startActivity(intent);
			}
		});

	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("***************","Come from on resume");
	}
}