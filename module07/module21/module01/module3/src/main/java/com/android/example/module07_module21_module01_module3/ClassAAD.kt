package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module2.ClassAAF = com.android.example.module07_module21_module01_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module2.ClassAAE = com.android.example.module07_module21_module01_module2.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module2.ClassAAE = com.android.example.module07_module21_module01_module2.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module2.ClassAAJ = com.android.example.module07_module21_module01_module2.ClassAAJ()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAH,
		param1: com.android.example.module07_module21_module01_module5.ClassAAB,
		param2: com.android.example.module07_module21_module01_module2.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.LinkedArrayList(16))

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE,
		param1: com.android.example.module07_module21_module01_module5.ClassAAH,
		param2: com.android.example.module07_module21_module01_module5.ClassAAH,
		param3: com.android.example.module07_module21_module01_module5.ClassAAI
	) {
	}
}
