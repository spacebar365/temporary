package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.a.f;
import org.bouncycastle.a.p;
import org.bouncycastle.c.a.n;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12BagAttributeCarrierImpl implements n {
    private Hashtable a;
    private Vector b;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    private PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.a = hashtable;
        this.b = vector;
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(p pVar) {
        return (f) this.a.get(pVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(p pVar, f fVar) {
        if (this.a.containsKey(pVar)) {
            this.a.put(pVar, fVar);
        } else {
            this.a.put(pVar, fVar);
            this.b.addElement(pVar);
        }
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.b.elements();
    }
}
