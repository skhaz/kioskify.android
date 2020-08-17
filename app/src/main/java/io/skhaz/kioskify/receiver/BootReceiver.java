package io.skhaz.kioskify.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.skhaz.kioskify.service.WakeUpService;

import static android.content.Intent.ACTION_BOOT_COMPLETED;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }

        if (ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            WakeUpService.enqueueWork(context, new Intent());
        }
    }
}
