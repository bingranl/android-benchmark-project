package com.android.example.module06_module355_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"
	private 	val instance_var_1_4: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		for (iAb in 0..3) {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.exit()

			local_var_3_0.exit()

		}
		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-1355882415813032628, 198990930548082923, 7015827822469347581)

	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.deadlineNanoTime()

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_3.clearDeadline()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		local_var_2_3.clearDeadline()

	}
}
