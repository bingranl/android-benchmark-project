package com.android.example.module06_module213_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module213_module2.ClassAAI = com.android.example.module06_module213_module2.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module213_module2.ClassAAC = com.android.example.module06_module213_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module109_module1.ClassAAI,
		param1: com.android.example.module06_module213_module2.ClassAAI
	) {
		param0.method2("SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}

	fun method1(
		param0: com.android.example.module06_module213_module2.ClassAAH
	) {
	}

	fun method2(
		param0: com.android.example.module06_module213_module2.ClassAAH
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(2857942752231907305)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.isDisposed()

	}
}
