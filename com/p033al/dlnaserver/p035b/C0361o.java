package com.p033al.dlnaserver.p035b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.MainActivity;
import com.p033al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.al.dlnaserver.b.o */
/* JADX INFO: compiled from: ServicesUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0361o {
    /* JADX INFO: renamed from: a */
    public static boolean m1053a(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        String name = DlnaMediaServer.class.getName();
        Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            if (name.equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m1055b(Context context) {
        if (App.f1269a) {
            if (!App.f1270b) {
                m1057c(context);
                return;
            }
            return;
        }
        ArrayList<String> arrayListM1052c = C0360n.m1052c(context, "pathsList");
        if (m1054a(context, arrayListM1052c)) {
            m1056b(context, arrayListM1052c);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: c */
    public static void m1057c(Context context) {
        if (App.f1269a && !App.f1270b) {
            context.stopService(new Intent(context, (Class<?>) DlnaMediaServer.class));
        }
        if (!App.f1270b) {
            Intent intent = new Intent();
            intent.putExtra("serviceStarted", true);
            intent.setAction(String.valueOf(context.getPackageName()) + ".UIupdate");
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1058d(Context context) {
        if (!App.f1269a && !App.f1270b) {
            ArrayList<String> arrayListM1052c = C0360n.m1052c(context, "pathsList");
            if (m1054a(context, arrayListM1052c)) {
                m1056b(context, arrayListM1052c);
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private static boolean m1054a(Context context, ArrayList<String> arrayList) {
        if (arrayList.isEmpty() || !C0358l.m1040a(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && C0359m.m1046a(context)) {
            Log.e("ServicesUtils", "Permission deny to write your External storage. Cant start service.");
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static void m1056b(Context context, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) DlnaMediaServer.class);
        intent.putStringArrayListExtra("pathsList", arrayList);
        if (Build.VERSION.SDK_INT < 26) {
            context.startService(intent);
        } else {
            context.startForegroundService(intent);
        }
    }
}
