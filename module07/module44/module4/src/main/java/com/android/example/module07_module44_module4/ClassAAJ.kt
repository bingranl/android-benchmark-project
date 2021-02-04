package com.android.example.module07_module44_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAH
	) {
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_0.start()

		}
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.exit()

	}
}
