package org.cybergarage.xml;

import java.util.Vector;

/* JADX INFO: compiled from: NodeList.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Vector {
    public final c a(int i) {
        if (i >= size()) {
            return null;
        }
        return (c) get(i);
    }

    public final synchronized c a(String str) {
        c cVar = null;
        synchronized (this) {
            if (str != null) {
                int size = size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    c cVarA = a(i);
                    if (str.compareTo(cVarA.h()) == 0) {
                        cVar = cVarA;
                        break;
                    }
                    i++;
                }
            }
        }
        return cVar;
    }

    public final synchronized c b(String str) {
        c cVar = null;
        synchronized (this) {
            if (str != null) {
                int size = size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    c cVarA = a(i);
                    String strH = cVarA.h();
                    if (strH != null && strH.endsWith(str)) {
                        cVar = cVarA;
                        break;
                    }
                    i++;
                }
            }
        }
        return cVar;
    }
}
