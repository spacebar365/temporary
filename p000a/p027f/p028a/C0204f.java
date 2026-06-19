package p000a.p027f.p028a;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: a.f.a.f */
/* JADX INFO: compiled from: AvTargetName.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0204f extends C0201c {

    /* JADX INFO: renamed from: a */
    private static final Charset f924a = StandardCharsets.UTF_16LE;

    public C0204f(byte[] bArr) {
        super(9, bArr);
    }

    public C0204f(String str) {
        this(str.getBytes(f924a));
    }
}
