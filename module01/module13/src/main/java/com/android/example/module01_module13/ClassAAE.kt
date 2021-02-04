package com.android.example.module01_module13

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: okio.AsyncTimeout = okio.AsyncTimeout()
	private 	val instance_var_1_1: okio.Timeout = okio.Timeout()
	private 	val instance_var_1_2: okio.Throttler = okio.Throttler()
	private 	val instance_var_1_3: okio.Throttler = okio.Throttler()

	fun method0(
		param0: okio.AsyncTimeout
	) {
	}

	fun method1(
		param0: okio.ForwardingTimeout,
		param1: okio.AsyncTimeout,
		param2: okio.AsyncTimeout,
		param3: okio.ForwardingTimeout
	) {
		val local_var_2_4: com.android.example.module15_module24_module1.ClassAAF = com.android.example.module15_module24_module1.ClassAAF()
		local_var_2_4.method4(com.android.example.module15_module21_module1.ClassAAJ(), com.android.example.module15_module21_module1.ClassAAJ(), com.android.example.module15_module21_module1.ClassAAA())

		val local_var_2_5: com.android.example.module06_module109_module1.ClassAAE = com.android.example.module06_module109_module1.ClassAAE()
		local_var_2_5.method1("SomeString", "SomeString", "SomeString")

		param0.clearDeadline()

	}

	fun method2(
		param0: okio.ForwardingTimeout,
		param1: okio.AsyncTimeout,
		param2: okio.AsyncTimeout,
		param3: okio.AsyncTimeout
	) {
		val local_var_2_4: com.android.example.module06_module320_module1.ClassAAA = com.android.example.module06_module320_module1.ClassAAA()
		local_var_2_4.method1(com.android.example.module06_module340_module3.ClassAAF(), com.android.example.module06_module340_module3.ClassAAB(), com.android.example.module06_module287_module3.ClassAAB(), com.android.example.module06_module340_module3.ClassAAG())

		val local_var_2_5: com.android.example.module15_module03_module1.ClassAAD = com.android.example.module15_module03_module1.ClassAAD()
		local_var_2_5.method0(com.android.example.module15_module20_module1.ClassAAI(), com.android.example.module15_module21_module1.ClassAAE(), com.android.example.module15_module20_module1.ClassAAB())

		param0.timeoutNanos()

		val local_var_2_6: com.android.example.module06_module016_module5.ClassAAI = com.android.example.module06_module016_module5.ClassAAI()
		local_var_2_6.method0(com.android.example.module06_module086_module1.ClassAAD(), com.android.example.module06_module086_module1.ClassAAH())

	}

	fun method3(
		param0: okio.Throttler,
		param1: okio.Throttler,
		param2: okio.Throttler,
		param3: okio.AsyncTimeout
	) {
	}
}
