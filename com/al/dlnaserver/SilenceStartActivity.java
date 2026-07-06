package com.al.dlnaserver;

import android.app.Activity;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.al.dlnaserver.b.l;
import com.al.dlnaserver.b.m;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SilenceStartActivity extends Activity {
    private ArrayList<String> a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = n.c(this, "pathsList");
        if (!this.a.isEmpty() && !App.a && (Build$VERSION.SDK_INT < 23 || m.a(this, 1, false))) {
            a();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    a();
                    break;
                }
                break;
        }
    }

    private void a() {
        if (l.a(this) && !App.a) {
            Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
            intent.putStringArrayListExtra("pathsList", this.a);
            startService(intent);
        }
    }
}
