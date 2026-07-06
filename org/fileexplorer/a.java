package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialog.java */
/* JADX INFO: loaded from: classes.dex */
final class a implements View$OnClickListener {
    final /* synthetic */ FileDialog a;

    a(FileDialog fileDialog) {
        this.a = fileDialog;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        FileDialog.a(this.a, view);
    }
}
