package and1107.andoroid.flagment12nd;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

	/**
	 * setContentViewはActivityでしか使えない。そこでinflater.inflate(R.layout.fragment1,
	 * container, false)を使う。
	 * そのために、onCreateViewメソッドは必ずオーバーライド。このメソッドは、このフラグメントを返却するためのメソッド
	 * 。返却相手はActivityではなくOS側。
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment1, container, false);
	}

}