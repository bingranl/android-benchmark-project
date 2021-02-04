package com.android.example.module06_module316_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"

	fun method0(
		param0: String
	) {
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

	}

	fun method2(
		param0: String
	) {
	}

	fun method3(
		param0: String,
		param1: String
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_0.throwIfCanceled()

			val local_var_3_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_1.isCanceled()

		}
	}

	fun method4(
		param0: String,
		param1: String
	) {
		val local_var_2_2: androidx.collection.LongSparseArray<kotlin.Any> = androidx.collection.LongSparseArray()
		local_var_2_2.remove(-4118396435958090736)

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.isCanceled()

	}
}
