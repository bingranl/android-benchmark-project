package com.android.example.module07_module18_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_1.get()

	}

	fun method1(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			param0.onComplete()

			val local_var_3_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_0.get()

		}
		param0.hasSubscription()

		val local_var_2_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_1.get()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		param0.cancel()

	}

	fun method4(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(2341135541025785722)

	}
}
