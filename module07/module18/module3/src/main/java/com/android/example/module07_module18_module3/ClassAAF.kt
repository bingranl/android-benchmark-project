package com.android.example.module07_module18_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..6) {
				param0.get()

				val local_var_4_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
				local_var_4_0.get()

				val local_var_4_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
				local_var_4_1.get()

			}
		} else {
			val local_var_3_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_0.get()

		}
	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.dispose()

		param0.clear()

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_1.get()

		param0.get()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method3(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

		val local_var_2_5: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_5.get()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.request(-3329882679551836791)

		val local_var_2_7: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_7.get()

	}
}
