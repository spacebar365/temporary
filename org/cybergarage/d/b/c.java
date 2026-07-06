package org.cybergarage.d.b;

/* JADX INFO: compiled from: InvalidDescriptionException.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Exception {
    public c() {
    }

    public c(String str) {
        super(str);
    }

    public c(Exception exc) {
        super(exc.getMessage());
    }
}
