package com.p033al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.p035b.C0361o;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class QuickSettingsService extends TileService {

    /* JADX INFO: renamed from: a */
    private BroadcastReceiver f1516a;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f1516a == null) {
            this.f1516a = new C0418m(this);
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        C0361o.m1055b(this);
        m1156a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        super.onTileAdded();
        m1156a();
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        registerReceiver(this.f1516a, intentFilter);
        m1156a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void m1156a() {
        String str;
        int i = 2;
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            if (C0361o.m1053a(this)) {
                str = String.format(Locale.US, "%s %s", getString(C0303R.string.app_name), getString(C0303R.string.service_active));
            } else {
                str = String.format(Locale.US, "%s %s", getString(C0303R.string.app_name), getString(C0303R.string.service_inactive));
                i = 1;
            }
            qsTile.setLabel(str);
            qsTile.setState(i);
            try {
                qsTile.updateTile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
