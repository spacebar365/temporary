package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12BagAttributeCarrierImpl implements InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private Hashtable f5920a;

    /* JADX INFO: renamed from: b */
    private Vector f5921b;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    private PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.f5920a = hashtable;
        this.f5921b = vector;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return (InterfaceC0618f) this.f5920a.get(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        if (this.f5920a.containsKey(c0653p)) {
            this.f5920a.put(c0653p, interfaceC0618f);
        } else {
            this.f5920a.put(c0653p, interfaceC0618f);
            this.f5921b.addElement(c0653p);
        }
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5921b.elements();
    }
}
