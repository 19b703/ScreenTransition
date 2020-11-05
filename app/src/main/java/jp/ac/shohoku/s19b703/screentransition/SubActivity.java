//package jp.ac.shohoku.s19b703.imagesample;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tap);
//    }
//}

 package jp.ac.shohoku.s19b703.screentransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/*@auther myu kato*/
public class SubActivity extends Activity {
   int count = 1;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sub);

       // 課題16
       LinearLayout linearLayout = new LinearLayout(this);
       linearLayout.setOrientation(LinearLayout.VERTICAL);
       setContentView(linearLayout);

       Intent intent = getIntent();

       TextView textview1 = new TextView(this);
       String str1 = intent.getStringExtra("number");
       textview1.setText(str1);

       TextView textview2 = new TextView(this);
       String str2 = intent.getStringExtra("pass");
       textview2.setText(str2);

       linearLayout.addView(textview1, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
       linearLayout.addView(textview2, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
   }
}
