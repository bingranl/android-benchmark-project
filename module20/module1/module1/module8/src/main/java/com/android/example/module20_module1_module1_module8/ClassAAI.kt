package com.android.example.module20_module1_module1_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAA,
		param2: com.android.example.module06_module353_module2.ClassAAH,
		param3: com.android.example.module06_module353_module2.ClassAAD
	) {
		param0.method1("SomeString", "SomeString")

		for (iAb in 0..6) {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.deadlineNanoTime()

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.enter()

			local_var_3_0.setDelegate(okio.Timeout())

		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAD,
		param1: com.android.example.module06_module353_module2.ClassAAF,
		param2: com.android.example.module06_module353_module2.ClassAAF,
		param3: com.android.example.module06_module353_module2.ClassAAB
	) {
		param0.method3("SomeString")

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
