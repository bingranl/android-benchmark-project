package com.android.example.module06_module163_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module342_module3.ClassAAC = com.android.example.module06_module342_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module342_module3.ClassAAE
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.exit()

		}
	}

	fun method1(
		param0: com.android.example.module06_module342_module3.ClassAAB
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		param0.method2("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module342_module3.ClassAAA,
		param1: com.android.example.module06_module342_module3.ClassAAD,
		param2: com.android.example.module06_module342_module3.ClassAAA
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		val local_var_2_4: okio.Timeout = okio.Timeout()
		local_var_2_4.deadlineNanoTime()

		param0.method4("SomeString", "SomeString")

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.enter()

	}
}
