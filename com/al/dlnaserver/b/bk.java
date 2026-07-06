package com.al.dlnaserver.b;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class bk {
    public static int a(CharSequence... charSequenceArr) {
        if (charSequenceArr == null || charSequenceArr.length <= 1) {
            return -1;
        }
        int length = charSequenceArr.length;
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        boolean z = true;
        boolean z2 = false;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                iMin = 0;
                z2 = true;
            } else {
                iMin = Math.min(charSequence.length(), iMin);
                iMax = Math.max(charSequence.length(), iMax);
                z = false;
            }
        }
        if (z || (iMax == 0 && !z2)) {
            return -1;
        }
        if (iMin == 0) {
            return 0;
        }
        int i = -1;
        for (int i2 = 0; i2 < iMin; i2++) {
            char cCharAt = charSequenceArr[0].charAt(i2);
            int i3 = 1;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (charSequenceArr[i3].charAt(i2) != cCharAt) {
                    i = i2;
                    break;
                }
                i3++;
            }
            if (i != -1) {
                break;
            }
        }
        int i4 = i;
        return (i4 != -1 || iMin == iMax) ? i4 : iMin;
    }
}
