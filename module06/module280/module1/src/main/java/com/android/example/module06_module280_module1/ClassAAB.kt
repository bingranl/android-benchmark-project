package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_2: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_3: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()

	fun method0(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..2) {
			for (iAc in 0..3) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

			}
			val local_var_3_0: rx.internal.util.unsafe.SpscLinkedQueue<kotlin.Any> = rx.internal.util.unsafe.SpscLinkedQueue()
			local_var_3_0.offer(kotlin.Any())

		}
	}

	fun method1(
		param0: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertSubscribed()

		param0.hasSubscription()

		param0.assertNotSubscribed()

		param0.isCancelled()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_2.getValueCount()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}
}
