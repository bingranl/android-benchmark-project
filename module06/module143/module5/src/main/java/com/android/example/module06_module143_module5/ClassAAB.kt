package com.android.example.module06_module143_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

		for (iAb in 0..2) {
			val local_var_3_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_0.get()

			local_var_3_0.get()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertNotSubscribed()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.onComplete()

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		val local_var_2_5: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_5.get()

	}
}
