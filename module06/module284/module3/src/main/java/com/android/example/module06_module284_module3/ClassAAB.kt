package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module284_module5.ClassAAG = com.android.example.module06_module284_module5.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module284_module2.ClassAAH = com.android.example.module06_module284_module2.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module284_module2.ClassAAC,
		param1: com.android.example.module06_module284_module5.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(1164713063706963958)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		for (iAb in 0..4) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			local_var_3_0.isCancelled()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onComplete()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.onNext(kotlin.Any())

		}
		param0.method0(com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAD())

	}

	fun method1(
		param0: com.android.example.module06_module284_module2.ClassAAF
	) {
	}

	fun method2(
		param0: com.android.example.module06_module284_module5.ClassAAD,
		param1: com.android.example.module06_module284_module2.ClassAAI
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(1391708535244267817)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
