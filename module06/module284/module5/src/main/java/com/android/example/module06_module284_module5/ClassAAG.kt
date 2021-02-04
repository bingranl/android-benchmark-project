package com.android.example.module06_module284_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.internal.schedulers.IoScheduler = io.reactivex.internal.schedulers.IoScheduler()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
			local_var_3_0.triggerActions()

			listOf("1", "2", "3").forEach {
				local_var_3_0.triggerActions()

			}
			val local_var_3_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
			local_var_3_1.triggerActions()

		}
		param0.isDisposed()

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method1(
		param0: io.reactivex.internal.schedulers.SingleScheduler,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		param0.createWorker()

	}

	fun method2(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
