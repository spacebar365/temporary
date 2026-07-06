package com.al.dlnaserver.b;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: TVHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class bl {
    public static boolean a(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4 || context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.television") || !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
    }
}
