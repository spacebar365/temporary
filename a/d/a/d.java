package a.d.a;

import a.j;
import java.util.Arrays;

/* JADX INFO: compiled from: DfsReferralResponseBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements j {
    private int a;
    private int b;
    private int c;
    private e[] d;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final e[] d() {
        return this.d;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.a(bArr, i) / 2;
        int i3 = i + 2;
        this.b = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        this.c = a.d.f.a.a(bArr, i4);
        int iA = i4 + 4;
        this.d = new e[this.b];
        for (int i5 = 0; i5 < this.b; i5++) {
            this.d[i5] = new e();
            iA += this.d[i5].a(bArr, iA, i2);
        }
        return iA - i;
    }

    public String toString() {
        return "pathConsumed=" + this.a + ",numReferrals=" + this.b + ",flags=" + this.c + ",referrals=" + Arrays.toString(this.d);
    }
}
