package net.gility.android.skin.entity;

import net.gility.android.skin.loader.SkinManager;
import net.gility.android.skin.util.L;

import android.view.View;
import android.widget.TextView;

public class TextColorAttr extends SkinAttr {

	@Override
	public void apply(View view) {
		if(view instanceof TextView){
			TextView tv = (TextView)view;
			if(RES_TYPE_NAME_COLOR.equals(attrValueTypeName)){
				L.e("attr1", "TextColorAttr");
				tv.setTextColor(SkinManager.getInstance().convertToColorStateList(attrValueRefId));
			}
		}
	}
}
