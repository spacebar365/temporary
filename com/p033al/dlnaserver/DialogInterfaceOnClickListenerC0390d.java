package com.p033al.dlnaserver;

import android.content.DialogInterface;
import com.p033al.dlnaserver.p035b.C0360n;

/* JADX INFO: renamed from: com.al.dlnaserver.d */
/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0390d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivity f1473a;

    DialogInterfaceOnClickListenerC0390d(MainActivity mainActivity) {
        this.f1473a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1049a(this.f1473a.getApplicationContext(), "do_not_show_batt_warning", true);
        dialogInterface.cancel();
    }
}
