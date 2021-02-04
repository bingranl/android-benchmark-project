package com.android.example.module07_module21_module13_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module07_module21_module13_module5.ClassAAI = com.android.example.module07_module21_module13_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module21_module13_module5.ClassAAA = com.android.example.module07_module21_module13_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module21_module13_module5.ClassAAH = com.android.example.module07_module21_module13_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module07_module21_module13_module5.ClassAAJ,
		param1: com.android.example.module07_module21_module13_module5.ClassAAB,
		param2: com.android.example.module07_module21_module13_module5.ClassAAJ
	) {
	}

	fun method1(
		param0: com.android.example.module07_module21_module13_module5.ClassAAA,
		param1: com.android.example.module07_module21_module13_module5.ClassAAA,
		param2: com.android.example.module07_module21_module13_module5.ClassAAA
	) {
		param0.method0("SomeString")

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}

	fun method2(
		param0: com.android.example.module07_module21_module13_module5.ClassAAA,
		param1: com.android.example.module07_module21_module13_module5.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method3(
		param0: com.android.example.module07_module21_module13_module5.ClassAAE,
		param1: com.android.example.module07_module21_module13_module5.ClassAAA,
		param2: com.android.example.module07_module21_module13_module5.ClassAAA,
		param3: com.android.example.module07_module21_module13_module5.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(1479565200059819022)

	}

	fun method4(
		param0: com.android.example.module07_module21_module13_module5.ClassAAE,
		param1: com.android.example.module07_module21_module13_module5.ClassAAD,
		param2: com.android.example.module07_module21_module13_module5.ClassAAI
	) {
		param0.method1("SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}
}
