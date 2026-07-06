package a.d.f;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static String a(CharSequence charSequence, CharSequence... charSequenceArr) {
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
