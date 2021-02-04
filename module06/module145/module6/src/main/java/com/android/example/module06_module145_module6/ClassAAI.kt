package com.android.example.module06_module145_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		listOf("1", "2", "3").forEach {
			param0.dispose()

			for (iAb in 0..3) {
				param0.dispose()

				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

				local_var_4_0.isDisposed()

			}
		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(3526003582970386576)

		param0.dispose()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
