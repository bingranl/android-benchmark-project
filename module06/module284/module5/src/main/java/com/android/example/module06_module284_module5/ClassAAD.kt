package com.android.example.module06_module284_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..2) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
					local_var_5_0.onComplete()

				} else {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.assertNotSubscribed()

				}
			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(-2595223636899900107)

		}
		param0.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		param0.isDisposed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.observers.TestObserver<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}
}
