package org.cybergarage.e;

import android.util.Log;

/* JADX INFO: compiled from: Debug.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static boolean a = true;

    public static void a() {
        a = true;
    }

    public static void b() {
        a = false;
    }

    public static boolean c() {
        return a;
    }

    public static void a(String str) {
        Log.i("CyberGarage", str);
    }

    public static void b(String str) {
        if (a) {
            Log.d("CyberGarage", str);
        }
    }

    public static void c(String str) {
        Log.w("CyberGarage", str);
    }

    public static void a(Exception exc) {
        Log.w("CyberGarage", exc);
    }
}
