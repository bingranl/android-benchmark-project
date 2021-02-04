package com.android.example.module07_module44_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
	private 	val instance_var_1_4: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAD
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.exit()

		listOf("1", "2", "3").forEach {
			param0.method3("SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAB
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.deadlineNanoTime(4636720607619412380)

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(8985581231329348003, -9113841544243874475, 3000118699124513449)

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAF,
		param3: com.android.example.module06_module353_module2.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAI
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(-2127454685853837757, -8679872739750723617, -5720093375071329674)

		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.clearTimeout()

		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-8622422766281211683, -738796450201127732, 2326350402643355563)

	}
}
