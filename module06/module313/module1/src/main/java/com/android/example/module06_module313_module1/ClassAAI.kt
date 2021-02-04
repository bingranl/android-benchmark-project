package com.android.example.module06_module313_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module313_module5.ClassAAD = com.android.example.module06_module313_module5.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module342_module3.ClassAAF = com.android.example.module06_module342_module3.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module342_module3.ClassAAI
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		param0.method2("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module313_module5.ClassAAF
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.setDelegate(okio.Timeout())

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

	}

	fun method2(
		param0: com.android.example.module06_module313_module5.ClassAAH,
		param1: com.android.example.module06_module313_module5.ClassAAG,
		param2: com.android.example.module06_module342_module3.ClassAAI
	) {
		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-2891684249673792459, 6949131153610190074, -760188092574475111)

	}

	fun method3(
		param0: com.android.example.module06_module342_module3.ClassAAA
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.timeoutNanos()

	}

	fun method4(
		param0: com.android.example.module06_module313_module5.ClassAAD,
		param1: com.android.example.module06_module313_module5.ClassAAI,
		param2: com.android.example.module06_module342_module3.ClassAAF
	) {
	}
}
