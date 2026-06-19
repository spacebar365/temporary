package com.p033al.dlnaserver;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.p033al.dlnaserver.customs.C0380c;
import com.p033al.dlnaserver.p035b.C0335b;
import com.p033al.dlnaserver.p035b.C0347bl;
import com.p033al.dlnaserver.p035b.C0350d;
import com.p033al.dlnaserver.p035b.C0358l;
import com.p033al.dlnaserver.p035b.C0359m;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.p035b.C0362p;
import com.p033al.dlnaserver.servers.DlnaMediaServer;
import java.util.ArrayList;
import java.util.Arrays;
import org.cybergarage.p155b.C1637a;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private Menu f1288a;

    /* JADX INFO: renamed from: b */
    private TextView f1289b;

    /* JADX INFO: renamed from: c */
    private ListView f1290c;

    /* JADX INFO: renamed from: d */
    private ArrayAdapter<String> f1291d;

    /* JADX INFO: renamed from: e */
    private ArrayList<String> f1292e;

    /* JADX INFO: renamed from: f */
    private BroadcastReceiver f1293f;

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        App.f1273e = true;
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C0347bl.m1015a(this)) {
            finish();
            Intent intent = new Intent(this, (Class<?>) MainActivityTV.class);
            intent.setFlags(268435456);
            intent.setFlags(67108864);
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        C0350d.m1030a(this);
        setContentView(C0303R.layout.activity_main);
        this.f1289b = (TextView) findViewById(C0303R.id.info);
        this.f1292e = C0360n.m1052c(this, "pathsList");
        m976d();
        m979g();
        this.f1290c = (ListView) findViewById(C0303R.id.listPaths);
        this.f1291d = new C0380c(this, this.f1292e, false);
        this.f1290c.setAdapter((ListAdapter) this.f1291d);
        if (bundle == null && !this.f1292e.isEmpty() && (Build.VERSION.SDK_INT < 23 || C0359m.m1045a(this, 1, true))) {
            if (C0358l.m1040a(this)) {
                if (!App.f1269a) {
                    Intent intent2 = new Intent(this, (Class<?>) DlnaMediaServer.class);
                    intent2.putStringArrayListExtra("pathsList", this.f1292e);
                    startService(intent2);
                    m973b(true);
                }
            } else {
                Toast.makeText(this, C0303R.string.no_conn, 0).show();
            }
        }
        if (App.f1269a) {
            m975c();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".UIupdate");
        this.f1293f = new C0304a(this);
        registerReceiver(this.f1293f, intentFilter);
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
        if (C0360n.m1050a(this, "do_not_show_batt_warning") || powerManager.isIgnoringBatteryOptimizations(getPackageName()) || batteryManager.getIntProperty(4) == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(C0303R.string.title_batt_settings);
        builder.setMessage(C0303R.string.msg_batt_settings);
        builder.setNegativeButton(getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0373c(this));
        builder.setNeutralButton(getString(C0303R.string.neutral_button_doze), new DialogInterfaceOnClickListenerC0390d(this));
        builder.setPositiveButton(getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0391e(this));
        builder.create().show();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0303R.menu.menu, menu);
        this.f1288a = menu;
        m967a();
        m975c();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0303R.id.action_run) {
            if (App.f1269a) {
                if (!App.f1269a) {
                    App.f1269a = false;
                    return true;
                }
                stopService(new Intent(this, (Class<?>) DlnaMediaServer.class));
                m969a(true);
                m971b();
                m973b(false);
                return true;
            }
            if (Build.VERSION.SDK_INT >= 23 && !C0359m.m1045a(this, 1, true)) {
                return true;
            }
            m977e();
            return true;
        }
        if (itemId == C0303R.id.action_add) {
            this.f1292e.add("");
            m976d();
            this.f1291d.notifyDataSetChanged();
            this.f1290c.post(new RunnableC0307b(this));
            C0360n.m1048a(this, "pathsList", this.f1292e);
            return true;
        }
        if (itemId == C0303R.id.action_settings) {
            new C0362p().m1068a(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 0;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 12345) {
                String stringExtra = intent.getStringExtra("RESULT_PATH");
                String[] stringArrayExtra = intent.getStringArrayExtra("RESULT_PATHS_LIST");
                int iMin = Math.min(intent.getIntExtra("LIST_ITEM", -1), this.f1292e.size() - 1);
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    int i4 = 1;
                    while (i3 < length) {
                        String str = stringArrayExtra[i3];
                        if (i4 == 1 && iMin >= 0) {
                            this.f1292e.set(iMin, str);
                        } else {
                            this.f1292e.add(str);
                        }
                        i4++;
                        i3++;
                    }
                } else if (iMin >= 0) {
                    this.f1292e.set(iMin, stringExtra);
                }
                this.f1291d.notifyDataSetChanged();
                C0360n.m1048a(this, "pathsList", this.f1292e);
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
                            strM1010a = m970b(uri, intent);
                        }
                        int iMin2 = Math.min(App.f1285q, this.f1292e.size() - 1);
                        if (i5 == 0 && iMin2 >= 0) {
                            this.f1292e.set(iMin2, strM1010a);
                        } else {
                            this.f1292e.add(strM1010a);
                        }
                        i3 = i5 + 1;
                    }
                } else if (data != null) {
                    String strM1010a2 = C0335b.m1010a(this, data);
                    if (strM1010a2 == null) {
                        strM1010a2 = m970b(data, intent);
                    }
                    int iMin3 = Math.min(App.f1285q, this.f1292e.size() - 1);
                    if (iMin3 >= 0) {
                        this.f1292e.set(iMin3, strM1010a2);
                    }
                } else {
                    return;
                }
                this.f1291d.notifyDataSetChanged();
                C0360n.m1048a(this, "pathsList", this.f1292e);
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    m977e();
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
        unregisterReceiver(this.f1293f);
        App.f1273e = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("info", this.f1289b.getText().toString());
        bundle.putStringArray("pathsList", (String[]) this.f1292e.toArray(new String[0]));
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f1289b.setText(bundle.getString("info"));
        String[] stringArray = bundle.getStringArray("pathsList");
        if (stringArray != null && stringArray.length > 0) {
            if (this.f1292e == null || this.f1292e.isEmpty()) {
                this.f1292e = new ArrayList<>(Arrays.asList(stringArray));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m969a(boolean z) {
        if (this.f1288a != null) {
            MenuItem menuItemFindItem = this.f1288a.findItem(C0303R.id.action_run);
            if (z) {
                menuItemFindItem.setIcon(C0303R.drawable.ic_play_normal);
            } else {
                menuItemFindItem.setIcon(C0303R.drawable.ic_pause_normal);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m967a() {
        if (this.f1288a != null) {
            MenuItem menuItemFindItem = this.f1288a.findItem(C0303R.id.action_run);
            if (!App.f1269a) {
                menuItemFindItem.setIcon(C0303R.drawable.ic_play_normal);
            } else {
                menuItemFindItem.setIcon(C0303R.drawable.ic_pause_normal);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m971b() {
        this.f1289b.setText(getString(C0303R.string.info_msg_stopped));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m975c() {
        if (App.f1270b) {
            this.f1289b.setText(getString(C0303R.string.info_msg_starting));
            return;
        }
        if (App.f1269a) {
            String strM4702a = C1637a.m4702a();
            String str = "[" + C1637a.m4707b() + "]";
            this.f1289b.setText(String.valueOf(getString(C0303R.string.info_msg)) + " " + strM4702a + ":" + App.f1280l + " " + str + " " + (" (" + App.f1281m + (App.f1272d ? "… " : " ") + getString(C0303R.string.info_msg_objects) + ")") + (App.f1271c ? "\n" + getString(C0303R.string.some_errors) : ""));
            return;
        }
        m971b();
    }

    /* JADX INFO: renamed from: d */
    private void m976d() {
        TextView textView = (TextView) findViewById(C0303R.id.list_empty_warning);
        if (this.f1292e.isEmpty()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m977e() {
        if (C0358l.m1040a(this)) {
            if (!App.f1269a) {
                this.f1289b.setText(getString(C0303R.string.info_msg_starting));
                Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
                intent.putStringArrayListExtra("pathsList", this.f1292e);
                startService(intent);
                m973b(true);
            }
            m969a(false);
            return;
        }
        Toast.makeText(this, C0303R.string.no_conn, 0).show();
    }

    /* JADX INFO: renamed from: f */
    private void m978f() {
        Intent intent = new Intent(this, (Class<?>) DlnaMediaServer.class);
        stopService(intent);
        try {
            Thread.sleep(200L);
        } catch (Exception e) {
        }
        intent.putStringArrayListExtra("pathsList", this.f1292e);
        startService(intent);
    }

    /* JADX INFO: renamed from: a */
    private String m966a(Uri uri, Intent intent) {
        String strM1010a = "";
        if (uri != null && (strM1010a = C0335b.m1010a(this, uri)) == null) {
            strM1010a = uri.toString();
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        }
        return strM1010a;
    }

    /* JADX INFO: renamed from: g */
    private void m979g() {
        String action;
        ArrayList parcelableArrayListExtra;
        Intent intent = getIntent();
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.intent.action.SEND")) {
                String strM966a = m966a((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), intent);
                if (!strM966a.contains("content://")) {
                    strM966a = "*".concat(String.valueOf(strM966a));
                }
                if (!strM966a.equals("*") && !this.f1292e.contains(strM966a)) {
                    this.f1292e.add(strM966a);
                    C0360n.m1048a(this, "pathsList", this.f1292e);
                    if (App.f1269a) {
                        m978f();
                        return;
                    }
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.SEND_MULTIPLE") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null) {
                boolean z = false;
                for (int i = 0; i < parcelableArrayListExtra.size(); i++) {
                    String strM966a2 = m966a((Uri) parcelableArrayListExtra.get(i), intent);
                    if (!strM966a2.contains("content://")) {
                        strM966a2 = "*".concat(String.valueOf(strM966a2));
                    }
                    if (!strM966a2.equals("*") && !this.f1292e.contains(strM966a2)) {
                        this.f1292e.add(strM966a2);
                        z = true;
                    }
                }
                if (z) {
                    C0360n.m1048a(this, "pathsList", this.f1292e);
                    if (App.f1269a) {
                        m978f();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m970b(Uri uri, Intent intent) {
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

    @SuppressLint({"Wakelock"})
    /* JADX INFO: renamed from: b */
    private void m973b(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }
}
