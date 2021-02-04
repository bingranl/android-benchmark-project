package com.android.example.module06_module138_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
	private 	val instance_var_1_1: okhttp3.OkHttpClient = okhttp3.OkHttpClient()
	private 	val instance_var_1_2: okhttp3.internal.http2.Settings = okhttp3.internal.http2.Settings()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param2: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		val local_var_2_5: okio.Throttler = okio.Throttler()
		local_var_2_5.bytesPerSecond(8887835699010414033, 34369186494017791, -7965630966862716065)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.Throttler = okio.Throttler()
			local_var_3_0.bytesPerSecond(-379255281049024426, -188422349274706968, -8766217121013725842)

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.enter()

		}
		param0.assertNotSubscribed()

	}

	fun method1(
		param0: okhttp3.OkHttpClient,
		param1: okhttp3.ConnectionPool,
		param2: okhttp3.internal.platform.Android10Platform
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.exit()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

	}
}
