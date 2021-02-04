package com.android.example.module06_module143_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..2) {
			param0.assertSubscribed()

			for (iAc in 0..6) {
				param0.cancel()

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertSubscribed()

			}
			val local_var_3_0: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(78)
			local_var_3_0.head()

		}
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.isDisposed()

		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.get()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method2(
		param0: io.reactivex.internal.util.LinkedArrayList,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

	}
}
