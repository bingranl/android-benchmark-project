package com.android.example.module07_module18_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		val local_var_2_5: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_5.get()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		param0.get()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		param0.assertNotSubscribed()

	}
}
