package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialog.java */
/* JADX INFO: loaded from: classes.dex */
final class b implements View$OnClickListener {
    final /* synthetic */ FileDialog a;

    b(FileDialog fileDialog) {
        this.a = fileDialog;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        if (FileDialog.a(this.a).getText().length() > 0) {
            this.a.getIntent().putExtra("RESULT_PATH", String.valueOf(FileDialog.b(this.a)) + "/" + ((Object) FileDialog.a(this.a).getText()));
            this.a.getIntent().putExtra("LIST_ITEM", FileDialog.c(this.a));
            this.a.setResult(-1, this.a.getIntent());
            this.a.finish();
        }
    }
}
