package com.p033al.dlnaserver;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.p033al.dlnaserver.p035b.C0360n;

/* JADX INFO: renamed from: com.al.dlnaserver.e */
/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0391e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivity f1474a;

    DialogInterfaceOnClickListenerC0391e(MainActivity mainActivity) {
        this.f1474a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f1474a.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", Uri.parse("package:" + this.f1474a.getPackageName())));
        } catch (ActivityNotFoundException e) {
            Log.e("DlnaMediaServer", "Set doze: " + e.getMessage());
            try {
                this.f1474a.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
            } catch (Throwable th) {
                Log.e("DlnaMediaServer", "Set doze", th);
                C0360n.m1049a(this.f1474a.getApplicationContext(), "do_not_show_batt_warning", true);
            }
        } catch (Throwable th2) {
            Log.e("DlnaMediaServer", "Set doze", th2);
            C0360n.m1049a(this.f1474a.getApplicationContext(), "do_not_show_batt_warning", true);
        }
        dialogInterface.cancel();
    }
}
