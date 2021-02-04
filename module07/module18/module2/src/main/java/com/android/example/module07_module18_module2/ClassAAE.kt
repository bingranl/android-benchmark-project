package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module07_module18_module3.ClassAAJ = com.android.example.module07_module18_module3.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAE = com.android.example.module07_module18_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module18_module1.ClassAAJ,
		param1: com.android.example.module07_module18_module1.ClassAAI
	) {
		param0.method0(com.android.example.module07_module18_module3.ClassAAH())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}

	fun method1(
		param0: com.android.example.module07_module18_module3.ClassAAD
	) {
	}

	fun method2(
		param0: com.android.example.module07_module18_module1.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}
}
