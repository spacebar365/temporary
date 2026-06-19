package org.cybergarage.p155b;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.TreeMap;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.b.a */
/* JADX INFO: compiled from: HostInterface.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1637a {

    /* JADX INFO: renamed from: a */
    public static boolean f6360a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f6361b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f6362c = false;

    /* JADX INFO: renamed from: d */
    private static String f6363d = "";

    /* JADX INFO: renamed from: e */
    private static String f6364e = "";

    /* JADX INFO: renamed from: a */
    public static final void m4705a(String str) {
        f6363d = str;
    }

    /* JADX INFO: renamed from: b */
    public static final void m4708b(String str) {
        f6364e = str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m4702a() {
        return f6363d;
    }

    /* JADX INFO: renamed from: b */
    public static final String m4707b() {
        return f6364e;
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m4714f() {
        return f6363d.length() > 0;
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m4706a(InetAddress inetAddress) {
        if (!f6360a && inetAddress.isLoopbackAddress()) {
            return false;
        }
        if (f6361b && (inetAddress instanceof Inet6Address)) {
            return false;
        }
        return (f6362c && (inetAddress instanceof Inet4Address)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final int m4709c() {
        Exception e;
        if (m4714f()) {
            return 1;
        }
        int i = 0;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int i2 = 0;
            while (networkInterfaces.hasMoreElements()) {
                try {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (name.toLowerCase(Locale.US).contains("wlan") || name.toLowerCase(Locale.US).contains("eth") || name.toLowerCase(Locale.US).contains("usb") || name.toLowerCase(Locale.US).contains("p2p") || name.toLowerCase(Locale.US).contains("ap") || name.toLowerCase(Locale.US).contains("lo")) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        int i3 = i2;
                        while (inetAddresses.hasMoreElements()) {
                            try {
                                if (m4706a(inetAddresses.nextElement())) {
                                    i3++;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = i3;
                                C1744a.m5117a(e);
                                return i;
                            }
                        }
                        i2 = i3;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = i2;
                }
            }
            return i2;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InetAddress[] m4712d() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String name = networkInterfaceNextElement.getName();
                if (name.toLowerCase(Locale.US).contains("wlan") || name.toLowerCase(Locale.US).contains("eth") || name.toLowerCase(Locale.US).contains("usb") || name.toLowerCase(Locale.US).contains("p2p") || name.toLowerCase(Locale.US).contains("ap") || name.toLowerCase(Locale.US).contains("lo")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            arrayList.add(inetAddressNextElement);
                        }
                    }
                }
            }
            return (InetAddress[]) arrayList.toArray(new InetAddress[0]);
        } catch (SocketException e) {
            C1744a.m5117a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m4703a(int i) {
        int i2;
        int i3;
        if (!m4714f()) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                TreeMap treeMap = new TreeMap();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (name.toLowerCase(Locale.US).contains("wlan")) {
                        i3 = 0;
                    } else if (name.toLowerCase(Locale.US).contains("eth")) {
                        i3 = 1;
                    } else if (name.toLowerCase(Locale.US).contains("usb")) {
                        i3 = 2;
                    } else if (name.toLowerCase(Locale.US).contains("p2p")) {
                        i3 = 3;
                    } else if (name.toLowerCase(Locale.US).contains("ap")) {
                        i3 = 4;
                    } else if (name.toLowerCase(Locale.US).contains("lo")) {
                        i3 = 5;
                    }
                    while (treeMap.containsKey(Integer.valueOf(i3))) {
                        i3 += 10;
                    }
                    treeMap.put(Integer.valueOf(i3), networkInterfaceNextElement);
                }
                i2 = 0;
            } catch (Exception e) {
                C1744a.m5117a(e);
            }
            for (NetworkInterface networkInterface : treeMap.values()) {
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (m4706a(inetAddressNextElement)) {
                        if (i2 < i) {
                            i2++;
                        } else {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            f6364e = networkInterface.getName();
                            return hostAddress;
                        }
                        return "";
                    }
                }
            }
            return "";
        }
        return f6363d;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4710c(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet6Address;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m4711d(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet4Address;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m4713e() {
        int iM4709c = m4709c();
        for (int i = 0; i < iM4709c; i++) {
            String strM4703a = m4703a(i);
            if (m4711d(strM4703a)) {
                return strM4703a;
            }
        }
        f6364e = "";
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static final String m4704a(String str, int i, String str2) {
        if (m4710c(str)) {
            str = "[" + str + "]";
        }
        return "http://" + str + ":" + Integer.toString(i) + str2;
    }
}
