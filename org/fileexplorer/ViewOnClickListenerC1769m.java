package org.fileexplorer;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.p033al.dlnaserver.C0303R;

/* JADX INFO: renamed from: org.fileexplorer.m */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1769m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6588a;

    ViewOnClickListenerC1769m(FileDialogTV fileDialogTV) {
        this.f6588a = fileDialogTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 19) {
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
            this.f6588a.startActivityForResult(intent, 12345);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this.f6588a.getApplicationContext(), C0303R.string.no_app_to_open, 1).show();
        }
    }
}
