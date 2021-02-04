package com.android.example.module07_module21_module07_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module15_module21_module1.ClassAAH = com.android.example.module15_module21_module1.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module15_module21_module1.ClassAAD = com.android.example.module15_module21_module1.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module15_module21_module1.ClassAAE = com.android.example.module15_module21_module1.ClassAAE()

	fun method0(
		param0: com.android.example.module15_module21_module1.ClassAAC
	) {
		for (iAb in 0..6) {
			for (iAc in 0..4) {
				for (iAd in 0..0) {
					val local_var_5_0: okio.AsyncTimeout = okio.AsyncTimeout()
					local_var_5_0.exit()

					local_var_5_0.enter()

					local_var_5_0.exit()

					local_var_5_0.enter()

				}
				param0.method0("SomeString")

				val local_var_4_0: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_0.exit()

				val local_var_4_1: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_1.exit()

			}
			param0.method1("SomeString", "SomeString")

			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.throwIfReached()

		}
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		param0.method0("SomeString")

		val local_var_2_2: okio.Timeout = okio.Timeout()
		local_var_2_2.deadlineNanoTime(7362634268940453748)

	}

	fun method1(
		param0: com.android.example.module15_module21_module1.ClassAAI,
		param1: com.android.example.module15_module21_module1.ClassAAB,
		param2: com.android.example.module15_module21_module1.ClassAAA,
		param3: com.android.example.module15_module21_module1.ClassAAG
	) {
		val local_var_2_4: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_4.timeoutNanos()

		param0.method4("SomeString", "SomeString", "SomeString")

	}
}
