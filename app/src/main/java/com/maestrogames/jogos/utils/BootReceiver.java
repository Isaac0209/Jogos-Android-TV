package com.maestrogames.jogos.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.maestrogames.jogos.MainActivity;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            // Iniciar a atividade principal
            Intent mainActivityIntent = new Intent(context, MainActivity.class);
            mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainActivityIntent);
        }
    }
}
