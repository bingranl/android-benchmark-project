package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAH = com.android.example.module06_module257_module3.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAD = com.android.example.module06_module257_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module257_module3.ClassAAF = com.android.example.module06_module257_module3.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module257_module3.ClassAAD = com.android.example.module06_module257_module3.ClassAAD()
	private 	val instance_var_1_4: com.android.example.module06_module257_module3.ClassAAC = com.android.example.module06_module257_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAG,
		param1: com.android.example.module06_module257_module3.ClassAAG,
		param2: com.android.example.module06_module257_module3.ClassAAI
	) {
	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAH,
		param1: com.android.example.module06_module257_module3.ClassAAD,
		param2: com.android.example.module06_module257_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAH
	) {
		val local_var_2_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_1.get()

	}

	fun method3(
		param0: com.android.example.module06_module257_module3.ClassAAC,
		param1: com.android.example.module06_module257_module3.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
