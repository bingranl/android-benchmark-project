package com.android.example.module06_module138_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: okhttp3.OkHttpClient = okhttp3.OkHttpClient()
	private 	val instance_var_1_1: okhttp3.internal.http2.Settings = okhttp3.internal.http2.Settings()
	private 	val instance_var_1_2: okhttp3.internal.platform.android.DeferredSocketAdapter = okhttp3.internal.platform.android.DeferredSocketAdapter("SomeString")
	private 	val instance_var_1_3: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
	private 	val instance_var_1_4: okhttp3.internal.http2.Settings = okhttp3.internal.http2.Settings()

	fun method0(
		param0: io.reactivex.internal.schedulers.IoScheduler
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: okhttp3.internal.platform.Android10Platform,
		param2: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		param0.onNext(kotlin.Any())

		param0.assertSubscribed()

		val local_var_2_5: okio.Throttler = okio.Throttler()
		local_var_2_5.bytesPerSecond(-3752400136431556183, -3807697097035407512, -3939851656110504219)

	}
}
