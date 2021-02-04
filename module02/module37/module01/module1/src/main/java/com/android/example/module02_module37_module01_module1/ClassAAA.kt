package com.android.example.module02_module37_module01_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

	}

	fun method3(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

	}

	fun method4(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

	}
}
