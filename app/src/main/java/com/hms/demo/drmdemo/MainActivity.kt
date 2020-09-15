package com.hms.demo.drmdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.huawei.android.sdk.drm.Drm
import com.huawei.android.sdk.drm.DrmCheckCallback

class MainActivity : AppCompatActivity(), DrmCheckCallback {
    private val DRM_ID = "Enter the Copyright Protection ID here"

    //Copyright Protection Public Key
    private val DRM_PUBLIC_KEY = "Enter the Copyright Protection Public Key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Drm.check(this, this.getPackageName(), DRM_ID, DRM_PUBLIC_KEY, this);

    }

    override fun onCheckSuccess() {
        TODO("Not yet implemented")
    }

    override fun onCheckFailed() {
        TODO("Not yet implemented")
    }
}
