package net.gility.android.skin.demo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import net.gility.android.skin.demo.R;
import net.gility.android.skin.demo.fragment.ArticleListFragment;
import net.gility.android.skin.base.BaseFragmentActivity;

public class MainActivity extends BaseFragmentActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initFragment();
	}

	private void initFragment() {
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragment_container);
		if(fragment == null){
			fragment = ArticleListFragment.newInstance();
			fm.beginTransaction()
				.add(R.id.fragment_container, fragment)
				.commit();
		}
	}
}
