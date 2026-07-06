package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class j implements View$OnClickListener {
    final /* synthetic */ FileDialogTV a;

    j(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        if (FileDialogTV.f(this.a) != null) {
            this.a.getIntent().putExtra("RESULT_PATH", FileDialogTV.f(this.a).getPath());
            this.a.setResult(-1, this.a.getIntent());
            this.a.finish();
        }
    }
}
