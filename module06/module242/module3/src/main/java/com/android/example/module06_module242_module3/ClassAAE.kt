package com.android.example.module06_module242_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String
	) {
		val local_var_2_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_1.cancel()

		local_var_2_1.getCancellationSignalObject()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_0.getCancellationSignalObject()

			val local_var_3_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_1.cancel()

		}
		local_var_2_1.throwIfCanceled()

	}

	fun method1(
		param0: String,
		param1: String
	) {
	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

	}
}
