package com.android.example.module06_module308_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(96)

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.onComplete()

		} else {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
				local_var_4_0.isDisposed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.hasSubscription()

			}
		}
	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		param0.isDisposed()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(6925368290781103144)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

	}
}
