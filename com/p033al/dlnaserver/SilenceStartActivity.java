package com.p033al.dlnaserver;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.p033al.dlnaserver.p035b.C0358l;
import com.p033al.dlnaserver.p035b.C0359m;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SilenceStartActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f1300a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1300a = C0360n.m1052c(this, "pathsList");
        if (!this.f1300a.isEmpty() && !App.f1269a && (Build.VERSION.SDK_INT < 23 || C0359m.m1045a(this, 1, false))) {
            m996a();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    m996a();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m996a() {
        if (C0358l.m1040a(this) && !App.f1269a) {
            Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
            intent.putStringArrayListExtra("pathsList", this.f1300a);
            startService(intent);
        }
    }
}
