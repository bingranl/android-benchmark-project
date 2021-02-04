package com.android.example.module06_module002_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAE = com.android.example.module06_module002_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module002_module1.ClassAAE = com.android.example.module06_module002_module1.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAD = com.android.example.module06_module002_module5.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAI = com.android.example.module06_module002_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module002_module1.ClassAAA,
		param1: com.android.example.module06_module002_module1.ClassAAI,
		param2: com.android.example.module06_module002_module5.ClassAAD
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.getCancellationSignalObject()

		listOf("1", "2", "3").forEach {
			for (iAb in 0..3) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.requestMore(3005154631462051749)

				val local_var_4_1: androidx.arch.core.internal.SafeIterableMap<kotlin.Any,kotlin.Any> = androidx.arch.core.internal.SafeIterableMap()
				local_var_4_1.size()

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.isDisposed()

			}
			param0.method0(com.android.example.module06_module002_module5.ClassAAF(), com.android.example.module06_module002_module5.ClassAAB(), com.android.example.module06_module002_module5.ClassAAD())

		}
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 68)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

	}

	fun method1(
		param0: com.android.example.module06_module002_module1.ClassAAJ,
		param1: com.android.example.module06_module002_module1.ClassAAB,
		param2: com.android.example.module06_module002_module1.ClassAAJ,
		param3: com.android.example.module06_module002_module1.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 34)

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onComplete()

	}

	fun method2(
		param0: com.android.example.module06_module002_module1.ClassAAB,
		param1: com.android.example.module06_module002_module1.ClassAAA
	) {
	}
}
