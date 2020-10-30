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
 import android.os.Bundle;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.view. View;
 import android.widget.Button;
 import android.widget.LinearLayout;
 import android.view.View.OnClickListener;

 public class MainActivity extends Activity {
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout. activity_view);
         //ボタンを押したときにイベントを取得できるようにする
        Button button1 = (Button) findViewById(R.id. button1);
        button1.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 1) {
                    // 変更したいレイアウトを取得する
                    LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout1);
                // レイアウトのビューをすべて削除する
                layout.removeAllViews();
                // レイアウトを R.layout.sample に変更する
                getLayoutInflater().inflate(R.layout.view2, layout);
                count = 2;
            } else if(count ==2){

                LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                layout.removeAllViews();
                getLayoutInflater().inflate(R.layout.view1, layout);
                count = 1;
            }
        }
    });
 }

// @Override
// public boolean onCreateOptionsMenu(Menu menu) {
//     // Infla te the menu; this adds items to the action bar if it is present.
//     getMenuInflater().inflate(R.menu. menu_main , menu);
//     return true;
// }

// @Override
// public boolean onOptionsItemSelected(MenuItem item) {
//     // Handle action bar ite m clicks here. The action bar will
//     // automatically handle clicks on the Home/Up button, so long
//     // as you specify a parent activity in AndroidManifest.
//     int id = item.getItemId();
//
//     // noinspection SimplifiableIfStatement
//     if (id == R.action_settings) {
//         return true;
//     }
//     return super.onOptionsItemSelected(item);
//    }

 }
