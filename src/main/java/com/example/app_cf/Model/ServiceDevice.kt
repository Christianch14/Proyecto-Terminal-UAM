package com.example.app_cf.Model

import android.os.Parcelable
import com.example.app_cf.R
import kotlinx.parcelize.Parcelize
import java.net.InetAddress


@Parcelize
data class ServiceDevice(
    val deviceServiceName:String,
    val deviceServiceType:String,
    val image:Int = R.drawable.logoesp32
):Parcelable
