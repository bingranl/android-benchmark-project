package com.android.example.module06_module147_module4_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAI = com.android.example.module06_module147_module4_module6.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module109_module1.ClassAAD = com.android.example.module06_module109_module1.ClassAAD()
	private 	val instance_var_1_4: com.android.example.module06_module147_module4_module6.ClassAAC = com.android.example.module06_module147_module4_module6.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI,
		param2: com.android.example.module06_module147_module4_module6.ClassAAD,
		param3: com.android.example.module06_module147_module4_module6.ClassAAF
	) {
		listOf("1", "2", "3").forEach {
			param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		param0.method0(io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber())

		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAI,
		param1: com.android.example.module06_module109_module1.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAH
	) {
		val local_var_2_1: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
		local_var_2_1.start()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}
