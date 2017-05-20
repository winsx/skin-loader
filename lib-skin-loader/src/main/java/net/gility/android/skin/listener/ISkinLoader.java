package net.gility.android.skin.listener;

public interface ISkinLoader {
	void attach(ISkinUpdate observer);
	void detach(ISkinUpdate observer);
	void notifySkinUpdate();
//	void notifySkinDefault();
}
