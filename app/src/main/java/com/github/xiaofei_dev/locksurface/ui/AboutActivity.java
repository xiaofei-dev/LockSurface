package com.github.xiaofei_dev.locksurface.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.xiaofei_dev.locksurface.R;
import com.github.xiaofei_dev.locksurface.util.OpenUtil;


public final class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onAbout(View view) {
        switch (view.getId()) {
            case R.id.itemOpenSource:
                String url = getString(R.string.openSourceLink);
                OpenUtil.openLink(view.getContext(), null, url, false);
                finish();
                break;
            case R.id.itemScoreAndFeedback:
                OpenUtil.openApplicationMarket(getPackageName(), "com.coolapk.market",
                        view.getContext());
                finish();
                break;
            case R.id.itemDonate:
                OpenUtil.alipayDonate(this);
                finish();
                break;
            case R.id.close:
                finish();
                break;
            default:
                break;
        }

    }
}
