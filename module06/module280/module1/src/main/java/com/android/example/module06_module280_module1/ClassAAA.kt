package com.android.example.module06_module280_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_2.createWorker()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		param0.onNext(kotlin.Any())

	}

	fun method1(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: rx.internal.util.atomic.SpscLinkedAtomicQueue<kotlin.Any>,
		param2: rx.observers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

	}

	fun method2(
		param0: io.reactivex.internal.util.LinkedArrayList,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.util.LinkedArrayList
	) {
		param0.add(kotlin.Any())

		val local_var_2_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_4.assertValue(kotlin.Any())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

	}

	fun method3(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-8262877629870573614)

		param0.dispose()

	}

	fun method4(
		param0: rx.internal.util.atomic.MpscLinkedAtomicQueue<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_4.getOnErrorEvents()

	}
}
