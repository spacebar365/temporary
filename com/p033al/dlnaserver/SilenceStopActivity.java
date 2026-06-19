package com.p033al.dlnaserver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p033al.dlnaserver.servers.DlnaMediaServer;

/* JADX INFO: loaded from: classes.dex */
public class SilenceStopActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (App.f1269a) {
            stopService(new Intent(this, (Class<?>) DlnaMediaServer.class));
        }
        finish();
    }
}
