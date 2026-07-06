package com.al.dlnaserver.b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Build$VERSION;
import android.util.Log;
import com.al.dlnaserver.App;
import com.al.dlnaserver.MainActivity;
import com.al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ServicesUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static boolean a(Context context) {
        List<ActivityManager$RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        String name = DlnaMediaServer.class.getName();
        Iterator<ActivityManager$RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            if (name.equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void b(Context context) {
        if (App.a) {
            if (!App.b) {
                c(context);
                return;
            }
            return;
        }
        ArrayList<String> arrayListC = n.c(context, "pathsList");
        if (a(context, arrayListC)) {
            b(context, arrayListC);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void c(Context context) {
        if (App.a && !App.b) {
            context.stopService(new Intent(context, (Class<?>) DlnaMediaServer.class));
        }
        if (!App.b) {
            Intent intent = new Intent();
            intent.putExtra("serviceStarted", true);
            intent.setAction(String.valueOf(context.getPackageName()) + ".UIupdate");
            context.sendBroadcast(intent);
        }
    }

    public static void d(Context context) {
        if (!App.a && !App.b) {
            ArrayList<String> arrayListC = n.c(context, "pathsList");
            if (a(context, arrayListC)) {
                b(context, arrayListC);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean a(Context context, ArrayList<String> arrayList) {
        if (arrayList.isEmpty() || !l.a(context)) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 23 && m.a(context)) {
            Log.e("ServicesUtils", "Permission deny to write your External storage. Cant start service.");
            return false;
        }
        return true;
    }

    private static void b(Context context, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) DlnaMediaServer.class);
        intent.putStringArrayListExtra("pathsList", arrayList);
        if (Build$VERSION.SDK_INT < 26) {
            context.startService(intent);
        } else {
            context.startForegroundService(intent);
        }
    }
}
