package org.fileexplorer;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class f implements View$OnClickListener {
    final /* synthetic */ FileDialogTV a;

    f(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        if (FileDialogTV.a(this.a).getText().length() > 0) {
            this.a.getIntent().putExtra("RESULT_PATH", String.valueOf(FileDialogTV.b(this.a)) + "/" + ((Object) FileDialogTV.a(this.a).getText()));
            this.a.getIntent().putExtra("LIST_ITEM", FileDialogTV.c(this.a));
            this.a.setResult(-1, this.a.getIntent());
            this.a.finish();
        }
    }
}
