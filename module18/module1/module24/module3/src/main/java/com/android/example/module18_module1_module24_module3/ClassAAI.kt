package com.android.example.module18_module1_module24_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		listOf("1", "2", "3").forEach {
			param0.triggerActions()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}

	fun method1(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.schedulers.TestScheduler
	) {
		param0.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}
}
