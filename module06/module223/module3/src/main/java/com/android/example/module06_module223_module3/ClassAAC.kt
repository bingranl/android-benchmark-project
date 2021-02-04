package com.android.example.module06_module223_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: okhttp3.internal.platform.Android10Platform = okhttp3.internal.platform.Android10Platform()
	private 	val instance_var_1_1: okhttp3.internal.platform.AndroidPlatform = okhttp3.internal.platform.AndroidPlatform()

	fun method0(
		param0: okhttp3.internal.http2.Settings,
		param1: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param2: okhttp3.internal.platform.Android10Platform
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.exit()

		val local_var_2_4: okio.Timeout = okio.Timeout()
		local_var_2_4.clearTimeout()

		for (iAb in 0..5) {
			param0.merge(okhttp3.internal.http2.Settings())

		}
		param0.getEnablePush(false)

	}

	fun method1(
		param0: okhttp3.internal.platform.Android10Platform,
		param1: okhttp3.OkHttpClient
	) {
	}

	fun method2(
		param0: okhttp3.internal.http2.Settings,
		param1: okhttp3.OkHttpClient
	) {
		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.clearTimeout()

		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-7250372568443074, -2988107878758053505, -6483273231198887253)

		param0.getMaxHeaderListSize(68)

	}

	fun method3(
		param0: okhttp3.Dispatcher,
		param1: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param2: okhttp3.OkHttpClient,
		param3: okhttp3.internal.http2.Settings
	) {
	}

	fun method4(
		param0: okhttp3.OkHttpClient,
		param1: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		param0.newBuilder()

	}
}
