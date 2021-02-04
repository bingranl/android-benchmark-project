package com.android.example.module06_module313_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module313_module2.ClassAAA = com.android.example.module06_module313_module2.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAJ = com.android.example.module06_module109_module1.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module313_module2.ClassAAB = com.android.example.module06_module313_module2.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module313_module5.ClassAAI
	) {
		for (iAb in 0..4) {
			for (iAc in 0..4) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.request(5399175659903208228)

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

			local_var_3_0.onNext(kotlin.Any())

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.exit()

		}
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.deadlineNanoTime()

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAE,
		param1: com.android.example.module06_module313_module2.ClassAAH,
		param2: com.android.example.module06_module313_module2.ClassAAE
	) {
	}

	fun method2(
		param0: com.android.example.module06_module313_module2.ClassAAB,
		param1: com.android.example.module06_module313_module2.ClassAAB,
		param2: com.android.example.module06_module313_module2.ClassAAF,
		param3: com.android.example.module06_module313_module2.ClassAAG
	) {
	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAD,
		param1: com.android.example.module06_module313_module2.ClassAAA,
		param2: com.android.example.module06_module109_module1.ClassAAB
	) {
		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(4203410554770456616, 6846991666012324698, 8417852677494788881)

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		param0.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_5: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(31)
		local_var_2_5.toString()

	}
}
