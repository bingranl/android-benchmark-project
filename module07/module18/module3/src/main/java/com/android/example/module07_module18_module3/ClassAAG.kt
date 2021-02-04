package com.android.example.module07_module18_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		for (iAb in 0..1) {
			param0.isDisposed()

			val local_var_3_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_0.get()

		}
		param0.assertSubscribed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

		param0.isCancelled()

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		param0.get()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

	}

	fun method3(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.get()

		param0.get()

	}
}
