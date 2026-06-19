package org.cybergarage.p173e;

import android.util.Log;

/* JADX INFO: renamed from: org.cybergarage.e.a */
/* JADX INFO: compiled from: Debug.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1744a {

    /* JADX INFO: renamed from: a */
    public static boolean f6521a = true;

    /* JADX INFO: renamed from: a */
    public static void m5116a() {
        f6521a = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m5119b() {
        f6521a = false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5122c() {
        return f6521a;
    }

    /* JADX INFO: renamed from: a */
    public static void m5118a(String str) {
        Log.i("CyberGarage", str);
    }

    /* JADX INFO: renamed from: b */
    public static void m5120b(String str) {
        if (f6521a) {
            Log.d("CyberGarage", str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5121c(String str) {
        Log.w("CyberGarage", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m5117a(Exception exc) {
        Log.w("CyberGarage", exc);
    }
}
