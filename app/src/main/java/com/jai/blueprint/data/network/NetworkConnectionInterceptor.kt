package com.jai.blueprint.data.network

import android.content.Context
import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by JAI on 14,November,2019
 * JAI KHAMBHAYTA
 */
@Singleton
class NetworkConnectionInterceptor @Inject constructor(private val mContext: Context) :
    Interceptor {

    private val isConnected: Boolean
        get() {
            val connectivityManager = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = connectivityManager.activeNetworkInfo
            return netInfo != null && netInfo.isConnected
        }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isConnected) {
            throw NoConnectivityException()
            // Throwing our custom exception 'NoConnectivityException'
        }

        val builder = chain.request().newBuilder()
        return chain.proceed(builder.build())
    }

}