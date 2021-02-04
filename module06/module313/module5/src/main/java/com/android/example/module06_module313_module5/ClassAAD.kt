package com.android.example.module06_module313_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		for (iAb in 0..1) {
			param0.onNext(kotlin.Any())

			for (iAc in 0..0) {
				param0.onComplete()

				val local_var_4_0: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_0.exit()

				val local_var_4_1: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_1.exit()

			}
		}
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		val local_var_2_4: okio.Throttler = okio.Throttler()
		local_var_2_4.bytesPerSecond(-9037932206832429614, -8050337092861004938, 3803389596152117543)

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}

	fun method4(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.enter()

	}
}
