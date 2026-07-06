package org.cybergarage.d.b;

/* JADX INFO: compiled from: ST.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("ssdp:all")) {
            return true;
        }
        return str.equals("\"ssdp:all\"");
    }

    public static final boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("upnp:rootdevice")) {
            return true;
        }
        return str.equals("\"upnp:rootdevice\"");
    }
}
