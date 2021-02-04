package com.android.example.module06_module168_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module15_module21_module1.ClassAAF = com.android.example.module15_module21_module1.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module15_module21_module1.ClassAAA = com.android.example.module15_module21_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module15_module21_module1.ClassAAC = com.android.example.module15_module21_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module15_module21_module1.ClassAAI,
		param1: com.android.example.module15_module21_module1.ClassAAJ,
		param2: com.android.example.module15_module21_module1.ClassAAC,
		param3: com.android.example.module15_module21_module1.ClassAAE
	) {
		val local_var_2_4: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_4.hasDeadline()

		param0.method0("SomeString")

		for (iAb in 0..4) {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.clearDeadline()

			local_var_3_0.hasDeadline()

			val local_var_3_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_1.throwIfReached()

			val local_var_3_2: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_2.enter()

		}
		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.enter()

	}

	fun method1(
		param0: com.android.example.module15_module21_module1.ClassAAI,
		param1: com.android.example.module15_module21_module1.ClassAAD,
		param2: com.android.example.module15_module21_module1.ClassAAA
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		val local_var_2_4: okio.Throttler = okio.Throttler()
		local_var_2_4.bytesPerSecond(1385957140223585084, -8961266580046346886, -2988808658587485755)

		val local_var_2_5: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_5.timeoutNanos()

	}

	fun method2(
		param0: com.android.example.module15_module21_module1.ClassAAC
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.clearDeadline()

	}
}
