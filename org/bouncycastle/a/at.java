package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class at extends u implements aa {
    private final char[] a;

    public at(String str) {
        this.a = str.toCharArray();
    }

    at(char[] cArr) {
        this.a = cArr;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.b(30);
        sVar.a(this.a.length * 2);
        for (int i = 0; i != this.a.length; i++) {
            char c = this.a[i];
            sVar.b((byte) (c >> '\b'));
            sVar.b((byte) c);
        }
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        return new String(this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length * 2) + 1 + (this.a.length * 2);
    }

    public final String toString() {
        return b();
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        char[] cArr = this.a;
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

    @Override // org.bouncycastle.a.u
    protected final boolean a(u uVar) {
        if (!(uVar instanceof at)) {
            return false;
        }
        char[] cArr = this.a;
        char[] cArr2 = ((at) uVar).a;
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
