package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.al.dlnaserver.b.l */
/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0358l {
    /* JADX INFO: renamed from: a */
    private static boolean m1041a(Context context, boolean z) {
        String str;
        Pattern patternCompile;
        boolean zBooleanValue;
        String str2;
        if (!z && (Build.MODEL.contains("Android SDK") || C0360n.m1050a(context, "debug"))) {
            Log.d("NetUtils", "Network: debug");
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT < 28) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && (activeNetworkInfo.getType() == 1 || (!z && activeNetworkInfo.getType() == 9))) {
                Log.d("NetUtils", "Network: wifi/eth");
                return true;
            }
        } else {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && (networkCapabilities.hasTransport(1) || (!z && networkCapabilities.hasTransport(3)))) {
                Log.d("NetUtils", "Network: wifi/eth");
                return true;
            }
            if (Build.VERSION.SDK_INT > 28) {
                str = "\\d+.*";
            } else {
                str = "";
            }
            if (z) {
                patternCompile = Pattern.compile("(?m)^" + str + "(wlan.+|swlan.+|softap.+|ap.+).+\\r*\\n*.+\\r*\\n*.+inet\\s+(addr:\\s*)?([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+).+");
            } else {
                patternCompile = Pattern.compile("(?m)^" + str + "(wlan.+|swlan.+|softap.+|ap.+|eth.+|usb.+).+\\r*\\n*.+\\r*\\n*.+inet\\s+(addr:\\s*)?([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+).+");
            }
            Matcher matcher = patternCompile.matcher(m1044c());
            if ((!matcher.find() || matcher.group(3) == null || matcher.group(3).isEmpty()) ? false : true) {
                Log.d("NetUtils", "Network: ifconfig");
                return true;
            }
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("isWifiApEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            zBooleanValue = ((Boolean) declaredMethod.invoke(wifiManager, new Object[0])).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            Log.d("NetUtils", "Network: tethering");
            return true;
        }
        if (Build.VERSION.SDK_INT > 28) {
            str2 = "\\d+.*";
        } else {
            str2 = "";
        }
        Matcher matcher2 = Pattern.compile("(?m)^" + str2 + "(p2p.).+\\r*\\n*.+\\r*\\n*.+inet\\s+(addr:\\s*)?([0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+).+").matcher(m1044c());
        if ((!matcher2.find() || matcher2.group(3) == null || matcher2.group(3).isEmpty()) ? false : true) {
            Log.d("NetUtils", "Network: p2p");
            return true;
        }
        Log.w("NetUtils", "Cannot detect network!");
        m1042b();
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1040a(Context context) {
        return m1041a(context, false);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1043b(Context context) {
        return m1041a(context, true);
    }

    /* JADX INFO: renamed from: a */
    public static NetworkInterface m1039a() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (IOException e) {
            e.printStackTrace();
            networkInterfaces = null;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (networkInterfaceNextElement.getName().contains("wlan0")) {
                return networkInterfaceNextElement;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m1042b() {
        Log.d("NetUtils", "ifconfig:");
        Log.d("NetUtils", m1044c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m1044c() throws java.lang.Throwable {
        /*
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            r4 = 28
            if (r0 <= r4) goto L35
            java.lang.String r0 = "ip -f inet addr show"
        L12:
            java.lang.Process r0 = r2.exec(r0)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            r0.waitFor()     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L83 java.io.IOException -> L88
        L27:
            java.lang.String r0 = r2.readLine()     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            if (r0 != 0) goto L38
            r2.close()     // Catch: java.lang.Exception -> L77
        L30:
            java.lang.String r0 = r3.toString()
            return r0
        L35:
            java.lang.String r0 = "ifconfig"
            goto L12
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            r1.<init>(r0)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            r3.append(r0)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L80 java.lang.InterruptedException -> L85
            goto L27
        L4f:
            r0 = move-exception
            r1 = r2
        L51:
            java.lang.String r2 = "NetUtils"
            java.lang.String r4 = "getIfconfigOutput()"
            android.util.Log.e(r2, r4, r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.lang.Exception -> L5e
            goto L30
        L5e:
            r0 = move-exception
            java.lang.String r1 = "NetUtils"
            java.lang.String r2 = "getIfconfigOutput()"
            android.util.Log.e(r1, r2, r0)
            goto L30
        L67:
            r0 = move-exception
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Exception -> L6e
        L6d:
            throw r0
        L6e:
            r1 = move-exception
            java.lang.String r2 = "NetUtils"
            java.lang.String r3 = "getIfconfigOutput()"
            android.util.Log.e(r2, r3, r1)
            goto L6d
        L77:
            r0 = move-exception
            java.lang.String r1 = "NetUtils"
            java.lang.String r2 = "getIfconfigOutput()"
            android.util.Log.e(r1, r2, r0)
            goto L30
        L80:
            r0 = move-exception
            r1 = r2
            goto L68
        L83:
            r0 = move-exception
            goto L51
        L85:
            r0 = move-exception
            r1 = r2
            goto L51
        L88:
            r0 = move-exception
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.p035b.C0358l.m1044c():java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static InputStream m1038a(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            uRLConnectionOpenConnection.connect();
            return uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            Log.e("NetUtils", "getISFromUrl(). URL=".concat(String.valueOf(str)), e);
            return null;
        }
    }
}
