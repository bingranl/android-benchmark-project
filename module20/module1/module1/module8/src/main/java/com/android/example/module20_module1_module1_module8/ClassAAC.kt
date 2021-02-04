package com.android.example.module20_module1_module1_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAH
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.exit()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		param0.method0("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAD,
		param2: com.android.example.module06_module353_module2.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAD,
		param1: com.android.example.module06_module353_module2.ClassAAG
	) {
		param0.method0("SomeString", "SomeString", "SomeString")

	}
}
