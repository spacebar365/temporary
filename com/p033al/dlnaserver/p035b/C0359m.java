package com.p033al.dlnaserver.p035b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.p033al.dlnaserver.C0303R;

/* JADX INFO: renamed from: com.al.dlnaserver.b.m */
/* JADX INFO: compiled from: PermissionUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0359m {
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static boolean m1045a(Activity activity, int i, boolean z) {
        if (!m1046a(activity)) {
            return true;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (z) {
                Toast.makeText(activity, activity.getString(C0303R.string.permission_access_denined), 0).show();
            }
            Log.e("PermissionUtils", "Permission deny to access your External storage. Cant start service.");
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        return false;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static boolean m1046a(Context context) {
        return context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
    }
}
