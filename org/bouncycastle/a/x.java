package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.f.a$a;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends u implements org.bouncycastle.f.d<f> {
    private Vector a = new Vector();
    private boolean b = false;

    protected x() {
    }

    protected x(f fVar) {
        this.a.addElement(fVar);
    }

    protected x(g gVar, boolean z) {
        for (int i = 0; i != gVar.a(); i++) {
            this.a.addElement(gVar.a(i));
        }
        if (z) {
            f();
        }
    }

    protected x(f[] fVarArr) {
        for (int i = 0; i != fVarArr.length; i++) {
            this.a.addElement(fVarArr[i]);
        }
    }

    private static f a(Enumeration enumeration) {
        f fVar = (f) enumeration.nextElement();
        return fVar == null ? bc.a : fVar;
    }

    public static x a(Object obj) {
        Object objI = obj;
        while (objI != null && !(objI instanceof x)) {
            if (!(objI instanceof y)) {
                if (objI instanceof byte[]) {
                    try {
                        return a((Object) u.b((byte[]) objI));
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
                    }
                }
                if (objI instanceof f) {
                    u uVarI = ((f) objI).i();
                    if (uVarI instanceof x) {
                        return (x) uVarI;
                    }
                }
                throw new IllegalArgumentException("unknown object in getInstance: " + objI.getClass().getName());
            }
            objI = ((y) objI).i();
        }
        return (x) objI;
    }

    private static byte[] a(f fVar) {
        try {
            return fVar.i().a("DER");
        } catch (IOException e) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public final f a(int i) {
        return (f) this.a.elementAt(i);
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return true;
    }

    public final Enumeration b() {
        return this.a.elements();
    }

    public final int c() {
        return this.a.size();
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        if (this.b) {
            bk bkVar = new bk();
            ((x) bkVar).a = this.a;
            return bkVar;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.a.size(); i++) {
            vector.addElement(this.a.elementAt(i));
        }
        bk bkVar2 = new bk();
        ((x) bkVar2).a = vector;
        bkVar2.f();
        return bkVar2;
    }

    @Override // org.bouncycastle.a.u
    final u h() {
        bx bxVar = new bx();
        ((x) bxVar).a = this.a;
        return bxVar;
    }

    @Override // java.lang.Iterable
    public Iterator<f> iterator() {
        return new a$a(d());
    }

    public String toString() {
        return this.a.toString();
    }

    public static x a(ab abVar) {
        u uVarJ = abVar.j();
        if (abVar.c) {
            return abVar instanceof ap ? new an(uVarJ) : new bx(uVarJ);
        }
        if (uVarJ instanceof x) {
            return (x) uVarJ;
        }
        if (!(uVarJ instanceof v)) {
            throw new IllegalArgumentException("unknown object in getInstance: " + abVar.getClass().getName());
        }
        v vVar = (v) uVarJ;
        return abVar instanceof ap ? new an(vVar.b()) : new bx(vVar.b());
    }

    private f[] d() {
        f[] fVarArr = new f[this.a.size()];
        for (int i = 0; i != this.a.size(); i++) {
            fVarArr[i] = a(i);
        }
        return fVarArr;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        Enumeration enumerationElements = this.a.elements();
        int size = this.a.size();
        while (enumerationElements.hasMoreElements()) {
            size = (size * 17) ^ a(enumerationElements).hashCode();
        }
        return size;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (!(uVar instanceof x)) {
            return false;
        }
        x xVar = (x) uVar;
        if (this.a.size() != xVar.a.size()) {
            return false;
        }
        Enumeration enumerationElements = this.a.elements();
        Enumeration enumerationElements2 = xVar.a.elements();
        while (enumerationElements.hasMoreElements()) {
            f fVarA = a(enumerationElements);
            f fVarA2 = a(enumerationElements2);
            u uVarI = fVarA.i();
            u uVarI2 = fVarA2.i();
            if (uVarI != uVarI2 && !uVarI.equals(uVarI2)) {
                return false;
            }
        }
        return true;
    }

    private void f() {
        boolean z;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.a.size() > 1) {
            int size = this.a.size() - 1;
            boolean z2 = true;
            while (z2) {
                byte[] bArrA = a((f) this.a.elementAt(0));
                int i = 0;
                int i2 = 0;
                z2 = false;
                while (i2 != size) {
                    byte[] bArrA2 = a((f) this.a.elementAt(i2 + 1));
                    int iMin = Math.min(bArrA.length, bArrA2.length);
                    int i3 = 0;
                    while (true) {
                        if (i3 == iMin) {
                            z = iMin == bArrA.length;
                        } else if (bArrA[i3] != bArrA2[i3]) {
                            z = (bArrA[i3] & 255) < (bArrA2[i3] & 255);
                        } else {
                            i3++;
                        }
                    }
                    if (!z) {
                        Object objElementAt = this.a.elementAt(i2);
                        this.a.setElementAt(this.a.elementAt(i2 + 1), i2);
                        this.a.setElementAt(objElementAt, i2 + 1);
                        bArrA2 = bArrA;
                        i = i2;
                        z2 = true;
                    }
                    i2++;
                    bArrA = bArrA2;
                }
                size = i;
            }
        }
    }
}
