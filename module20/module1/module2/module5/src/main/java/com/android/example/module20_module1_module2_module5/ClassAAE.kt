package com.android.example.module20_module1_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAI,
		param2: com.android.example.module06_module353_module2.ClassAAF
	) {
		for (iAb in 0..3) {
			param0.method0("SomeString", "SomeString", "SomeString")

			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.timeoutNanos()

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.enter()

		}
		param0.method1("SomeString")

		param0.method2("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAF,
		param1: com.android.example.module06_module353_module2.ClassAAJ,
		param2: com.android.example.module06_module353_module2.ClassAAJ,
		param3: com.android.example.module06_module353_module2.ClassAAC
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		param0.method0("SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAH,
		param1: com.android.example.module06_module353_module2.ClassAAJ,
		param2: com.android.example.module06_module353_module2.ClassAAE
	) {
		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-6081229181148128485, -7382538215977679879, -7691501973439474209)

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

		val local_var_2_6: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_6.throwIfReached()

	}
}
