package a.e;

import java.net.InetAddress;

/* JADX INFO: compiled from: NameServicePacket.java */
/* JADX INFO: loaded from: classes.dex */
abstract class g {
    int a;
    h[] b;
    int c;
    int d;
    int e;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean o;
    b q;
    b r;
    int s;
    int u;
    int v;
    int w;
    int x;
    InetAddress y;
    protected a.h z;
    boolean n = true;
    boolean p = true;
    int f = 1;
    int t = 1;

    abstract int a(byte[] bArr);

    abstract int a(byte[] bArr, int i);

    abstract int b(byte[] bArr);

    static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    static int b(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    static int c(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    g(a.h hVar) {
        this.z = hVar;
    }

    final int c(byte[] bArr) {
        int iA = this.q.a(bArr, 12) + 12;
        a(this.s, bArr, iA);
        a(this.t, bArr, iA + 2);
        return (r0 + 2) - 12;
    }

    final int d(byte[] bArr, int i) {
        int iA;
        if ((bArr[12] & 192) == 192) {
            this.r = this.q;
            iA = i + 2;
        } else {
            iA = this.r.a(bArr) + 12;
        }
        this.u = b(bArr, iA);
        int i2 = iA + 2;
        this.v = b(bArr, i2);
        int i3 = i2 + 2;
        this.w = c(bArr, i3);
        int i4 = i3 + 4;
        this.x = b(bArr, i4);
        int iA2 = i4 + 2;
        this.b = new h[this.x / 6];
        int i5 = this.x + iA2;
        this.a = 0;
        while (iA2 < i5) {
            iA2 += a(bArr, iA2);
            this.a++;
        }
        return iA2 - 12;
    }

    public String toString() {
        String string;
        String str;
        String str2;
        String str3;
        switch (this.d) {
            case 0:
                string = "QUERY";
                break;
            case 7:
                string = "WACK";
                break;
            default:
                string = Integer.toString(this.d);
                break;
        }
        switch (this.e) {
            case 1:
                str = "FMT_ERR";
                break;
            case 2:
                str = "SRV_ERR";
                break;
            case 3:
            default:
                str = "0x" + a.i.e.a(this.e, 1);
                break;
            case 4:
                str = "IMP_ERR";
                break;
            case 5:
                str = "RFS_ERR";
                break;
            case 6:
                str = "ACT_ERR";
                break;
            case 7:
                str = "CFT_ERR";
                break;
        }
        switch (this.s) {
            case 32:
                str2 = "NB";
                break;
            case 33:
                str2 = "NBSTAT";
                break;
            default:
                str2 = "0x" + a.i.e.a(this.s, 4);
                break;
        }
        switch (this.u) {
            case 1:
                str3 = "A";
                break;
            case 2:
                str3 = "NS";
                break;
            case 10:
                str3 = "NULL";
                break;
            case 32:
                str3 = "NB";
                break;
            case 33:
                str3 = "NBSTAT";
                break;
            default:
                str3 = "0x" + a.i.e.a(this.u, 4);
                break;
        }
        return new String("nameTrnId=" + this.c + ",isResponse=" + this.k + ",opCode=" + string + ",isAuthAnswer=" + this.l + ",isTruncated=" + this.m + ",isRecurAvailable=" + this.o + ",isRecurDesired=" + this.n + ",isBroadcast=" + this.p + ",resultCode=" + str + ",questionCount=" + this.f + ",answerCount=" + this.g + ",authorityCount=" + this.h + ",additionalCount=" + this.i + ",questionName=" + this.q + ",questionType=" + str2 + ",questionClass=" + (this.t == 1 ? "IN" : "0x" + a.i.e.a(this.t, 4)) + ",recordName=" + this.r + ",recordType=" + str3 + ",recordClass=" + (this.v == 1 ? "IN" : "0x" + a.i.e.a(this.v, 4)) + ",ttl=" + this.w + ",rDataLength=" + this.x);
    }
}
