package com.wsh.activity;

import com.example.zxingdemo.R;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * baseActionBar Activity
 * 
 * @author FireAnt（http://my.oschina.net/LittleDY）
 * @created 2014年9月25日 上午11:30:15 引用自：tonlin
 */
public abstract class BaseActivity extends Activity implements OnClickListener{
	public static final String INTENT_ACTION_EXIT_APP = "INTENT_ACTION_EXIT_APP";

	private boolean _isVisible;
	private ProgressDialog _waitDialog;

	protected LayoutInflater mInflater;
	protected ActionBar mActionBar;
	private TextView mTvActionTitle;

	@Override
	protected void onDestroy() {
		super.onDestroy();

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (!hasActionBar()) {
			// supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
		}

		init(savedInstanceState);


	}

	protected void onBeforeSetContentLayout() {}

	protected boolean hasActionBar() {
		return true;
	}

	protected int getLayoutId() {
		return 0;
	}

	protected View inflateView(int resId) {
		return mInflater.inflate(resId, null);
	}

	protected int getActionBarTitle() {
		return R.string.app_name;
	}

	protected boolean hasBackButton() {
		return false;
	}

	protected void init(Bundle savedInstanceState) {}

	protected void initActionBar(ActionBar actionBar) {
		if (actionBar == null)
			return;
		
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			onBackPressed();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}




	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {

		// setOverflowIconVisible(featureId, menu);
		return super.onMenuOpened(featureId, menu);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
