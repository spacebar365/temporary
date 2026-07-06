package com.al.dlnaserver;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.al.dlnaserver.b.n;

/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class e implements DialogInterface$OnClickListener {
    final /* synthetic */ MainActivity a;

    e(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.a.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", Uri.parse("package:" + this.a.getPackageName())));
        } catch (ActivityNotFoundException e) {
            Log.e("DlnaMediaServer", "Set doze: " + e.getMessage());
            try {
                this.a.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
            } catch (Throwable th) {
                Log.e("DlnaMediaServer", "Set doze", th);
                n.a(this.a.getApplicationContext(), "do_not_show_batt_warning", true);
            }
        } catch (Throwable th2) {
            Log.e("DlnaMediaServer", "Set doze", th2);
            n.a(this.a.getApplicationContext(), "do_not_show_batt_warning", true);
        }
        dialogInterface.cancel();
    }
}
