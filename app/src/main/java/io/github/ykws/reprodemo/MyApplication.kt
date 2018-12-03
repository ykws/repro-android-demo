package io.github.ykws.reprodemo

import android.app.Application
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import io.repro.android.Repro

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val applicationInfo : ApplicationInfo? = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
        val apiKey = applicationInfo?.metaData?.getString("apiKey")

        Repro.setup(this, apiKey)
        Repro.startRecording()
    }
}