package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: rx.subscriptions.MultipleAssignmentSubscription = rx.subscriptions.MultipleAssignmentSubscription()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()

	fun method0(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		} else {
			val local_var_3_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
			local_var_3_0.assertNoTerminalEvent()

		}
		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isDisposed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.observers.TestObserver<kotlin.Any>,
		param2: rx.observers.TestSubscriber<kotlin.Any>
	) {
		param0.isDisposed()

		param0.onError(kotlin.Throwable())

	}
}
