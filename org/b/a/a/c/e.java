package org.b.a.a.c;

/* JADX INFO: compiled from: Status.java */
/* JADX INFO: loaded from: classes.dex */
public enum e implements b {
    a(101, "Switching Protocols"),
    b(200, "OK"),
    c(201, "Created"),
    d(202, "Accepted"),
    e(204, "No Content"),
    f(206, "Partial Content"),
    g(207, "Multi-Status"),
    h(301, "Moved Permanently"),
    i(302, "Found"),
    j(303, "See Other"),
    k(304, "Not Modified"),
    l(307, "Temporary Redirect"),
    m(400, "Bad Request"),
    n(401, "Unauthorized"),
    o(403, "Forbidden"),
    p(404, "Not Found"),
    q(405, "Method Not Allowed"),
    r(406, "Not Acceptable"),
    s(408, "Request Timeout"),
    t(409, "Conflict"),
    u(410, "Gone"),
    v(411, "Length Required"),
    w(412, "Precondition Failed"),
    x(413, "Payload Too Large"),
    y(415, "Unsupported Media Type"),
    z(416, "Requested Range Not Satisfiable"),
    A(417, "Expectation Failed"),
    B(429, "Too Many Requests"),
    C(500, "Internal Server Error"),
    D(501, "Not Implemented"),
    E(503, "Service Unavailable"),
    F(505, "HTTP Version Not Supported");

    private final int G;
    private final String H;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] eVarArrValuesCustom = values();
        int length = eVarArrValuesCustom.length;
        e[] eVarArr = new e[length];
        System.arraycopy(eVarArrValuesCustom, 0, eVarArr, 0, length);
        return eVarArr;
    }

    e(int i2, String str) {
        this.G = i2;
        this.H = str;
    }

    @Override // org.b.a.a.c.b
    public final String a() {
        return this.G + " " + this.H;
    }
}
