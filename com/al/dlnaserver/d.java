package com.al.dlnaserver;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import com.al.dlnaserver.b.n;

/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class d implements DialogInterface$OnClickListener {
    final /* synthetic */ MainActivity a;

    d(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        n.a(this.a.getApplicationContext(), "do_not_show_batt_warning", true);
        dialogInterface.cancel();
    }
}
