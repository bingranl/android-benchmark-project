package com.android.example.module07_module20_module07_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module15_module21_module1.ClassAAG = com.android.example.module15_module21_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module15_module21_module1.ClassAAJ = com.android.example.module15_module21_module1.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module07_module21_module03_module1.ClassAAF = com.android.example.module07_module21_module03_module1.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module07_module21_module03_module1.ClassAAG = com.android.example.module07_module21_module03_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module07_module21_module03_module1.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAA,
		param2: com.android.example.module07_module21_module03_module1.ClassAAI,
		param3: com.android.example.module15_module21_module1.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		param0.method0("SomeString")

		for (iAb in 0..0) {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

		}
		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}

	fun method1(
		param0: com.android.example.module15_module21_module1.ClassAAA,
		param1: com.android.example.module15_module21_module1.ClassAAB,
		param2: com.android.example.module06_module353_module2.ClassAAA,
		param3: com.android.example.module06_module353_module2.ClassAAD
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		param0.method2("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module15_module21_module1.ClassAAF,
		param2: com.android.example.module07_module21_module03_module1.ClassAAH,
		param3: com.android.example.module06_module353_module2.ClassAAI
	) {
		val local_var_2_4: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_4.setDelegate(okio.Timeout())

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isCancelled()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAF
	) {
		param0.method0("SomeString")

		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.clearTimeout()

	}
}
