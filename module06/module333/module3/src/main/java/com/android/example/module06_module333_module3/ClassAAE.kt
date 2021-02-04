package com.android.example.module06_module333_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAH = com.android.example.module06_module333_module5.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module333_module2.ClassAAG = com.android.example.module06_module333_module2.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module333_module2.ClassAAA = com.android.example.module06_module333_module2.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAC = com.android.example.module06_module333_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAG,
		param1: com.android.example.module06_module333_module2.ClassAAG,
		param2: com.android.example.module06_module333_module2.ClassAAH
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.method0(io.reactivex.subscribers.TestSubscriber())

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAA,
		param1: com.android.example.module06_module333_module2.ClassAAA,
		param2: com.android.example.module06_module333_module5.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAD
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(-6098697953149714906)

	}

	fun method3(
		param0: com.android.example.module06_module333_module5.ClassAAC,
		param1: com.android.example.module06_module333_module2.ClassAAI,
		param2: com.android.example.module06_module333_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method4(
		param0: com.android.example.module06_module333_module5.ClassAAE,
		param1: com.android.example.module06_module333_module5.ClassAAD,
		param2: com.android.example.module06_module333_module2.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertNotSubscribed()

	}
}
