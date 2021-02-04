package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module1.ClassAAD = com.android.example.module18_module1_module24_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module1.ClassAAH = com.android.example.module18_module1_module24_module1.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module1.ClassAAI = com.android.example.module18_module1_module24_module1.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module18_module1_module24_module3.ClassAAA = com.android.example.module18_module1_module24_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-2201666530740777715)

	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module3.ClassAAI,
		param1: com.android.example.module18_module1_module24_module1.ClassAAD,
		param2: com.android.example.module18_module1_module24_module3.ClassAAG
	) {
		param0.method0(io.reactivex.schedulers.TestScheduler())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module18_module1_module24_module3.ClassAAJ
	) {
	}

	fun method3(
		param0: com.android.example.module18_module1_module24_module1.ClassAAB,
		param1: com.android.example.module18_module1_module24_module1.ClassAAB,
		param2: com.android.example.module18_module1_module24_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		param0.method2(com.android.example.module18_module1_module24_module3.ClassAAA())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

	}

	fun method4(
		param0: com.android.example.module18_module1_module24_module3.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(6265058560957823136)

	}
}
