package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: rx.internal.util.unsafe.SpscLinkedQueue<kotlin.Any> = rx.internal.util.unsafe.SpscLinkedQueue()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: rx.internal.util.unsafe.SpscUnboundedArrayQueue<kotlin.Any> = rx.internal.util.unsafe.SpscUnboundedArrayQueue(71)

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.requestMore(-2447754641920756090)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		val local_var_2_5: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_5.assertTerminalEvent()

	}

	fun method1(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable,
		param3: rx.observers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		val local_var_2_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_4.getValueCount()

	}
}
