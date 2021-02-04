package com.android.example.module07_module21_module02_module1_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module1.ClassAAG = com.android.example.module07_module21_module02_module1_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module1.ClassAAH = com.android.example.module07_module21_module02_module1_module1.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAA = com.android.example.module07_module21_module02_module1_module5.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module5.ClassAAB = com.android.example.module07_module21_module02_module1_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAI
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		listOf("1", "2", "3").forEach {
			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAA,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAC
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}
}
