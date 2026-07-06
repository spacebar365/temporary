package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class k implements View$OnClickListener {
    final /* synthetic */ FileDialogTV a;

    k(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        FileDialogTV.b(this.a, FileDialogTV.g(this.a));
        FileDialogTV.a(this.a).setText("");
        FileDialogTV.a(this.a).requestFocus();
    }
}
