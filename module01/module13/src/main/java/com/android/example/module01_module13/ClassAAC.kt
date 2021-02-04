package com.android.example.module01_module13

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: okio.AsyncTimeout = okio.AsyncTimeout()
	private 	val instance_var_1_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())

	fun method0(
		param0: okio.AsyncTimeout,
		param1: okio.Throttler
	) {
	}

	fun method1(
		param0: okio.ForwardingTimeout,
		param1: okio.AsyncTimeout
	) {
		for (iAb in 0..4) {
			for (iAc in 0..1) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module06_module156_module3.ClassAAE = com.android.example.module06_module156_module3.ClassAAE()
					local_var_5_0.method1(com.google.gson.JsonPrimitive("SomeString"))

				}
				param0.clearTimeout()

				val local_var_4_0: com.android.example.module06_module016_module5.ClassAAF = com.android.example.module06_module016_module5.ClassAAF()
				local_var_4_0.method2(com.android.example.module06_module150.ClassAAB(), com.android.example.module06_module134_module7.ClassAAJ(), com.android.example.module06_module134_module7.ClassAAD(), com.android.example.module06_module150.ClassAAJ())

				val local_var_4_1: com.android.example.module15_module28_module1.ClassAAE = com.android.example.module15_module28_module1.ClassAAE()
				local_var_4_1.method0("SomeString", "SomeString")

			}
		}
	}

	fun method2(
		param0: okio.ForwardingTimeout
	) {
		val local_var_2_1: com.android.example.module06_module084.ClassAAB = com.android.example.module06_module084.ClassAAB()
		local_var_2_1.method0(com.android.example.module06_module353_module1.ClassAAF(), com.android.example.module06_module086_module1.ClassAAI())

		param0.deadlineNanoTime()

	}

	fun method3(
		param0: okio.AsyncTimeout
	) {
	}

	fun method4(
		param0: okio.AsyncTimeout
	) {
		param0.exit()

		param0.exit()

		val local_var_2_1: com.android.example.module06_module314_module5.ClassAAF = com.android.example.module06_module314_module5.ClassAAF()
		local_var_2_1.method2(com.android.example.module06_module025_module2.ClassAAF())

	}
}
