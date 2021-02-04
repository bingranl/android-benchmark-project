package com.android.example.module06_module333_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module333_module2.ClassAAA = com.android.example.module06_module333_module2.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAH = com.android.example.module06_module333_module5.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module333_module2.ClassAAB = com.android.example.module06_module333_module2.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAE,
		param1: com.android.example.module06_module333_module5.ClassAAI,
		param2: com.android.example.module06_module333_module5.ClassAAJ,
		param3: com.android.example.module06_module333_module2.ClassAAI
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.dispose()

		}
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onNext(kotlin.Any())

		}
		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.onComplete()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAC
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module333_module2.ClassAAH
	) {
	}
}
