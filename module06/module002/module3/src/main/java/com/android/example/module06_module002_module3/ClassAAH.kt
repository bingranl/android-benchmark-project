package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAA = com.android.example.module06_module002_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module002_module2.ClassAAG = com.android.example.module06_module002_module2.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
				param0.method2(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

			param0.method2(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAC,
		param1: com.android.example.module06_module002_module2.ClassAAF
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module002_module2.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

	}
}
