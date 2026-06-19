package com.p033al.dlnaserver.p035b;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bl */
/* JADX INFO: compiled from: TVHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0347bl {
    /* JADX INFO: renamed from: a */
    public static boolean m1015a(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4 || context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.television") || !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
    }
}
