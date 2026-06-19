package com.p033al.dlnaserver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.p033al.dlnaserver.customs.C0380c;
import com.p033al.dlnaserver.p035b.C0335b;
import com.p033al.dlnaserver.p035b.C0350d;
import com.p033al.dlnaserver.p035b.C0358l;
import com.p033al.dlnaserver.p035b.C0359m;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Arrays;
import org.cybergarage.p155b.C1637a;

/* JADX INFO: loaded from: classes.dex */
public class MainActivityTV extends Activity {

    /* JADX INFO: renamed from: a */
    private TextView f1294a;

    /* JADX INFO: renamed from: b */
    private ImageButton f1295b;

    /* JADX INFO: renamed from: c */
    private ListView f1296c;

    /* JADX INFO: renamed from: d */
    private ArrayAdapter<String> f1297d;

    /* JADX INFO: renamed from: e */
    private ArrayList<String> f1298e;

    /* JADX INFO: renamed from: f */
    private BroadcastReceiver f1299f;

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        App.f1273e = false;
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String action;
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        C0350d.m1030a(this);
        setContentView(C0303R.layout.activity_main_tv);
        this.f1294a = (TextView) findViewById(C0303R.id.info);
        this.f1298e = C0360n.m1052c(this, "pathsList");
        m988c();
        Intent intent = getIntent();
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.intent.action.SEND")) {
                String strM980a = m980a((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
                if (!strM980a.contains("content://")) {
                    strM980a = "*".concat(String.valueOf(strM980a));
                }
                if (!this.f1298e.contains(strM980a)) {
                    this.f1298e.add(strM980a);
                    C0360n.m1048a(this, "pathsList", this.f1298e);
                    if (App.f1269a) {
                        m992e();
                    }
                }
            } else if (action.equals("android.intent.action.SEND_MULTIPLE") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null) {
                boolean z = false;
                for (int i = 0; i < parcelableArrayListExtra.size(); i++) {
                    String strM980a2 = m980a((Uri) parcelableArrayListExtra.get(i));
                    if (!strM980a2.contains("content://")) {
                        strM980a2 = "*".concat(String.valueOf(strM980a2));
                    }
                    if (!this.f1298e.contains(strM980a2)) {
                        this.f1298e.add(strM980a2);
                        z = true;
                    }
                }
                if (z) {
                    C0360n.m1048a(this, "pathsList", this.f1298e);
                    if (App.f1269a) {
                        m992e();
                    }
                }
            }
        }
        this.f1296c = (ListView) findViewById(C0303R.id.listPaths);
        this.f1297d = new C0380c(this, this.f1298e, true);
        this.f1296c.setAdapter((ListAdapter) this.f1297d);
        this.f1296c.setItemsCanFocus(true);
        this.f1295b = (ImageButton) findViewById(C0303R.id.btton_tv_run);
        this.f1295b.setOnClickListener(new ViewOnClickListenerC0392f(this));
        ((ImageButton) findViewById(C0303R.id.btton_tv_add)).setOnClickListener(new ViewOnClickListenerC0393g(this, this));
        ((ImageButton) findViewById(C0303R.id.btton_tv_settings)).setOnClickListener(new ViewOnClickListenerC0395i(this, this));
        if (bundle == null && !this.f1298e.isEmpty() && (Build.VERSION.SDK_INT < 23 || C0359m.m1045a(this, 1, true))) {
            if (C0358l.m1040a(this)) {
                if (!App.f1269a) {
                    Intent intent2 = new Intent(this, (Class<?>) DlnaMediaServer.class);
                    intent2.putStringArrayListExtra("pathsList", this.f1298e);
                    startService(intent2);
                }
            } else {
                Toast.makeText(this, C0303R.string.no_conn, 0).show();
            }
        }
        if (App.f1269a) {
            m985b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        this.f1299f = new C0396j(this);
        registerReceiver(this.f1299f, intentFilter);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 0;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 12345) {
                String stringExtra = intent.getStringExtra("RESULT_PATH");
                String[] stringArrayExtra = intent.getStringArrayExtra("RESULT_PATHS_LIST");
                int iMin = Math.min(intent.getIntExtra("LIST_ITEM", -1), this.f1298e.size() - 1);
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    int i4 = 1;
                    while (i3 < length) {
                        String str = stringArrayExtra[i3];
                        if (i4 == 1 && iMin >= 0) {
                            this.f1298e.set(iMin, str);
                        } else {
                            this.f1298e.add(str);
                        }
                        i4++;
                        i3++;
                    }
                } else if (iMin >= 0) {
                    this.f1298e.set(iMin, stringExtra);
                }
                this.f1297d.notifyDataSetChanged();
                C0360n.m1048a(this, "pathsList", this.f1298e);
                return;
            }
            if (i == 12346) {
                ClipData clipData = Build.VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
                Uri data = intent.getData();
                if (clipData != null) {
                    while (true) {
                        int i5 = i3;
                        if (i5 >= clipData.getItemCount()) {
                            break;
                        }
                        Uri uri = clipData.getItemAt(i5).getUri();
                        String strM1010a = C0335b.m1010a(this, uri);
                        if (strM1010a == null) {
                            strM1010a = m981a(uri, intent);
                        }
                        int iMin2 = Math.min(App.f1285q, this.f1298e.size() - 1);
                        if (i5 == 0 && iMin2 >= 0) {
                            this.f1298e.set(iMin2, strM1010a);
                        } else {
                            this.f1298e.add(strM1010a);
                        }
                        i3 = i5 + 1;
                    }
                } else if (data != null) {
                    String strM1010a2 = C0335b.m1010a(this, data);
                    if (strM1010a2 == null) {
                        strM1010a2 = m981a(data, intent);
                    }
                    int iMin3 = Math.min(App.f1285q, this.f1298e.size() - 1);
                    if (iMin3 >= 0) {
                        this.f1298e.set(iMin3, strM1010a2);
                    }
                } else {
                    return;
                }
                this.f1297d.notifyDataSetChanged();
                C0360n.m1048a(this, "pathsList", this.f1298e);
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    m989d();
                } else {
                    Toast.makeText(this, C0303R.string.permission_access_denined, 0).show();
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        App.f1273e = true;
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        App.f1273e = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        unregisterReceiver(this.f1299f);
        App.f1273e = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("info", this.f1294a.getText().toString());
        bundle.putStringArray("pathsList", (String[]) this.f1298e.toArray(new String[0]));
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f1294a.setText(bundle.getString("info"));
        String[] stringArray = bundle.getStringArray("pathsList");
        if (stringArray != null && stringArray.length > 0) {
            if (this.f1298e == null || this.f1298e.isEmpty()) {
                this.f1298e = new ArrayList<>(Arrays.asList(stringArray));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m984a(boolean z) {
        if (this.f1295b != null) {
            if (z) {
                this.f1295b.setImageResource(C0303R.drawable.ic_play);
            } else {
                this.f1295b.setImageResource(C0303R.drawable.ic_pause);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m982a() {
        this.f1294a.setText(getString(C0303R.string.info_msg_stopped));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m985b() {
        if (App.f1270b) {
            this.f1294a.setText(getString(C0303R.string.info_msg_starting));
            return;
        }
        if (App.f1269a) {
            String strM4702a = C1637a.m4702a();
            String str = "[" + C1637a.m4707b() + "]";
            this.f1294a.setText(String.valueOf(getString(C0303R.string.info_msg)) + " " + strM4702a + ":" + App.f1280l + " " + str + " " + (" (" + App.f1281m + (App.f1272d ? "… " : " ") + getString(C0303R.string.info_msg_objects) + ")") + (App.f1271c ? "\n" + getString(C0303R.string.some_errors) : ""));
            return;
        }
        m982a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m988c() {
        TextView textView = (TextView) findViewById(C0303R.id.list_empty_warning);
        if (this.f1298e.isEmpty()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m989d() {
        if (C0358l.m1040a(this)) {
            if (!App.f1269a) {
                this.f1294a.setText(getString(C0303R.string.info_msg_starting));
                Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
                intent.putStringArrayListExtra("pathsList", this.f1298e);
                startService(intent);
            }
            m984a(false);
            return;
        }
        Toast.makeText(this, C0303R.string.no_conn, 0).show();
    }

    /* JADX INFO: renamed from: e */
    private void m992e() {
        Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
        stopService(intent);
        try {
            Thread.sleep(200L);
        } catch (Exception e) {
        }
        intent.putStringArrayListExtra("pathsList", this.f1298e);
        startService(intent);
    }

    /* JADX INFO: renamed from: a */
    private String m980a(Uri uri) {
        if (uri != null) {
            String strM1010a = C0335b.m1010a(this, uri);
            if (strM1010a == null) {
                Toast.makeText(this, uri + ": " + getString(C0303R.string.info_no_local_path), 1).show();
            } else {
                return strM1010a;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    private String m981a(Uri uri, Intent intent) {
        String string = uri.toString();
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                Toast.makeText(this, C0303R.string.some_errors_content, 1).show();
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m983a(MainActivityTV mainActivityTV) {
        if (Build.VERSION.SDK_INT >= 23 && !C0359m.m1045a(mainActivityTV, 1, true)) {
            return;
        }
        mainActivityTV.m989d();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m986b(MainActivityTV mainActivityTV) {
        mainActivityTV.stopService(new Intent(mainActivityTV, (Class<?>) DlnaMediaServer.class));
        mainActivityTV.m984a(true);
        mainActivityTV.m982a();
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m994g(MainActivityTV mainActivityTV) {
        if (mainActivityTV.f1295b != null) {
            if (!App.f1269a) {
                mainActivityTV.f1295b.setImageResource(C0303R.drawable.ic_play);
            } else {
                mainActivityTV.f1295b.setImageResource(C0303R.drawable.ic_pause);
            }
        }
    }
}
