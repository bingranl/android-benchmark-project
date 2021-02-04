package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module284_module5.ClassAAE = com.android.example.module06_module284_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module284_module2.ClassAAG = com.android.example.module06_module284_module2.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module284_module5.ClassAAC = com.android.example.module06_module284_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module284_module2.ClassAAH,
		param1: com.android.example.module06_module284_module2.ClassAAI,
		param2: com.android.example.module06_module284_module5.ClassAAD
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.request(-3510663559072243435)

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method1(
		param0: com.android.example.module06_module284_module5.ClassAAC
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.hasSubscription()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-9117833237442273660)

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module06_module284_module5.ClassAAJ
	) {
		param0.method0(io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method3(
		param0: com.android.example.module06_module284_module2.ClassAAH,
		param1: com.android.example.module06_module284_module5.ClassAAE,
		param2: com.android.example.module06_module284_module2.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(3750586108767637475)

		param0.method0(com.android.example.module06_module284_module5.ClassAAH(), com.android.example.module06_module284_module5.ClassAAD())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(3321651917687239308)

	}
}
