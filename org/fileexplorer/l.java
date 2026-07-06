package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class l implements View$OnClickListener {
    final /* synthetic */ FileDialogTV a;

    l(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) throws Throwable {
        FileDialogTV.h(this.a);
    }
}
