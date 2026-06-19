package org.cybergarage.p157d.p159b;

/* JADX INFO: renamed from: org.cybergarage.d.b.f */
/* JADX INFO: compiled from: ST.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1657f {
    /* JADX INFO: renamed from: a */
    public static final boolean m4742a(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("ssdp:all")) {
            return true;
        }
        return str.equals("\"ssdp:all\"");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4743b(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("upnp:rootdevice")) {
            return true;
        }
        return str.equals("\"upnp:rootdevice\"");
    }
}
