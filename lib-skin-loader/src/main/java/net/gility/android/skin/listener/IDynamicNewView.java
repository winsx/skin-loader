package net.gility.android.skin.listener;

import java.util.List;

import android.view.View;
import net.gility.android.skin.entity.DynamicAttr;

public interface IDynamicNewView {
	void dynamicAddView(View view, List<DynamicAttr> pDAttrs);
}
