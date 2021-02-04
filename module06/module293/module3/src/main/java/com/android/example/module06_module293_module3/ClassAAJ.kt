package com.android.example.module06_module293_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
	private 	val instance_var_1_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			val local_var_3_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_1.dispose()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.requestMore(7954903079532720689)

			local_var_3_0.onComplete()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		param0.hasSubscription()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
