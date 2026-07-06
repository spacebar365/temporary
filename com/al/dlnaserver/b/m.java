package com.al.dlnaserver.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.al.dlnaserver.R$string;

/* JADX INFO: compiled from: PermissionUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    @SuppressLint({"NewApi"})
    public static boolean a(Activity activity, int i, boolean z) {
        if (!a(activity)) {
            return true;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (z) {
                Toast.makeText(activity, activity.getString(R$string.permission_access_denined), 0).show();
            }
            Log.e("PermissionUtils", "Permission deny to access your External storage. Cant start service.");
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        return false;
    }

    @SuppressLint({"NewApi"})
    public static boolean a(Context context) {
        return context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
    }
}
