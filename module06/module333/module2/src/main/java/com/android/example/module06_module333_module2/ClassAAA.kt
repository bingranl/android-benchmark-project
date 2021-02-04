package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAF = com.android.example.module06_module333_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAJ = com.android.example.module06_module333_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAF = com.android.example.module06_module333_module5.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAD,
		param1: com.android.example.module06_module333_module5.ClassAAH
	) {
		for (iAb in 0..6) {
			param0.method1(io.reactivex.subscribers.TestSubscriber())

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAB
	) {
		param0.method3(io.reactivex.schedulers.TestScheduler(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAG,
		param1: com.android.example.module06_module333_module5.ClassAAB,
		param2: com.android.example.module06_module333_module5.ClassAAD
	) {
	}

	fun method3(
		param0: com.android.example.module06_module333_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(948518879879406768)

	}

	fun method4(
		param0: com.android.example.module06_module333_module5.ClassAAB,
		param1: com.android.example.module06_module333_module5.ClassAAC
	) {
		val local_var_2_2: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_2.isDisposed()

	}
}
