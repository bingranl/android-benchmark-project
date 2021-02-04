package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: rx.plugins.RxJavaSchedulersHook = rx.plugins.RxJavaSchedulersHook()
	private 	val instance_var_1_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_3: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_4: rx.internal.util.atomic.MpscLinkedAtomicQueue<kotlin.Any> = rx.internal.util.atomic.MpscLinkedAtomicQueue()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: rx.internal.util.unsafe.SpscLinkedQueue<kotlin.Any>
	) {
		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.onComplete()

		}
		val local_var_2_2: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_2.assertCompleted()

		param0.onComplete()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: rx.subscriptions.MultipleAssignmentSubscription = rx.subscriptions.MultipleAssignmentSubscription()
		local_var_2_3.get()

		param0.onComplete()

		param0.assertSubscribed()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_1.requestMore(-6635071694396728611)

		param0.requestMore(-890501069192955059)

		param0.onComplete()

		param0.assertSubscribed()

	}

	fun method3(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.SingleScheduler
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}
}
