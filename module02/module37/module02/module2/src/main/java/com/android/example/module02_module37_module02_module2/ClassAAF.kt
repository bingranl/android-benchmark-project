package com.android.example.module02_module37_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module02_module37_module02_module3.ClassAAE = com.android.example.module02_module37_module02_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module02_module37_module02_module3.ClassAAD = com.android.example.module02_module37_module02_module3.ClassAAD()

	fun method0(
		param0: com.android.example.module02_module37_module02_module3.ClassAAB,
		param1: com.android.example.module02_module37_module02_module1.ClassAAB,
		param2: com.android.example.module02_module37_module02_module1.ClassAAI,
		param3: com.android.example.module02_module37_module02_module1.ClassAAA
	) {
	}

	fun method1(
		param0: com.android.example.module02_module37_module02_module3.ClassAAC,
		param1: com.android.example.module02_module37_module02_module3.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module02_module37_module02_module1.ClassAAC,
		param1: com.android.example.module02_module37_module02_module3.ClassAAA
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}
}
