package org.fileexplorer;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build$VERSION;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.Toast;
import com.al.dlnaserver.R$string;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class m implements View$OnClickListener {
    final /* synthetic */ FileDialogTV a;

    m(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        Intent intent;
        if (Build$VERSION.SDK_INT < 19) {
            intent = new Intent();
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
        }
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        try {
            this.a.startActivityForResult(intent, 12345);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this.a.getApplicationContext(), R$string.no_app_to_open, 1).show();
        }
    }
}
