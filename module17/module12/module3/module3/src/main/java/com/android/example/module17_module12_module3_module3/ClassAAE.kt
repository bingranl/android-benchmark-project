package com.android.example.module17_module12_module3_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module17_module13_module1.ClassAAF = com.android.example.module17_module13_module1.ClassAAF()
		local_var_2_1.method0("SomeString", "SomeString")

		for (iAb in 0..6) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.isCancelled()

			}
		}
		val local_var_2_2: com.android.example.module17_module01_module3.ClassAAI = com.android.example.module17_module01_module3.ClassAAI()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module17_module13_module1.ClassAAG = com.android.example.module17_module13_module1.ClassAAG()
		local_var_2_2.method1("SomeString")

		param0.onError(kotlin.Throwable())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
