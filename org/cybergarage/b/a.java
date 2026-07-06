package org.cybergarage.b;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: compiled from: HostInterface.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    private static String d = "";
    private static String e = "";

    public static final void a(String str) {
        d = str;
    }

    public static final void b(String str) {
        e = str;
    }

    public static final String a() {
        return d;
    }

    public static final String b() {
        return e;
    }

    private static final boolean f() {
        return d.length() > 0;
    }

    private static final boolean a(InetAddress inetAddress) {
        if (!a && inetAddress.isLoopbackAddress()) {
            return false;
        }
        if (b && (inetAddress instanceof Inet6Address)) {
            return false;
        }
        return (c && (inetAddress instanceof Inet4Address)) ? false : true;
    }

    public static final int c() {
        Exception e2;
        if (f()) {
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
                                if (a(inetAddresses.nextElement())) {
                                    i3++;
                                }
                            } catch (Exception e3) {
                                e2 = e3;
                                i = i3;
                                org.cybergarage.e.a.a(e2);
                                return i;
                            }
                        }
                        i2 = i3;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    i = i2;
                }
            }
            return i2;
        } catch (Exception e5) {
            e2 = e5;
        }
    }

    public static final InetAddress[] d() {
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
        } catch (SocketException e2) {
            org.cybergarage.e.a.a(e2);
            return null;
        }
    }

    public static final String a(int i) {
        int i2;
        int i3;
        if (!f()) {
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
            } catch (Exception e2) {
                org.cybergarage.e.a.a(e2);
            }
            for (NetworkInterface networkInterface : treeMap.values()) {
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (a(inetAddressNextElement)) {
                        if (i2 < i) {
                            i2++;
                        } else {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            e = networkInterface.getName();
                            return hostAddress;
                        }
                        return "";
                    }
                }
            }
            return "";
        }
        return d;
    }

    public static final boolean c(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet6Address;
        } catch (Exception e2) {
            org.cybergarage.e.a.a(e2);
            return false;
        }
    }

    public static final boolean d(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet4Address;
        } catch (Exception e2) {
            org.cybergarage.e.a.a(e2);
            return false;
        }
    }

    public static final String e() {
        int iC = c();
        for (int i = 0; i < iC; i++) {
            String strA = a(i);
            if (d(strA)) {
                return strA;
            }
        }
        e = "";
        return "";
    }

    public static final String a(String str, int i, String str2) {
        if (c(str)) {
            str = "[" + str + "]";
        }
        return "http://" + str + ":" + Integer.toString(i) + str2;
    }
}
