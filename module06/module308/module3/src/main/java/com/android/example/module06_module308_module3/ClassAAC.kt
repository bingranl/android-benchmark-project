package com.android.example.module06_module308_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				for (iAb in 0..4) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.hasSubscription()

					val local_var_5_1: io.reactivex.disposables.CompositeDisposable = io.reactivex.disposables.CompositeDisposable()
					local_var_5_1.size()

				}
			}
			param0.assertNotSubscribed()

		}
		param0.onError(kotlin.Throwable())

		val local_var_2_1: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(58)
		local_var_2_1.toString()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
