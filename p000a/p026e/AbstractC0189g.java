package p000a.p026e;

import java.net.InetAddress;
import p000a.InterfaceC0267h;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.e.g */
/* JADX INFO: compiled from: NameServicePacket.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0189g {

    /* JADX INFO: renamed from: a */
    int f868a;

    /* JADX INFO: renamed from: b */
    C0190h[] f869b;

    /* JADX INFO: renamed from: c */
    int f870c;

    /* JADX INFO: renamed from: d */
    int f871d;

    /* JADX INFO: renamed from: e */
    int f872e;

    /* JADX INFO: renamed from: g */
    int f874g;

    /* JADX INFO: renamed from: h */
    int f875h;

    /* JADX INFO: renamed from: i */
    int f876i;

    /* JADX INFO: renamed from: j */
    boolean f877j;

    /* JADX INFO: renamed from: k */
    boolean f878k;

    /* JADX INFO: renamed from: l */
    boolean f879l;

    /* JADX INFO: renamed from: m */
    boolean f880m;

    /* JADX INFO: renamed from: o */
    boolean f882o;

    /* JADX INFO: renamed from: q */
    C0184b f884q;

    /* JADX INFO: renamed from: r */
    C0184b f885r;

    /* JADX INFO: renamed from: s */
    int f886s;

    /* JADX INFO: renamed from: u */
    int f888u;

    /* JADX INFO: renamed from: v */
    int f889v;

    /* JADX INFO: renamed from: w */
    int f890w;

    /* JADX INFO: renamed from: x */
    int f891x;

    /* JADX INFO: renamed from: y */
    InetAddress f892y;

    /* JADX INFO: renamed from: z */
    protected InterfaceC0267h f893z;

    /* JADX INFO: renamed from: n */
    boolean f881n = true;

    /* JADX INFO: renamed from: p */
    boolean f883p = true;

    /* JADX INFO: renamed from: f */
    int f873f = 1;

    /* JADX INFO: renamed from: t */
    int f887t = 1;

    /* JADX INFO: renamed from: a */
    abstract int mo532a(byte[] bArr);

    /* JADX INFO: renamed from: a */
    abstract int mo533a(byte[] bArr, int i);

    /* JADX INFO: renamed from: b */
    abstract int mo534b(byte[] bArr);

    /* JADX INFO: renamed from: a */
    static void m564a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: b */
    static int m565b(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: c */
    static int m566c(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    AbstractC0189g(InterfaceC0267h interfaceC0267h) {
        this.f893z = interfaceC0267h;
    }

    /* JADX INFO: renamed from: c */
    final int m567c(byte[] bArr) {
        int iM527a = this.f884q.m527a(bArr, 12) + 12;
        m564a(this.f886s, bArr, iM527a);
        m564a(this.f887t, bArr, iM527a + 2);
        return (r0 + 2) - 12;
    }

    /* JADX INFO: renamed from: d */
    final int m568d(byte[] bArr, int i) {
        int iM526a;
        if ((bArr[12] & 192) == 192) {
            this.f885r = this.f884q;
            iM526a = i + 2;
        } else {
            iM526a = this.f885r.m526a(bArr) + 12;
        }
        this.f888u = m565b(bArr, iM526a);
        int i2 = iM526a + 2;
        this.f889v = m565b(bArr, i2);
        int i3 = i2 + 2;
        this.f890w = m566c(bArr, i3);
        int i4 = i3 + 4;
        this.f891x = m565b(bArr, i4);
        int iMo533a = i4 + 2;
        this.f869b = new C0190h[this.f891x / 6];
        int i5 = this.f891x + iMo533a;
        this.f868a = 0;
        while (iMo533a < i5) {
            iMo533a += mo533a(bArr, iMo533a);
            this.f868a++;
        }
        return iMo533a - 12;
    }

    public String toString() {
        String string;
        String str;
        String str2;
        String str3;
        switch (this.f871d) {
            case 0:
                string = "QUERY";
                break;
            case 7:
                string = "WACK";
                break;
            default:
                string = Integer.toString(this.f871d);
                break;
        }
        switch (this.f872e) {
            case 1:
                str = "FMT_ERR";
                break;
            case 2:
                str = "SRV_ERR";
                break;
            case 3:
            default:
                str = "0x" + C0284e.m947a(this.f872e, 1);
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
        switch (this.f886s) {
            case 32:
                str2 = "NB";
                break;
            case 33:
                str2 = "NBSTAT";
                break;
            default:
                str2 = "0x" + C0284e.m947a(this.f886s, 4);
                break;
        }
        switch (this.f888u) {
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
                str3 = "0x" + C0284e.m947a(this.f888u, 4);
                break;
        }
        return new String("nameTrnId=" + this.f870c + ",isResponse=" + this.f878k + ",opCode=" + string + ",isAuthAnswer=" + this.f879l + ",isTruncated=" + this.f880m + ",isRecurAvailable=" + this.f882o + ",isRecurDesired=" + this.f881n + ",isBroadcast=" + this.f883p + ",resultCode=" + str + ",questionCount=" + this.f873f + ",answerCount=" + this.f874g + ",authorityCount=" + this.f875h + ",additionalCount=" + this.f876i + ",questionName=" + this.f884q + ",questionType=" + str2 + ",questionClass=" + (this.f887t == 1 ? "IN" : "0x" + C0284e.m947a(this.f887t, 4)) + ",recordName=" + this.f885r + ",recordType=" + str3 + ",recordClass=" + (this.f889v == 1 ? "IN" : "0x" + C0284e.m947a(this.f889v, 4)) + ",ttl=" + this.f890w + ",rDataLength=" + this.f891x);
    }
}
