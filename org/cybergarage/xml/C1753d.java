package org.cybergarage.xml;

import java.util.Vector;

/* JADX INFO: renamed from: org.cybergarage.xml.d */
/* JADX INFO: compiled from: NodeList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1753d extends Vector {
    /* JADX INFO: renamed from: a */
    public final C1752c m5167a(int i) {
        if (i >= size()) {
            return null;
        }
        return (C1752c) get(i);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1752c m5168a(String str) {
        C1752c c1752c = null;
        synchronized (this) {
            if (str != null) {
                int size = size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C1752c c1752cM5167a = m5167a(i);
                    if (str.compareTo(c1752cM5167a.m5153h()) == 0) {
                        c1752c = c1752cM5167a;
                        break;
                    }
                    i++;
                }
            }
        }
        return c1752c;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C1752c m5169b(String str) {
        C1752c c1752c = null;
        synchronized (this) {
            if (str != null) {
                int size = size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C1752c c1752cM5167a = m5167a(i);
                    String strM5153h = c1752cM5167a.m5153h();
                    if (strM5153h != null && strM5153h.endsWith(str)) {
                        c1752c = c1752cM5167a;
                        break;
                    }
                    i++;
                }
            }
        }
        return c1752c;
    }
}
