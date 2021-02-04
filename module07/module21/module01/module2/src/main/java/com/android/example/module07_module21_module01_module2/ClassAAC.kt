package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAI = com.android.example.module07_module21_module01_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAG = com.android.example.module07_module21_module01_module5.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAD = com.android.example.module07_module21_module01_module5.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAD = com.android.example.module07_module21_module01_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE,
		param1: com.android.example.module07_module21_module01_module5.ClassAAB,
		param2: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
		for (iAb in 0..4) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

		}
		for (iAc in 0..6) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAI,
		param1: com.android.example.module07_module21_module01_module5.ClassAAJ,
		param2: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
		param0.method2(io.reactivex.schedulers.TestScheduler(), io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}
}
