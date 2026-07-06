package com.al.dlnaserver.b;

/* JADX INFO: compiled from: StorageUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class bj$a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;

    bj$a(String str, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        if (!this.c) {
            sb.append("Internal SD card");
        } else if (this.d > 1) {
            sb.append("SD card " + this.d + " (" + this.a.substring(this.a.lastIndexOf("/")) + ")");
        } else {
            sb.append("SD card (" + this.a.substring(this.a.lastIndexOf("/")) + ")");
        }
        if (this.b) {
            sb.append(" (Read only)");
        }
        return sb.toString();
    }
}
