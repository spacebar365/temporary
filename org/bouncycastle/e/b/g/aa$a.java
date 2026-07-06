package org.bouncycastle.e.b.g;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class aa$a extends ObjectInputStream {
    private static final Set a;
    private final Class b;
    private boolean c;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("java.util.TreeMap");
        a.add("java.lang.Integer");
        a.add("java.lang.Number");
        a.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        a.add("java.util.ArrayList");
        a.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        a.add("[B");
        a.add("java.util.LinkedList");
        a.add("java.util.Stack");
        a.add("java.util.Vector");
        a.add("[Ljava.lang.Object;");
        a.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    aa$a(Class cls, InputStream inputStream) {
        super(inputStream);
        this.c = false;
        this.b = cls;
    }

    @Override // java.io.ObjectInputStream
    protected final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        if (this.c) {
            if (!a.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!objectStreamClass.getName().equals(this.b.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.c = true;
        }
        return super.resolveClass(objectStreamClass);
    }
}
