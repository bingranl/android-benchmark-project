package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module027_module1.ClassAAE = com.android.example.module06_module027_module1.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module027_module3.ClassAAA = com.android.example.module06_module027_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module027_module1.ClassAAG = com.android.example.module06_module027_module1.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module027_module3.ClassAAF = com.android.example.module06_module027_module3.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module027_module3.ClassAAB,
		param1: com.android.example.module06_module027_module3.ClassAAA,
		param2: com.android.example.module06_module027_module1.ClassAAE
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(3866604834658952668)

	}

	fun method1(
		param0: com.android.example.module06_module027_module1.ClassAAA,
		param1: com.android.example.module06_module027_module1.ClassAAA
	) {
		param0.method2(com.android.example.module06_module027_module3.ClassAAA())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		param0.method1(com.android.example.module06_module027_module3.ClassAAJ(), com.android.example.module06_module027_module3.ClassAAI(), com.android.example.module06_module027_module3.ClassAAF())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}

	fun method2(
		param0: com.android.example.module06_module027_module1.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}
}
