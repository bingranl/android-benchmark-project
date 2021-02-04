package com.android.example.module06_module145_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module145_module3.ClassAAB = com.android.example.module06_module145_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module145_module3.ClassAAA = com.android.example.module06_module145_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module145_module3.ClassAAG = com.android.example.module06_module145_module3.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module145_module3.ClassAAC = com.android.example.module06_module145_module3.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module145_module6.ClassAAC = com.android.example.module06_module145_module6.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module145_module3.ClassAAE,
		param1: com.android.example.module06_module145_module6.ClassAAB,
		param2: com.android.example.module06_module145_module3.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-8757846350424301908)

		param0.method1(com.android.example.module06_module145_module6.ClassAAI(), com.android.example.module06_module145_module6.ClassAAG(), com.android.example.module06_module145_module6.ClassAAF(), com.android.example.module06_module145_module6.ClassAAI())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAH,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module3.ClassAAD
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
