package com.android.example.module06_module140_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module138_module3.ClassAAB = com.android.example.module06_module138_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module138_module3.ClassAAD = com.android.example.module06_module138_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module138_module3.ClassAAI = com.android.example.module06_module138_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module138_module3.ClassAAB
	) {
		param0.method0(okhttp3.Dispatcher(), io.reactivex.observers.TestObserver())

		listOf("1", "2", "3").forEach {
			param0.method3(okhttp3.OkHttpClient(), io.reactivex.subscribers.TestSubscriber(), okhttp3.internal.http2.Settings(), okhttp3.internal.platform.Android10Platform())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module06_module138_module3.ClassAAC,
		param1: com.android.example.module06_module138_module3.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(8586041824228105757)

		val local_var_2_3: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
		local_var_2_3.getEffectiveTldPlusOne("SomeString")

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}

	fun method2(
		param0: com.android.example.module06_module138_module3.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module138_module3.ClassAAA,
		param1: com.android.example.module06_module138_module3.ClassAAF,
		param2: com.android.example.module06_module138_module3.ClassAAC,
		param3: com.android.example.module06_module138_module3.ClassAAI
	) {
		val local_var_2_4: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_4.get()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}
}
