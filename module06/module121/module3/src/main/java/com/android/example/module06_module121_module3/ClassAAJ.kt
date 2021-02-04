package com.android.example.module06_module121_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_2.throwIfCanceled()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_1.hasEnabledCallbacks()

		param0.onNext(kotlin.Any())

		param0.onComplete()

	}
}
