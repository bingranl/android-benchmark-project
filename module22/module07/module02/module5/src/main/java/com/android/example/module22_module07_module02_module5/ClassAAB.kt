package com.android.example.module22_module07_module02_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(27)
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.util.LinkedArrayList,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.onError(kotlin.Throwable())

		val local_var_2_3: okio.Timeout = okio.Timeout()
		local_var_2_3.clearDeadline()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method4(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.createWorker()

		param0.createWorker()

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

	}
}
