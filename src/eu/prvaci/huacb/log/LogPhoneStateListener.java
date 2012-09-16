package eu.prvaci.huacb.log;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class LogPhoneStateListener extends PhoneStateListener {

	public void onCallStateChanged(int state, String incomingNumber) {
		switch (state) {
		case TelephonyManager.CALL_STATE_IDLE:
			Log.i(Keys.EU_PRVACI, "IDLE");
			break;
		case TelephonyManager.CALL_STATE_OFFHOOK:
			Log.i(Keys.EU_PRVACI, "OFFHOOK");
			break;
		case TelephonyManager.CALL_STATE_RINGING:
			Log.i(Keys.EU_PRVACI, "RINGING");
			break;
		}
	}
}