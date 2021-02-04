package com.android.example.module06_module312_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module246.ClassAAH = com.android.example.module06_module246.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module246.ClassAAF = com.android.example.module06_module246.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module246.ClassAAB,
		param1: com.android.example.module06_module246.ClassAAA
	) {
	}

	fun method1(
		param0: com.android.example.module06_module246.ClassAAI,
		param1: com.android.example.module06_module246.ClassAAC,
		param2: com.android.example.module06_module246.ClassAAD
	) {
		for (iAb in 0..3) {
			for (iAc in 0..4) {
				for (iAd in 0..1) {
					val local_var_5_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
					local_var_5_0.throwIfCanceled()

				}
				val local_var_4_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_0.cancel()

				val local_var_4_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_1.approveCall("SomeString", 66)

				local_var_4_0.isCanceled()

			}
			val local_var_3_0: androidx.arch.core.internal.SafeIterableMap<kotlin.Any,kotlin.Any> = androidx.arch.core.internal.SafeIterableMap()
			local_var_3_0.descendingIterator()

			val local_var_3_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_1.throwIfCanceled()

		}
		param0.method2(dagger.internal.DelegateFactory())

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 55)

	}

	fun method2(
		param0: com.android.example.module06_module246.ClassAAD,
		param1: com.android.example.module06_module246.ClassAAI,
		param2: com.android.example.module06_module246.ClassAAA,
		param3: com.android.example.module06_module246.ClassAAD
	) {
		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

	}

	fun method3(
		param0: com.android.example.module06_module246.ClassAAF,
		param1: com.android.example.module06_module246.ClassAAF,
		param2: com.android.example.module06_module246.ClassAAB,
		param3: com.android.example.module06_module246.ClassAAI
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.cancel()

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 61)

	}
}
