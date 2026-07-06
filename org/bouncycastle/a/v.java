package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.f.a$a;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends u implements org.bouncycastle.f.d<f> {
    protected Vector a = new Vector();

    protected v() {
    }

    protected v(f fVar) {
        this.a.addElement(fVar);
    }

    protected v(g gVar) {
        for (int i = 0; i != gVar.a(); i++) {
            this.a.addElement(gVar.a(i));
        }
    }

    protected v(f[] fVarArr) {
        for (int i = 0; i != fVarArr.length; i++) {
            this.a.addElement(fVarArr[i]);
        }
    }

    private static f a(Enumeration enumeration) {
        return (f) enumeration.nextElement();
    }

    public static v a(Object obj) {
        Object objI = obj;
        while (objI != null && !(objI instanceof v)) {
            if (!(objI instanceof w)) {
                if (objI instanceof byte[]) {
                    try {
                        return a((Object) b((byte[]) objI));
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
                    }
                }
                if (objI instanceof f) {
                    u uVarI = ((f) objI).i();
                    if (uVarI instanceof v) {
                        return (v) uVarI;
                    }
                }
                throw new IllegalArgumentException("unknown object in getInstance: " + objI.getClass().getName());
            }
            objI = ((w) objI).i();
        }
        return (v) objI;
    }

    public f a(int i) {
        return (f) this.a.elementAt(i);
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return true;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (!(uVar instanceof v)) {
            return false;
        }
        v vVar = (v) uVar;
        if (d() != vVar.d()) {
            return false;
        }
        Enumeration enumerationC = c();
        Enumeration enumerationC2 = vVar.c();
        while (enumerationC.hasMoreElements()) {
            f fVarA = a(enumerationC);
            f fVarA2 = a(enumerationC2);
            u uVarI = fVarA.i();
            u uVarI2 = fVarA2.i();
            if (uVarI != uVarI2 && !uVarI.equals(uVarI2)) {
                return false;
            }
        }
        return true;
    }

    public final f[] b() {
        f[] fVarArr = new f[d()];
        for (int i = 0; i != d(); i++) {
            fVarArr[i] = a(i);
        }
        return fVarArr;
    }

    public Enumeration c() {
        return this.a.elements();
    }

    public int d() {
        return this.a.size();
    }

    @Override // org.bouncycastle.a.u
    u g() {
        bi biVar = new bi();
        biVar.a = this.a;
        return biVar;
    }

    @Override // org.bouncycastle.a.u
    u h() {
        bw bwVar = new bw();
        bwVar.a = this.a;
        return bwVar;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        Enumeration enumerationC = c();
        int iD = d();
        while (enumerationC.hasMoreElements()) {
            iD = (iD * 17) ^ a(enumerationC).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public Iterator<f> iterator() {
        return new a$a(b());
    }

    public String toString() {
        return this.a.toString();
    }

    public static v a(ab abVar, boolean z) {
        if (z) {
            if (abVar.c) {
                return a((Object) abVar.j().i());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        u uVarJ = abVar.j();
        if (abVar.c) {
            return abVar instanceof ap ? new al(uVarJ) : new bw(uVarJ);
        }
        if (uVarJ instanceof v) {
            return (v) uVarJ;
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abVar.getClass().getName());
    }
}
