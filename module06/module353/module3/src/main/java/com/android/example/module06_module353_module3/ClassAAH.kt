package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAC
	) {
	}

	fun method1(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..6) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
				local_var_4_0.assertError(kotlin.Throwable())

			}
		}
		val local_var_2_2: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
		local_var_2_2.method1("SomeString")

		param0.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}

	fun method2(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: com.android.example.module06_module353_module2.ClassAAD,
		param3: com.android.example.module06_module353_module2.ClassAAH
	) {
	}
}
