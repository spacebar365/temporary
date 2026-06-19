package p000a.p003c;

import p000a.p003c.C0043l;

/* JADX INFO: renamed from: a.c.j */
/* JADX INFO: compiled from: UUID.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0041j extends C0043l.d {

    /* JADX INFO: renamed from: a */
    static final char[] f205a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    private static int m169a(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < cArr.length && i4 < i2; i6++) {
            int i7 = i5 << 4;
            switch (cArr[i6]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i3 = cArr[i6] - '0';
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    i3 = (cArr[i6] - 'A') + 10;
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                    i3 = (cArr[i6] - 'a') + 10;
                    break;
                default:
                    throw new IllegalArgumentException(new String(cArr, i, i2));
            }
            i5 = i3 + i7;
            i4++;
        }
        return i5;
    }

    /* JADX INFO: renamed from: a */
    private static String m170a(int i, int i2) {
        char[] cArr = new char[i2];
        int length = cArr.length;
        while (true) {
            int i3 = length - 1;
            if (length > 0) {
                cArr[i3] = f205a[i & 15];
                i >>>= 4;
                length = i3;
            } else {
                return new String(cArr);
            }
        }
    }

    public C0041j(String str) {
        char[] charArray = str.toCharArray();
        this.f216b = m169a(charArray, 0, 8);
        this.f217c = (short) (m169a(charArray, 9, 4) & 65535);
        this.f218d = (short) (m169a(charArray, 14, 4) & 65535);
        this.f219e = (byte) (m169a(charArray, 19, 2) & 255);
        this.f220f = (byte) (m169a(charArray, 21, 2) & 255);
        this.f221g = new byte[6];
        this.f221g[0] = (byte) (m169a(charArray, 24, 2) & 255);
        this.f221g[1] = (byte) (m169a(charArray, 26, 2) & 255);
        this.f221g[2] = (byte) (m169a(charArray, 28, 2) & 255);
        this.f221g[3] = (byte) (m169a(charArray, 30, 2) & 255);
        this.f221g[4] = (byte) (m169a(charArray, 32, 2) & 255);
        this.f221g[5] = (byte) (m169a(charArray, 34, 2) & 255);
    }

    public final String toString() {
        return m170a(this.f216b, 8) + '-' + m170a(this.f217c, 4) + '-' + m170a(this.f218d, 4) + '-' + m170a(this.f219e, 2) + m170a(this.f220f, 2) + '-' + m170a(this.f221g[0], 2) + m170a(this.f221g[1], 2) + m170a(this.f221g[2], 2) + m170a(this.f221g[3], 2) + m170a(this.f221g[4], 2) + m170a(this.f221g[5], 2);
    }
}
