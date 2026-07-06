package org.cybergarage.d.d;

/* JADX INFO: compiled from: SSDPSearchResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public j() {
        b(200);
        a("Cache-Control", String.valueOf("max-age") + "=" + Integer.toString(1800));
        a("Server", org.cybergarage.d.n.a());
        a("EXT", "");
    }
}
