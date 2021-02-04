package com.android.example.module07_module44_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAA
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.Throttler = okio.Throttler()
			local_var_3_0.bytesPerSecond(-6587122762237709469, -4535437411993302308, -8340034530135008937)

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.enter()

		}
		param0.method1("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAF,
		param2: com.android.example.module06_module353_module2.ClassAAB,
		param3: com.android.example.module06_module353_module2.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-6348606691799640477)

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module06_module353_module2.ClassAAE,
		param2: com.android.example.module06_module353_module2.ClassAAD,
		param3: com.android.example.module06_module353_module2.ClassAAH
	) {
		val local_var_2_4: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_4.throwIfReached()

		param0.method1("SomeString", "SomeString")

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertNotSubscribed()

		val local_var_2_6: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_6.clearTimeout()

	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAG
	) {
	}
}
