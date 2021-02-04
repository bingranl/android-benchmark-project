package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAG = com.android.example.module07_module21_module01_module5.ClassAAG()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAC,
		param1: com.android.example.module07_module21_module01_module2.ClassAAC,
		param2: com.android.example.module07_module21_module01_module2.ClassAAE,
		param3: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber())

		listOf("1", "2", "3").forEach {
			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAA,
		param1: com.android.example.module07_module21_module01_module5.ClassAAH,
		param2: com.android.example.module07_module21_module01_module5.ClassAAA,
		param3: com.android.example.module07_module21_module01_module2.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module2.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module2.ClassAAE,
		param1: com.android.example.module07_module21_module01_module2.ClassAAI,
		param2: com.android.example.module07_module21_module01_module2.ClassAAE
	) {
		param0.method0(com.android.example.module07_module21_module01_module5.ClassAAB())

	}

	fun method4(
		param0: com.android.example.module07_module21_module01_module2.ClassAAD,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(33450437956463690)

		param0.method0(com.android.example.module07_module21_module01_module5.ClassAAH(), com.android.example.module07_module21_module01_module5.ClassAAF(), com.android.example.module07_module21_module01_module5.ClassAAD())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

	}
}
