package com.al.dlnaserver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.al.dlnaserver.b.l;
import com.al.dlnaserver.b.m;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class MainActivityTV extends Activity {
    private TextView a;
    private ImageButton b;
    private ListView c;
    private ArrayAdapter<String> d;
    private ArrayList<String> e;
    private BroadcastReceiver f;

    static /* synthetic */ ListView f(MainActivityTV mainActivityTV) {
        return mainActivityTV.c;
    }

    static /* synthetic */ ArrayAdapter e(MainActivityTV mainActivityTV) {
        return mainActivityTV.d;
    }

    static /* synthetic */ ArrayList c(MainActivityTV mainActivityTV) {
        return mainActivityTV.e;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        App.e = false;
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        String action;
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        com.al.dlnaserver.b.d.a(this);
        setContentView(R$layout.activity_main_tv);
        this.a = (TextView) findViewById(R$id.info);
        this.e = n.c(this, "pathsList");
        c();
        Intent intent = getIntent();
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.intent.action.SEND")) {
                String strA = a((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
                if (!strA.contains("content://")) {
                    strA = "*".concat(String.valueOf(strA));
                }
                if (!this.e.contains(strA)) {
                    this.e.add(strA);
                    n.a(this, "pathsList", this.e);
                    if (App.a) {
                        e();
                    }
                }
            } else if (action.equals("android.intent.action.SEND_MULTIPLE") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null) {
                boolean z = false;
                for (int i = 0; i < parcelableArrayListExtra.size(); i++) {
                    String strA2 = a((Uri) parcelableArrayListExtra.get(i));
                    if (!strA2.contains("content://")) {
                        strA2 = "*".concat(String.valueOf(strA2));
                    }
                    if (!this.e.contains(strA2)) {
                        this.e.add(strA2);
                        z = true;
                    }
                }
                if (z) {
                    n.a(this, "pathsList", this.e);
                    if (App.a) {
                        e();
                    }
                }
            }
        }
        this.c = (ListView) findViewById(R$id.listPaths);
        this.d = new com.al.dlnaserver.customs.c(this, this.e, true);
        this.c.setAdapter((ListAdapter) this.d);
        this.c.setItemsCanFocus(true);
        this.b = (ImageButton) findViewById(R$id.btton_tv_run);
        this.b.setOnClickListener(new f(this));
        ((ImageButton) findViewById(R$id.btton_tv_add)).setOnClickListener(new g(this, this));
        ((ImageButton) findViewById(R$id.btton_tv_settings)).setOnClickListener(new i(this, this));
        if (bundle == null && !this.e.isEmpty() && (Build$VERSION.SDK_INT < 23 || m.a(this, 1, true))) {
            if (l.a(this)) {
                if (!App.a) {
                    Intent intent2 = new Intent(this, (Class<?>) DlnaMediaServer.class);
                    intent2.putStringArrayListExtra("pathsList", this.e);
                    startService(intent2);
                }
            } else {
                Toast.makeText(this, R$string.no_conn, 0).show();
            }
        }
        if (App.a) {
            b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        this.f = new j(this);
        registerReceiver(this.f, intentFilter);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        int i3 = 0;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 12345) {
                String stringExtra = intent.getStringExtra("RESULT_PATH");
                String[] stringArrayExtra = intent.getStringArrayExtra("RESULT_PATHS_LIST");
                int iMin = Math.min(intent.getIntExtra("LIST_ITEM", -1), this.e.size() - 1);
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    int i4 = 1;
                    while (i3 < length) {
                        String str = stringArrayExtra[i3];
                        if (i4 == 1 && iMin >= 0) {
                            this.e.set(iMin, str);
                        } else {
                            this.e.add(str);
                        }
                        i4++;
                        i3++;
                    }
                } else if (iMin >= 0) {
                    this.e.set(iMin, stringExtra);
                }
                this.d.notifyDataSetChanged();
                n.a(this, "pathsList", this.e);
                return;
            }
            if (i == 12346) {
                ClipData clipData = Build$VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
                Uri data = intent.getData();
                if (clipData != null) {
                    while (true) {
                        int i5 = i3;
                        if (i5 >= clipData.getItemCount()) {
                            break;
                        }
                        Uri uri = clipData.getItemAt(i5).getUri();
                        String strA = com.al.dlnaserver.b.b.a(this, uri);
                        if (strA == null) {
                            strA = a(uri, intent);
                        }
                        int iMin2 = Math.min(App.q, this.e.size() - 1);
                        if (i5 == 0 && iMin2 >= 0) {
                            this.e.set(iMin2, strA);
                        } else {
                            this.e.add(strA);
                        }
                        i3 = i5 + 1;
                    }
                } else if (data != null) {
                    String strA2 = com.al.dlnaserver.b.b.a(this, data);
                    if (strA2 == null) {
                        strA2 = a(data, intent);
                    }
                    int iMin3 = Math.min(App.q, this.e.size() - 1);
                    if (iMin3 >= 0) {
                        this.e.set(iMin3, strA2);
                    }
                } else {
                    return;
                }
                this.d.notifyDataSetChanged();
                n.a(this, "pathsList", this.e);
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    d();
                } else {
                    Toast.makeText(this, R$string.permission_access_denined, 0).show();
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        App.e = true;
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        App.e = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        unregisterReceiver(this.f);
        App.e = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("info", this.a.getText().toString());
        bundle.putStringArray("pathsList", (String[]) this.e.toArray(new String[0]));
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a.setText(bundle.getString("info"));
        String[] stringArray = bundle.getStringArray("pathsList");
        if (stringArray != null && stringArray.length > 0) {
            if (this.e == null || this.e.isEmpty()) {
                this.e = new ArrayList<>(Arrays.asList(stringArray));
            }
        }
    }

    private void a(boolean z) {
        if (this.b != null) {
            if (z) {
                this.b.setImageResource(R$drawable.ic_play);
            } else {
                this.b.setImageResource(R$drawable.ic_pause);
            }
        }
    }

    private void a() {
        this.a.setText(getString(R$string.info_msg_stopped));
    }

    static /* synthetic */ void h(MainActivityTV mainActivityTV) {
        mainActivityTV.b();
    }

    private void b() {
        if (App.b) {
            this.a.setText(getString(R$string.info_msg_starting));
            return;
        }
        if (App.a) {
            String strA = org.cybergarage.b.a.a();
            String str = "[" + org.cybergarage.b.a.b() + "]";
            this.a.setText(String.valueOf(getString(R$string.info_msg)) + " " + strA + ":" + App.l + " " + str + " " + (" (" + App.m + (App.d ? "… " : " ") + getString(R$string.info_msg_objects) + ")") + (App.c ? "\n" + getString(R$string.some_errors) : ""));
            return;
        }
        a();
    }

    static /* synthetic */ void d(MainActivityTV mainActivityTV) {
        mainActivityTV.c();
    }

    private void c() {
        TextView textView = (TextView) findViewById(R$id.list_empty_warning);
        if (this.e.isEmpty()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    private void d() {
        if (l.a(this)) {
            if (!App.a) {
                this.a.setText(getString(R$string.info_msg_starting));
                Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
                intent.putStringArrayListExtra("pathsList", this.e);
                startService(intent);
            }
            a(false);
            return;
        }
        Toast.makeText(this, R$string.no_conn, 0).show();
    }

    private void e() {
        Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
        stopService(intent);
        try {
            Thread.sleep(200L);
        } catch (Exception e) {
        }
        intent.putStringArrayListExtra("pathsList", this.e);
        startService(intent);
    }

    private String a(Uri uri) throws Throwable {
        if (uri != null) {
            String strA = com.al.dlnaserver.b.b.a(this, uri);
            if (strA == null) {
                Toast.makeText(this, uri + ": " + getString(R$string.info_no_local_path), 1).show();
            } else {
                return strA;
            }
        }
        return "";
    }

    private String a(Uri uri, Intent intent) {
        String string = uri.toString();
        if (Build$VERSION.SDK_INT >= 19) {
            try {
                getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                Toast.makeText(this, R$string.some_errors_content, 1).show();
            }
        }
        return string;
    }

    static /* synthetic */ void a(MainActivityTV mainActivityTV) {
        if (Build$VERSION.SDK_INT >= 23 && !m.a(mainActivityTV, 1, true)) {
            return;
        }
        mainActivityTV.d();
    }

    static /* synthetic */ void b(MainActivityTV mainActivityTV) {
        mainActivityTV.stopService(new Intent(mainActivityTV, (Class<?>) DlnaMediaServer.class));
        mainActivityTV.a(true);
        mainActivityTV.a();
    }

    static /* synthetic */ void g(MainActivityTV mainActivityTV) {
        if (mainActivityTV.b != null) {
            if (!App.a) {
                mainActivityTV.b.setImageResource(R$drawable.ic_play);
            } else {
                mainActivityTV.b.setImageResource(R$drawable.ic_pause);
            }
        }
    }
}
