package com.android.example.module06_module319_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module318_module5.ClassAAH = com.android.example.module06_module318_module5.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module318_module5.ClassAAI = com.android.example.module06_module318_module5.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module318_module5.ClassAAE = com.android.example.module06_module318_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module318_module5.ClassAAE,
		param1: com.android.example.module06_module318_module5.ClassAAI,
		param2: com.android.example.module06_module318_module5.ClassAAF
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.getCancellationSignalObject()

	}

	fun method1(
		param0: com.android.example.module06_module318_module5.ClassAAF,
		param1: com.android.example.module06_module318_module5.ClassAAD,
		param2: com.android.example.module06_module318_module5.ClassAAI,
		param3: com.android.example.module06_module318_module5.ClassAAA
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

		if (kotlin.Any().equals(kotlin.Any())) {
			param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		} else {
			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 12)

		}
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module318_module5.ClassAAJ
	) {
		val local_var_2_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_1.cancel()

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method2("SomeString", "SomeString", "SomeString")

	}
}
