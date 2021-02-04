package com.android.example.module06_module145_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAE = com.android.example.module06_module145_module6.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAB = com.android.example.module06_module145_module6.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module145_module3.ClassAAD = com.android.example.module06_module145_module3.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module06_module145_module3.ClassAAA = com.android.example.module06_module145_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module145_module3.ClassAAC,
		param1: com.android.example.module06_module145_module6.ClassAAD
	) {
		for (iAb in 0..0) {
			param0.method1(com.android.example.module06_module145_module6.ClassAAD(), com.android.example.module06_module145_module6.ClassAAJ(), com.android.example.module06_module145_module6.ClassAAJ(), com.android.example.module06_module145_module6.ClassAAI())

			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onComplete()

			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

			}
		}
		param0.method1(com.android.example.module06_module145_module6.ClassAAD(), com.android.example.module06_module145_module6.ClassAAJ(), com.android.example.module06_module145_module6.ClassAAJ(), com.android.example.module06_module145_module6.ClassAAI())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		param0.method3(com.android.example.module06_module145_module6.ClassAAF(), com.android.example.module06_module145_module6.ClassAAG(), com.android.example.module06_module145_module6.ClassAAG(), com.android.example.module06_module145_module6.ClassAAD())

	}

	fun method1(
		param0: com.android.example.module06_module145_module3.ClassAAJ
	) {
		param0.method3(com.android.example.module06_module145_module6.ClassAAJ())

		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}
}
