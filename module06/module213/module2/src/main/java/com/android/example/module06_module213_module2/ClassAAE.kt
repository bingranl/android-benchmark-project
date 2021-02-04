package com.android.example.module06_module213_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAC = com.android.example.module06_module213_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAJ = com.android.example.module06_module213_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAD,
		param1: com.android.example.module06_module213_module5.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		for (iAb in 0..5) {
			for (iAc in 0..0) {
				param0.method3(io.reactivex.internal.util.LinkedArrayList(30), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.requestMore(2074314429167303174)

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.cancel()

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-9049144340866764566)

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(7595046574616398786)

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
