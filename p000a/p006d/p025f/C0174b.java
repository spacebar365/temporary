package p000a.p006d.p025f;

/* JADX INFO: renamed from: a.d.f.b */
/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0174b {
    /* JADX INFO: renamed from: a */
    public static String m518a(CharSequence charSequence, CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence2 : charSequenceArr) {
            if (sb.length() > 0) {
                sb.append(charSequence);
            }
            sb.append(charSequence2);
        }
        return sb.toString();
    }
}
