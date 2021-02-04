package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module284_module2.ClassAAA = com.android.example.module06_module284_module2.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module284_module2.ClassAAD = com.android.example.module06_module284_module2.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module284_module2.ClassAAB = com.android.example.module06_module284_module2.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module284_module2.ClassAAD,
		param1: com.android.example.module06_module284_module2.ClassAAJ
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..4) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onComplete()

				local_var_4_0.dispose()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.onNext(kotlin.Any())

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.onNext(kotlin.Any())

			}
		} else {
			param0.method2(com.android.example.module06_module284_module5.ClassAAA(), com.android.example.module06_module284_module5.ClassAAC(), com.android.example.module06_module284_module5.ClassAAE(), com.android.example.module06_module284_module5.ClassAAD())

		}
		param0.method3(com.android.example.module06_module284_module5.ClassAAJ())

	}

	fun method1(
		param0: com.android.example.module06_module284_module5.ClassAAB,
		param1: com.android.example.module06_module284_module2.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

	}
}
