package p000a.p006d.p007a;

import java.util.Arrays;
import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.a.d */
/* JADX INFO: compiled from: DfsReferralResponseBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public class C0049d implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private int f239a;

    /* JADX INFO: renamed from: b */
    private int f240b;

    /* JADX INFO: renamed from: c */
    private int f241c;

    /* JADX INFO: renamed from: d */
    private C0050e[] f242d;

    /* JADX INFO: renamed from: a */
    public final int m200a() {
        return this.f239a;
    }

    /* JADX INFO: renamed from: b */
    public final int m202b() {
        return this.f240b;
    }

    /* JADX INFO: renamed from: c */
    public final int m203c() {
        return this.f241c;
    }

    /* JADX INFO: renamed from: d */
    public final C0050e[] m204d() {
        return this.f242d;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f239a = C0173a.m509a(bArr, i) / 2;
        int i3 = i + 2;
        this.f240b = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        this.f241c = C0173a.m509a(bArr, i4);
        int iMo201a = i4 + 4;
        this.f242d = new C0050e[this.f240b];
        for (int i5 = 0; i5 < this.f240b; i5++) {
            this.f242d[i5] = new C0050e();
            iMo201a += this.f242d[i5].mo201a(bArr, iMo201a, i2);
        }
        return iMo201a - i;
    }

    public String toString() {
        return "pathConsumed=" + this.f239a + ",numReferrals=" + this.f240b + ",flags=" + this.f241c + ",referrals=" + Arrays.toString(this.f242d);
    }
}
