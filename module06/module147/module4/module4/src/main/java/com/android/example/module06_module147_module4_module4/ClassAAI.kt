package com.android.example.module06_module147_module4_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module3.ClassAAA = com.android.example.module06_module147_module4_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAD = com.android.example.module06_module147_module4_module6.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module147_module4_module3.ClassAAA = com.android.example.module06_module147_module4_module3.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module147_module4_module6.ClassAAE = com.android.example.module06_module147_module4_module6.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAB,
		param1: com.android.example.module06_module147_module4_module6.ClassAAB
	) {
	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module3.ClassAAD,
		param1: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		for (iAb in 0..1) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onComplete()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertNotSubscribed()

		}
	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAD,
		param1: com.android.example.module06_module147_module4_module3.ClassAAJ
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module3.ClassAAF,
		param1: com.android.example.module06_module147_module4_module3.ClassAAF,
		param2: com.android.example.module06_module147_module4_module3.ClassAAC
	) {
	}
}
