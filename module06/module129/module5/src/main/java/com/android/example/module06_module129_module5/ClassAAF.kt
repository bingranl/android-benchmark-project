package com.android.example.module06_module129_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module353_module1.ClassAAA = com.android.example.module06_module353_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAB = com.android.example.module06_module353_module1.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module353_module1.ClassAAF,
		param1: com.android.example.module06_module353_module2.ClassAAJ
	) {
		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.deadlineNanoTime()

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				param0.method1(com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAI(), com.android.example.module06_module353_module2.ClassAAB(), com.android.example.module06_module353_module2.ClassAAD())

				param0.method0(com.android.example.module06_module353_module2.ClassAAJ())

			}
		}
		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(6522085014474334657, 633901900018499073, -1883107024551770671)

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAJ
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAJ
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.hasDeadline()

	}
}
