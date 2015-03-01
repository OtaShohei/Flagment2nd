package and1107.andoroid.flagment12nd;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * setContentViewはActivityでしか使えない。そこでinflater.inflate(R.layout.fragment1,
 * container, false)を使う。
 * そのために、onCreateViewメソッドは必ずオーバーライド。このメソッドは、このフラグメントを返却するためのメソッド
 * 。返却相手はActivityではなくOS側。
 */
public class Fragment2 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment2, container, false);
	}
}