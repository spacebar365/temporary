package org.bouncycastle.a.aa;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae {
    private ad a;

    protected abstract ad a();

    public final synchronized ad b() {
        if (this.a == null) {
            this.a = a();
        }
        return this.a;
    }
}
