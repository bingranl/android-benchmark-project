package com.android.example.module20_module1_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module06_module353_module2.ClassAAI = com.android.example.module06_module353_module2.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: com.android.example.module06_module353_module2.ClassAAI,
		param2: com.android.example.module06_module353_module2.ClassAAG,
		param3: com.android.example.module06_module353_module2.ClassAAI
	) {
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAH
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(-2182408426091541634, 807468898775066905, -5152734043840180160)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

			val local_var_3_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_1.hasDeadline()

		}
	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAA
	) {
		param0.method3("SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
		local_var_2_2.start()

	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAH
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

	}
}
