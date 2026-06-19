package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1553d;

/* JADX INFO: renamed from: org.bouncycastle.a.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0747x extends AbstractC0686u implements InterfaceC1553d<InterfaceC0618f> {

    /* JADX INFO: renamed from: a */
    private Vector f3013a = new Vector();

    /* JADX INFO: renamed from: b */
    private boolean f3014b = false;

    protected AbstractC0747x() {
    }

    protected AbstractC0747x(InterfaceC0618f interfaceC0618f) {
        this.f3013a.addElement(interfaceC0618f);
    }

    protected AbstractC0747x(C0625g c0625g, boolean z) {
        for (int i = 0; i != c0625g.m1519a(); i++) {
            this.f3013a.addElement(c0625g.m1520a(i));
        }
        if (z) {
            m1745f();
        }
    }

    protected AbstractC0747x(InterfaceC0618f[] interfaceC0618fArr) {
        for (int i = 0; i != interfaceC0618fArr.length; i++) {
            this.f3013a.addElement(interfaceC0618fArr[i]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0618f m1740a(Enumeration enumeration) {
        InterfaceC0618f interfaceC0618f = (InterfaceC0618f) enumeration.nextElement();
        return interfaceC0618f == null ? C0579bc.f2112a : interfaceC0618f;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0747x m1741a(Object obj) {
        Object objI = obj;
        while (objI != null && !(objI instanceof AbstractC0747x)) {
            if (!(objI instanceof InterfaceC0749y)) {
                if (objI instanceof byte[]) {
                    try {
                        return m1741a((Object) AbstractC0686u.m1692b((byte[]) objI));
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
                    }
                }
                if (objI instanceof InterfaceC0618f) {
                    AbstractC0686u abstractC0686uMo1358i = ((InterfaceC0618f) objI).mo1358i();
                    if (abstractC0686uMo1358i instanceof AbstractC0747x) {
                        return (AbstractC0747x) abstractC0686uMo1358i;
                    }
                }
                throw new IllegalArgumentException("unknown object in getInstance: " + objI.getClass().getName());
            }
            objI = ((InterfaceC0749y) objI).mo1358i();
        }
        return (AbstractC0747x) objI;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1743a(InterfaceC0618f interfaceC0618f) {
        try {
            return interfaceC0618f.mo1358i().m1577a("DER");
        } catch (IOException e) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f m1746a(int i) {
        return (InterfaceC0618f) this.f3013a.elementAt(i);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Enumeration m1747b() {
        return this.f3013a.elements();
    }

    /* JADX INFO: renamed from: c */
    public final int m1748c() {
        return this.f3013a.size();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        if (this.f3014b) {
            C0587bk c0587bk = new C0587bk();
            ((AbstractC0747x) c0587bk).f3013a = this.f3013a;
            return c0587bk;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f3013a.size(); i++) {
            vector.addElement(this.f3013a.elementAt(i));
        }
        C0587bk c0587bk2 = new C0587bk();
        ((AbstractC0747x) c0587bk2).f3013a = vector;
        c0587bk2.m1745f();
        return c0587bk2;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    final AbstractC0686u mo1401h() {
        C0600bx c0600bx = new C0600bx();
        ((AbstractC0747x) c0600bx).f3013a = this.f3013a;
        return c0600bx;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC0618f> iterator() {
        return new C1535a.a(m1744d());
    }

    public String toString() {
        return this.f3013a.toString();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0747x m1742a(AbstractC0539ab abstractC0539ab) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        if (abstractC0539ab.f1998c) {
            return abstractC0539ab instanceof C0553ap ? new C0551an(abstractC0686uM1402j) : new C0600bx(abstractC0686uM1402j);
        }
        if (abstractC0686uM1402j instanceof AbstractC0747x) {
            return (AbstractC0747x) abstractC0686uM1402j;
        }
        if (!(abstractC0686uM1402j instanceof AbstractC0723v)) {
            throw new IllegalArgumentException("unknown object in getInstance: " + abstractC0539ab.getClass().getName());
        }
        AbstractC0723v abstractC0723v = (AbstractC0723v) abstractC0686uM1402j;
        return abstractC0539ab instanceof C0553ap ? new C0551an(abstractC0723v.m1710b()) : new C0600bx(abstractC0723v.m1710b());
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC0618f[] m1744d() {
        InterfaceC0618f[] interfaceC0618fArr = new InterfaceC0618f[this.f3013a.size()];
        for (int i = 0; i != this.f3013a.size(); i++) {
            interfaceC0618fArr[i] = m1746a(i);
        }
        return interfaceC0618fArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        Enumeration enumerationElements = this.f3013a.elements();
        int size = this.f3013a.size();
        while (enumerationElements.hasMoreElements()) {
            size = (size * 17) ^ m1740a(enumerationElements).hashCode();
        }
        return size;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0747x)) {
            return false;
        }
        AbstractC0747x abstractC0747x = (AbstractC0747x) abstractC0686u;
        if (this.f3013a.size() != abstractC0747x.f3013a.size()) {
            return false;
        }
        Enumeration enumerationElements = this.f3013a.elements();
        Enumeration enumerationElements2 = abstractC0747x.f3013a.elements();
        while (enumerationElements.hasMoreElements()) {
            InterfaceC0618f interfaceC0618fM1740a = m1740a(enumerationElements);
            InterfaceC0618f interfaceC0618fM1740a2 = m1740a(enumerationElements2);
            AbstractC0686u abstractC0686uMo1358i = interfaceC0618fM1740a.mo1358i();
            AbstractC0686u abstractC0686uMo1358i2 = interfaceC0618fM1740a2.mo1358i();
            if (abstractC0686uMo1358i != abstractC0686uMo1358i2 && !abstractC0686uMo1358i.equals(abstractC0686uMo1358i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m1745f() {
        boolean z;
        if (this.f3014b) {
            return;
        }
        this.f3014b = true;
        if (this.f3013a.size() > 1) {
            int size = this.f3013a.size() - 1;
            boolean z2 = true;
            while (z2) {
                byte[] bArrM1743a = m1743a((InterfaceC0618f) this.f3013a.elementAt(0));
                int i = 0;
                int i2 = 0;
                z2 = false;
                while (i2 != size) {
                    byte[] bArrM1743a2 = m1743a((InterfaceC0618f) this.f3013a.elementAt(i2 + 1));
                    int iMin = Math.min(bArrM1743a.length, bArrM1743a2.length);
                    int i3 = 0;
                    while (true) {
                        if (i3 == iMin) {
                            z = iMin == bArrM1743a.length;
                        } else if (bArrM1743a[i3] != bArrM1743a2[i3]) {
                            z = (bArrM1743a[i3] & 255) < (bArrM1743a2[i3] & 255);
                        } else {
                            i3++;
                        }
                    }
                    if (!z) {
                        Object objElementAt = this.f3013a.elementAt(i2);
                        this.f3013a.setElementAt(this.f3013a.elementAt(i2 + 1), i2);
                        this.f3013a.setElementAt(objElementAt, i2 + 1);
                        bArrM1743a2 = bArrM1743a;
                        i = i2;
                        z2 = true;
                    }
                    i2++;
                    bArrM1743a = bArrM1743a2;
                }
                size = i;
            }
        }
    }
}
