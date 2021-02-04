package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAA = com.android.example.module06_module257_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAI = com.android.example.module06_module257_module3.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module257_module3.ClassAAH = com.android.example.module06_module257_module3.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module257_module3.ClassAAJ = com.android.example.module06_module257_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAJ,
		param1: com.android.example.module06_module257_module3.ClassAAI,
		param2: com.android.example.module06_module257_module3.ClassAAH,
		param3: com.android.example.module06_module257_module3.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		listOf("1", "2", "3").forEach {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

		param0.method3(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAD,
		param1: com.android.example.module06_module257_module3.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAI,
		param1: com.android.example.module06_module257_module3.ClassAAA,
		param2: com.android.example.module06_module257_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}
}
