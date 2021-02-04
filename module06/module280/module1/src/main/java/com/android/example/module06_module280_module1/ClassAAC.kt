package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..3) {
				param0.hasSubscription()

			}
		}
	}

	fun method1(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: rx.observers.TestSubscriber<kotlin.Any>
	) {
		param0.assertNotCompleted()

		val local_var_2_4: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_4.start()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.isCancelled()

	}
}
