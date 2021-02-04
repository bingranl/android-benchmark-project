package com.android.example.module06_module147_module4_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..0) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

			}
		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.internal.schedulers.IoScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		param0.hasSubscription()

		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.clear()

		param0.request(5051179585207396518)

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		param0.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-5976754630832609342)

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
