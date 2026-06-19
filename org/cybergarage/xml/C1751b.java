package org.cybergarage.xml;

import java.util.Vector;

/* JADX INFO: renamed from: org.cybergarage.xml.b */
/* JADX INFO: compiled from: AttributeList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1751b extends Vector {
    /* JADX INFO: renamed from: a */
    public final C1750a m5135a(int i) {
        return (C1750a) get(i);
    }

    /* JADX INFO: renamed from: a */
    public final C1750a m5136a(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            C1750a c1750aM5135a = m5135a(i);
            if (str.compareTo(c1750aM5135a.m5132a()) == 0) {
                return c1750aM5135a;
            }
        }
        return null;
    }
}
