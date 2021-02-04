package com.android.example.module06_module175

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: androidx.collection.CircularIntArray = androidx.collection.CircularIntArray()
		local_var_2_3.removeFromEnd(79)

	}

	fun method1(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.cancel()

		listOf("1", "2", "3").forEach {
			local_var_2_3.getCancellationSignalObject()

			local_var_2_3.cancel()

		}
	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

		local_var_2_4.isCanceled()

	}
}
