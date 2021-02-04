package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAD = com.android.example.module07_module21_module01_module5.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAJ = com.android.example.module07_module21_module01_module5.ClassAAJ()
	private 	val instance_var_1_4: com.android.example.module07_module21_module01_module5.ClassAAH = com.android.example.module07_module21_module01_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		param0.method4(io.reactivex.internal.schedulers.IoScheduler(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB,
		param1: com.android.example.module07_module21_module01_module5.ClassAAF,
		param2: com.android.example.module07_module21_module01_module5.ClassAAI,
		param3: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(1942661271806366738)

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module5.ClassAAG,
		param2: com.android.example.module07_module21_module01_module5.ClassAAD,
		param3: com.android.example.module07_module21_module01_module5.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onComplete()

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.requestMore(3265284932564822833)

	}
}
