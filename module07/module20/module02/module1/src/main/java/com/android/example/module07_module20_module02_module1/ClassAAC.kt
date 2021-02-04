package com.android.example.module07_module20_module02_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAI,
		param1: com.android.example.module06_module353_module2.ClassAAB
	) {
		for (iAb in 0..5) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.method4("SomeString", "SomeString")

			}
			param0.method0("SomeString")

			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

		}
		val local_var_2_2: okio.Throttler = okio.Throttler()
		local_var_2_2.bytesPerSecond(6249944920150895310, -5049440041744932983, 6763552766466570185)

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: com.android.example.module06_module353_module2.ClassAAE,
		param2: com.android.example.module06_module353_module2.ClassAAH
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.exit()

		param0.method2("SomeString", "SomeString", "SomeString")

		param0.method3("SomeString", "SomeString")

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 98)

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module06_module353_module2.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module06_module353_module2.ClassAAF
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

	}

	fun method4(
		param0: com.android.example.module06_module353_module2.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAF,
		param3: com.android.example.module06_module353_module2.ClassAAB
	) {
		param0.method0("SomeString")

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.cancel()

	}
}
