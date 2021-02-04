package com.android.example.module07_module20_module07_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module07_module21_module03_module1.ClassAAD = com.android.example.module07_module21_module03_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module15_module21_module1.ClassAAJ = com.android.example.module15_module21_module1.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module07_module21_module03_module1.ClassAAD = com.android.example.module07_module21_module03_module1.ClassAAD()
	private 	val instance_var_1_4: com.android.example.module07_module21_module03_module1.ClassAAI = com.android.example.module07_module21_module03_module1.ClassAAI()

	fun method0(
		param0: com.android.example.module15_module21_module1.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAE,
		param2: com.android.example.module07_module21_module03_module1.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: okio.Timeout = okio.Timeout()
		local_var_2_4.timeoutNanos()

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: com.android.example.module07_module21_module03_module1.ClassAAC,
		param2: com.android.example.module06_module353_module2.ClassAAE,
		param3: com.android.example.module15_module21_module1.ClassAAC
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_5.start()

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: com.android.example.module15_module21_module1.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		param0.method2("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString")

	}
}
