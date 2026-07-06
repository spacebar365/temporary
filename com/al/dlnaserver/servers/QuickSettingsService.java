package com.al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.al.dlnaserver.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class QuickSettingsService extends TileService {
    private BroadcastReceiver a;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.a == null) {
            this.a = new m(this);
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        com.al.dlnaserver.b.o.b(this);
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        super.onTileAdded();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        registerReceiver(this.a, intentFilter);
        a();
    }

    static /* synthetic */ void a(QuickSettingsService quickSettingsService) {
        quickSettingsService.a();
    }

    @SuppressLint({"InlinedApi"})
    private void a() {
        String str;
        int i = 2;
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            if (com.al.dlnaserver.b.o.a(this)) {
                str = String.format(Locale.US, "%s %s", getString(R$string.app_name), getString(R$string.service_active));
            } else {
                str = String.format(Locale.US, "%s %s", getString(R$string.app_name), getString(R$string.service_inactive));
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
