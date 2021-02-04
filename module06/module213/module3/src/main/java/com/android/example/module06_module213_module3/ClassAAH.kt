package com.android.example.module06_module213_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module213_module2.ClassAAF = com.android.example.module06_module213_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module213_module2.ClassAAJ = com.android.example.module06_module213_module2.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module213_module2.ClassAAH = com.android.example.module06_module213_module2.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module213_module5.ClassAAB = com.android.example.module06_module213_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAB,
		param1: com.android.example.module06_module213_module2.ClassAAI,
		param2: com.android.example.module06_module109_module1.ClassAAB,
		param3: com.android.example.module06_module109_module1.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module213_module2.ClassAAI,
		param1: com.android.example.module06_module213_module5.ClassAAJ
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}

	fun method2(
		param0: com.android.example.module06_module213_module2.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		param0.method1(com.android.example.module06_module213_module5.ClassAAF(), com.android.example.module06_module213_module5.ClassAAH(), com.android.example.module06_module213_module5.ClassAAH())

	}
}
