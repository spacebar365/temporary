package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1553d;

/* JADX INFO: renamed from: org.bouncycastle.a.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723v extends AbstractC0686u implements InterfaceC1553d<InterfaceC0618f> {

    /* JADX INFO: renamed from: a */
    protected Vector f2909a = new Vector();

    protected AbstractC0723v() {
    }

    protected AbstractC0723v(InterfaceC0618f interfaceC0618f) {
        this.f2909a.addElement(interfaceC0618f);
    }

    protected AbstractC0723v(C0625g c0625g) {
        for (int i = 0; i != c0625g.m1519a(); i++) {
            this.f2909a.addElement(c0625g.m1520a(i));
        }
    }

    protected AbstractC0723v(InterfaceC0618f[] interfaceC0618fArr) {
        for (int i = 0; i != interfaceC0618fArr.length; i++) {
            this.f2909a.addElement(interfaceC0618fArr[i]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0618f m1707a(Enumeration enumeration) {
        return (InterfaceC0618f) enumeration.nextElement();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0723v m1708a(Object obj) {
        Object objI = obj;
        while (objI != null && !(objI instanceof AbstractC0723v)) {
            if (!(objI instanceof InterfaceC0740w)) {
                if (objI instanceof byte[]) {
                    try {
                        return m1708a((Object) m1692b((byte[]) objI));
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
                    }
                }
                if (objI instanceof InterfaceC0618f) {
                    AbstractC0686u abstractC0686uMo1358i = ((InterfaceC0618f) objI).mo1358i();
                    if (abstractC0686uMo1358i instanceof AbstractC0723v) {
                        return (AbstractC0723v) abstractC0686uMo1358i;
                    }
                }
                throw new IllegalArgumentException("unknown object in getInstance: " + objI.getClass().getName());
            }
            objI = ((InterfaceC0740w) objI).mo1358i();
        }
        return (AbstractC0723v) objI;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0618f mo1482a(int i) {
        return (InterfaceC0618f) this.f2909a.elementAt(i);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return true;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0723v)) {
            return false;
        }
        AbstractC0723v abstractC0723v = (AbstractC0723v) abstractC0686u;
        if (mo1484d() != abstractC0723v.mo1484d()) {
            return false;
        }
        Enumeration enumerationMo1483c = mo1483c();
        Enumeration enumerationMo1483c2 = abstractC0723v.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            InterfaceC0618f interfaceC0618fM1707a = m1707a(enumerationMo1483c);
            InterfaceC0618f interfaceC0618fM1707a2 = m1707a(enumerationMo1483c2);
            AbstractC0686u abstractC0686uMo1358i = interfaceC0618fM1707a.mo1358i();
            AbstractC0686u abstractC0686uMo1358i2 = interfaceC0618fM1707a2.mo1358i();
            if (abstractC0686uMo1358i != abstractC0686uMo1358i2 && !abstractC0686uMo1358i.equals(abstractC0686uMo1358i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f[] m1710b() {
        InterfaceC0618f[] interfaceC0618fArr = new InterfaceC0618f[mo1484d()];
        for (int i = 0; i != mo1484d(); i++) {
            interfaceC0618fArr[i] = mo1482a(i);
        }
        return interfaceC0618fArr;
    }

    /* JADX INFO: renamed from: c */
    public Enumeration mo1483c() {
        return this.f2909a.elements();
    }

    /* JADX INFO: renamed from: d */
    public int mo1484d() {
        return this.f2909a.size();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    AbstractC0686u mo1400g() {
        C0585bi c0585bi = new C0585bi();
        c0585bi.f2909a = this.f2909a;
        return c0585bi;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    AbstractC0686u mo1401h() {
        C0599bw c0599bw = new C0599bw();
        c0599bw.f2909a = this.f2909a;
        return c0599bw;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        Enumeration enumerationMo1483c = mo1483c();
        int iMo1484d = mo1484d();
        while (enumerationMo1483c.hasMoreElements()) {
            iMo1484d = (iMo1484d * 17) ^ m1707a(enumerationMo1483c).hashCode();
        }
        return iMo1484d;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC0618f> iterator() {
        return new C1535a.a(m1710b());
    }

    public String toString() {
        return this.f2909a.toString();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0723v m1709a(AbstractC0539ab abstractC0539ab, boolean z) {
        if (z) {
            if (abstractC0539ab.f1998c) {
                return m1708a((Object) abstractC0539ab.m1402j().mo1358i());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        if (abstractC0539ab.f1998c) {
            return abstractC0539ab instanceof C0553ap ? new C0549al(abstractC0686uM1402j) : new C0599bw(abstractC0686uM1402j);
        }
        if (abstractC0686uM1402j instanceof AbstractC0723v) {
            return (AbstractC0723v) abstractC0686uM1402j;
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC0539ab.getClass().getName());
    }
}
