package com.android.example.module06_module123_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: okhttp3.internal.platform.AndroidPlatform = okhttp3.internal.platform.AndroidPlatform()
	private 	val instance_var_1_1: okhttp3.internal.platform.android.DeferredSocketAdapter = okhttp3.internal.platform.android.DeferredSocketAdapter("SomeString")
	private 	val instance_var_1_2: okhttp3.Dispatcher = okhttp3.Dispatcher()

	fun method0(
		param0: okhttp3.internal.http2.Settings,
		param1: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param2: okhttp3.OkHttpClient
	) {
	}

	fun method1(
		param0: okhttp3.ConnectionPool,
		param1: okhttp3.ConnectionPool,
		param2: okhttp3.OkHttpClient
	) {
		param0.idleConnectionCount()

	}

	fun method2(
		param0: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		for (iAb in 0..5) {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.exit()

			val local_var_3_1: okio.Throttler = okio.Throttler()
			local_var_3_1.bytesPerSecond(-9022986534579373042, -5296213018187959832, 9070172833330396537)

			val local_var_3_2: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_2.enter()

		}
		param0.getEffectiveTldPlusOne("SomeString")

	}

	fun method3(
		param0: okhttp3.OkHttpClient
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(4308122037782694270, -5291551377268627661, -8190030238260099156)

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		val local_var_2_3: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_3.throwIfReached()

		param0.newBuilder()

	}

	fun method4(
		param0: okhttp3.internal.platform.Android10Platform
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(-3602529687307793846, 3807995766229578257, 8237694016761241011)

	}
}
