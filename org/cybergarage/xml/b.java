package org.cybergarage.xml;

import java.util.Vector;

/* JADX INFO: compiled from: AttributeList.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Vector {
    public final a a(int i) {
        return (a) get(i);
    }

    public final a a(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            a aVarA = a(i);
            if (str.compareTo(aVarA.a()) == 0) {
                return aVarA;
            }
        }
        return null;
    }
}
