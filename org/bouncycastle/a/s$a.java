package org.bouncycastle.a;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class s$a extends s {
    final /* synthetic */ s a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s$a(s sVar, OutputStream outputStream) {
        super(outputStream);
        this.a = sVar;
        this.b = true;
    }

    @Override // org.bouncycastle.a.s
    public final void b(int i) {
        if (this.b) {
            this.b = false;
        } else {
            super.b(i);
        }
    }
}
