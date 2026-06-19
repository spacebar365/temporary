package com.p033al.dlnaserver.p035b;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bj */
/* JADX INFO: compiled from: StorageUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0345bj {

    /* JADX INFO: renamed from: a */
    private static final Pattern f1397a = Pattern.compile("(?i)/.+ (/storage/[\\dabcdefABCDEF]+-[\\dabcdefABCDEF]+).+");

    /* JADX INFO: renamed from: b */
    private static final Pattern f1398b = Pattern.compile("(?i)/.+vold.+(vfat|ntfs|exfat|sdfat|fat32|ext3|ext4).+rw.*");

    /* JADX INFO: renamed from: com.al.dlnaserver.b.bj$a */
    /* JADX INFO: compiled from: StorageUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f1399a;

        /* JADX INFO: renamed from: b */
        public final boolean f1400b;

        /* JADX INFO: renamed from: c */
        public final boolean f1401c;

        /* JADX INFO: renamed from: d */
        public final int f1402d;

        a(String str, boolean z, boolean z2, int i) {
            this.f1399a = str;
            this.f1400b = z;
            this.f1401c = z2;
            this.f1402d = i;
        }

        /* JADX INFO: renamed from: a */
        public final String m1013a() {
            StringBuilder sb = new StringBuilder();
            if (!this.f1401c) {
                sb.append("Internal SD card");
            } else if (this.f1402d > 1) {
                sb.append("SD card " + this.f1402d + " (" + this.f1399a.substring(this.f1399a.lastIndexOf("/")) + ")");
            } else {
                sb.append("SD card (" + this.f1399a.substring(this.f1399a.lastIndexOf("/")) + ")");
            }
            if (this.f1400b) {
                sb.append(" (Read only)");
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.p033al.dlnaserver.p035b.C0345bj.a> m1012a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.p035b.C0345bj.m1012a():java.util.List");
    }
}
