package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAG = com.android.example.module06_module333_module5.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAA = com.android.example.module06_module333_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAF = com.android.example.module06_module333_module5.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAJ = com.android.example.module06_module333_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAD,
		param1: com.android.example.module06_module333_module5.ClassAAC,
		param2: com.android.example.module06_module333_module5.ClassAAH
	) {
	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAJ
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAG,
		param1: com.android.example.module06_module333_module5.ClassAAE
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

	}

	fun method3(
		param0: com.android.example.module06_module333_module5.ClassAAE,
		param1: com.android.example.module06_module333_module5.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

	}
}
