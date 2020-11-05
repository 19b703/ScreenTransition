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
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/*@auther myu kato*/
public class TransActivity extends Activity {
   int count = 1;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_trans);
       // ボタンを押したときにイベントを取得できるようにする
       Button button = (Button) findViewById(R.id.button);//activity_trans のボタン
       button.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               //インテントに、この画面と、遷移する別の画面を指定する
               Intent intent = new Intent(TransActivity.this, SubActivity.class);
               EditText num = (EditText) findViewById(R.id.editText);
               Editable numtext = num.getText();
               EditText pass = (EditText) findViewById(R.id.editText2);
               Editable passtext = pass.getText();
               intent.putExtra("number","学籍番号："+numtext);
               intent.putExtra("pass","パスワード："+passtext);
               //インテントで指定した別の画面に遷移する
               startActivity(intent);
           }
       });
   }



}
