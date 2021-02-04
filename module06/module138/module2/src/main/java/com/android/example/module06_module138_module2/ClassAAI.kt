package com.android.example.module06_module138_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module138_module3.ClassAAD = com.android.example.module06_module138_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module138_module1.ClassAAH = com.android.example.module06_module138_module1.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module138_module1.ClassAAG = com.android.example.module06_module138_module1.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module138_module1.ClassAAI = com.android.example.module06_module138_module1.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module138_module1.ClassAAB,
		param1: com.android.example.module06_module138_module3.ClassAAE,
		param2: com.android.example.module06_module138_module1.ClassAAE,
		param3: com.android.example.module06_module138_module1.ClassAAI
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

	}

	fun method1(
		param0: com.android.example.module06_module138_module1.ClassAAA
	) {
		param0.method3(com.android.example.module06_module138_module3.ClassAAF())

		if (kotlin.Any().equals(kotlin.Any())) {
			param0.method2(com.android.example.module06_module138_module3.ClassAAB(), com.android.example.module06_module138_module3.ClassAAE())

		} else {
			param0.method2(com.android.example.module06_module138_module3.ClassAAB(), com.android.example.module06_module138_module3.ClassAAE())

		}
		param0.method0(com.android.example.module06_module138_module3.ClassAAG(), com.android.example.module06_module138_module3.ClassAAC(), com.android.example.module06_module138_module3.ClassAAD(), com.android.example.module06_module138_module3.ClassAAF())

	}

	fun method2(
		param0: com.android.example.module06_module138_module1.ClassAAD,
		param1: com.android.example.module06_module138_module1.ClassAAH,
		param2: com.android.example.module06_module138_module3.ClassAAJ,
		param3: com.android.example.module06_module138_module1.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module138_module1.ClassAAF
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		val local_var_2_2: okio.Timeout = okio.Timeout()
		local_var_2_2.clearDeadline()

		val local_var_2_3: com.squareup.sqldelight.logs.StatementParameterInterceptor = com.squareup.sqldelight.logs.StatementParameterInterceptor()
		local_var_2_3.getAndClearParameters()

		param0.method0(com.android.example.module06_module138_module3.ClassAAA(), com.android.example.module06_module138_module3.ClassAAJ(), com.android.example.module06_module138_module3.ClassAAI())

	}
}
