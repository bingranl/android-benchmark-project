package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module3.ClassAAB = com.android.example.module18_module1_module24_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module3.ClassAAE = com.android.example.module18_module1_module24_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module3.ClassAAI = com.android.example.module18_module1_module24_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAA,
		param1: com.android.example.module18_module1_module24_module1.ClassAAB,
		param2: com.android.example.module18_module1_module24_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.isDisposed()

	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module1.ClassAAG,
		param1: com.android.example.module18_module1_module24_module1.ClassAAE
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		for (iAb in 0..3) {
			param0.method1(com.android.example.module18_module1_module24_module3.ClassAAH(), com.android.example.module18_module1_module24_module3.ClassAAA())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

			local_var_3_0.isCancelled()

		}
	}

	fun method2(
		param0: com.android.example.module18_module1_module24_module1.ClassAAJ,
		param1: com.android.example.module18_module1_module24_module3.ClassAAH,
		param2: com.android.example.module18_module1_module24_module3.ClassAAH,
		param3: com.android.example.module18_module1_module24_module3.ClassAAH
	) {
	}
}
