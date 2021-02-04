package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_2: io.reactivex.internal.schedulers.NewThreadScheduler = io.reactivex.internal.schedulers.NewThreadScheduler()

	fun method0(
		param0: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		for (iAb in 0..3) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.getCompletions()

			} else {
				val local_var_4_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
				local_var_4_0.getCompletions()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

			local_var_3_0.requestMore(3508077495548670478)

			local_var_3_0.onNext(kotlin.Any())

		}
		val local_var_2_2: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(62)
		local_var_2_2.size()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: rx.plugins.RxJavaSchedulersHook
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		param0.hasSubscription()

		val local_var_2_4: rx.internal.util.unsafe.SpscUnboundedArrayQueue<kotlin.Any> = rx.internal.util.unsafe.SpscUnboundedArrayQueue(15)
		local_var_2_4.iterator()

		param0.assertSubscribed()

	}

	fun method2(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: rx.observers.TestSubscriber<kotlin.Any>
	) {
	}
}
