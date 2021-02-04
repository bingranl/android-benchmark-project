package com.android.example.module06_module313_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module313_module2.ClassAAD = com.android.example.module06_module313_module2.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAI = com.android.example.module06_module109_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module313_module5.ClassAAA = com.android.example.module06_module313_module5.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module313_module5.ClassAAH,
		param1: com.android.example.module06_module313_module2.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method1(
		param0: com.android.example.module06_module313_module5.ClassAAD,
		param1: com.android.example.module06_module313_module5.ClassAAJ
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

		}
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		param0.method3(io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method2(
		param0: com.android.example.module06_module313_module5.ClassAAE,
		param1: com.android.example.module06_module313_module5.ClassAAB,
		param2: com.android.example.module06_module313_module2.ClassAAI,
		param3: com.android.example.module06_module313_module5.ClassAAC
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: okio.Throttler = okio.Throttler()
		local_var_2_5.bytesPerSecond(1179211855173855722, -3041437045967495005, -6780800074423807571)

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module313_module2.ClassAAE,
		param1: com.android.example.module06_module313_module5.ClassAAJ,
		param2: com.android.example.module06_module109_module1.ClassAAI
	) {
		val local_var_2_3: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_3.timeoutNanos()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}

	fun method4(
		param0: com.android.example.module06_module109_module1.ClassAAJ,
		param1: com.android.example.module06_module313_module2.ClassAAI,
		param2: com.android.example.module06_module313_module2.ClassAAI
	) {
		val local_var_2_3: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_3.timeoutNanos()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: okio.Throttler = okio.Throttler()
		local_var_2_5.bytesPerSecond(4818697161145390224, 226932889328711884, -6269388790793284371)

		param0.method0("SomeString", "SomeString")

	}
}
