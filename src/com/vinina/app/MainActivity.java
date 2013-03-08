package com.vinina.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity  implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        Button b = (Button)this.findViewById(R.id.btn_confirm);
		b.setOnClickListener(this);

       
    }
    @Override
	public void onClick(View v) {
		TextView tv = (TextView)this.findViewById(R.id.tv_welcome);
		EditText et = (EditText)this.findViewById(R.id.txt_name);

		String text = "Hello, " + et.getText().toString() + ".\n\n";
		text += "Welcome to android development. :)";
		
		tv.setText(text);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
