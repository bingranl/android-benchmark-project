package com.android.example.module20_module1_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAB,
		param2: com.android.example.module06_module353_module2.ClassAAC
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAH,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAA
	) {
		for (iAb in 0..6) {
			for (iAc in 0..5) {
				param0.method0("SomeString", "SomeString", "SomeString")

				param0.method1("SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}
}
