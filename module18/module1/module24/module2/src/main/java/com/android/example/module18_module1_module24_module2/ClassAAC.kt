package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module3.ClassAAG = com.android.example.module18_module1_module24_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module1.ClassAAB = com.android.example.module18_module1_module24_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module1.ClassAAG = com.android.example.module18_module1_module24_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module18_module1_module24_module1.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		for (iAb in 0..6) {
			for (iAc in 0..4) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.hasSubscription()

				local_var_4_0.onNext(kotlin.Any())

			}
		}
	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module1.ClassAAH,
		param1: com.android.example.module18_module1_module24_module1.ClassAAG
	) {
		param0.method4(com.android.example.module18_module1_module24_module3.ClassAAA())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}
