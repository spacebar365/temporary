package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.at */
/* JADX INFO: loaded from: classes.dex */
public final class C0557at extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private final char[] f2018a;

    public C0557at(String str) {
        this.f2018a = str.toCharArray();
    }

    C0557at(char[] cArr) {
        this.f2018a = cArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.mo1608b(30);
        c0660s.m1602a(this.f2018a.length * 2);
        for (int i = 0; i != this.f2018a.length; i++) {
            char c = this.f2018a[i];
            c0660s.mo1608b((byte) (c >> '\b'));
            c0660s.mo1608b((byte) c);
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        return new String(this.f2018a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2018a.length * 2) + 1 + (this.f2018a.length * 2);
    }

    public final String toString() {
        return mo1350b();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        char[] cArr = this.f2018a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    protected final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof C0557at)) {
            return false;
        }
        char[] cArr = this.f2018a;
        char[] cArr2 = ((C0557at) abstractC0686u).f2018a;
        if (cArr != cArr2) {
            if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                return false;
            }
            for (int i = 0; i != cArr.length; i++) {
                if (cArr[i] != cArr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
