package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		val local_var_2_3: com.android.example.module06_module114.ClassAAC = com.android.example.module06_module114.ClassAAC()
		local_var_2_3.method0("SomeString", "SomeString")

		for (iAb in 0..6) {
			val local_var_3_0: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()
			local_var_3_0.method4("SomeString", "SomeString", "SomeString")

			val local_var_3_1: com.android.example.module06_module281_module1.ClassAAD = com.android.example.module06_module281_module1.ClassAAD()
			local_var_3_1.method2(com.android.example.module06_module282_module1.ClassAAE(), com.android.example.module06_module342_module3.ClassAAF(), com.android.example.module06_module342_module3.ClassAAJ(), com.android.example.module06_module282_module1.ClassAAD())

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module109_module1.ClassAAH = com.android.example.module06_module109_module1.ClassAAH()
		local_var_2_1.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module109_module1.ClassAAE = com.android.example.module06_module109_module1.ClassAAE()
		local_var_2_2.method0("SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertNotSubscribed()

		param0.request(-1550288453429187468)

	}
}
