package com.harleensahni.android.mbr.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PackageAddedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // ((AudioManager) context.getSystemService(Context.AUDIO_SERVICE))
        // .registerMediaButtonEventReceiver(new ComponentName(context,
        // MediaButtonReceiver.class));
    }

}