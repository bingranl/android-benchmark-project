package com.android.example.module07_module44_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAH,
		param1: com.android.example.module06_module353_module2.ClassAAH,
		param2: com.android.example.module06_module353_module2.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			param0.method1("SomeString", "SomeString", "SomeString")

		}
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.throwIfReached()

		} else {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.exit()

		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAG
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: okio.Timeout = okio.Timeout()
		local_var_2_3.deadlineNanoTime(6538845338265947073)

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAB
	) {
	}
}
