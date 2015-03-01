package and1107.andoroid.flagment12nd;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

/**
 * fragmentを動的に割り振る。 動的に割り振るにはfragmentManagerを用いる。
 *
 * @author 1107AND
 *
 */
public class MainActivity extends Activity {

	/**
	 * 画面を縦横にするときには、onCreateは呼び出されるので縦横でfragmentを変更させることができる。
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**
		 * FragmentManagerとは、fragmentの管理者みたいなもの。
		 * FragmentManagerは、2.x系をサポートしないならば
		 * 、android.appのFragmentManagerをインポートで構わない。
		 */
		FragmentManager fragmentManager = getFragmentManager();
		/**
		 * fragmentの入れ替えを動的に行うときに、アクティビティの切り替え、縦横の変更などの動作されては困る処理を一時停止させる機能=>
		 * FragmentTransaction 一時的に画面をロックする。
		 */
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		WindowManager windowManager = getWindowManager();
		Display display = windowManager.getDefaultDisplay();

		/**
		 * 画面の横サイズ縦サイズを取得
		 */
		if (display.getHeight() < display.getWidth()) {
			/**
			 * LandScape（横長の場合）
			 */
			Fragment1 fragment1 = new Fragment1();
			/**
			 * 画面をfragment1に専有させる。
			 */
			fragmentTransaction.replace(android.R.id.content, fragment1);
		} else {
			/**
			 * portrait（縦長の場合）
			 */
			Fragment2 fragment2 = new Fragment2();
			/**
			 * 画面をfragment2に専有させる。
			 */
			fragmentTransaction.replace(android.R.id.content, fragment2);
		}

		/**
		 * 画面のロックを解除して切り替えなどを許可する。
		 */
		fragmentTransaction.commit();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
