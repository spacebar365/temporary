package org.cybergarage.p173e;

/* JADX INFO: renamed from: org.cybergarage.e.d */
/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1747d {
    /* JADX INFO: renamed from: a */
    public static final long m5126a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            C1744a.m5117a(e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m5125a(String str, String str2, int i, int i2, int i3) {
        if (i3 == 0) {
            return -1;
        }
        int length = str2.length();
        int i4 = i;
        while (true) {
            if (i3 > 0) {
                if (i2 < i4) {
                    return -1;
                }
            } else if (i4 < i2) {
                return -1;
            }
            char cCharAt = str.charAt(i4);
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (cCharAt != str2.charAt(i6)) {
                    i5++;
                }
                if (i5 == length) {
                    return i4;
                }
            }
            i4 += i3;
        }
    }
}
