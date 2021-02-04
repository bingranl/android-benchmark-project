package com.android.example.module06_module307_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(false)
	private 	val instance_var_1_1: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(true)
	private 	val instance_var_1_2: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()
	private 	val instance_var_1_3: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()
	private 	val instance_var_1_4: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(true)

	fun method0(
		param0: androidx.test.internal.runner.junit3.NonExecutingTestSuite,
		param1: androidx.test.runner.UsageTrackerFacilitator
	) {
		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_2.method0(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.runner.UsageTrackerFacilitator,
		param2: androidx.test.internal.runner.junit3.NonExecutingTestSuite
	) {
		for (iAb in 0..2) {
			param0.trackUsage("SomeString", "SomeString")

			val local_var_3_0: com.android.example.module06_module337_module3.ClassAAB = com.android.example.module06_module337_module3.ClassAAB()
			local_var_3_0.method2(io.reactivex.subscribers.TestSubscriber())

		}
	}

	fun method2(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.internal.runner.junit3.NonExecutingTestSuite,
		param2: androidx.test.runner.UsageTrackerFacilitator,
		param3: androidx.test.internal.runner.junit3.NonExecutingTestSuite
	) {
		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAE = com.android.example.module06_module337_module3.ClassAAE()
		local_var_2_4.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: com.android.example.module06_module337_module3.ClassAAI = com.android.example.module06_module337_module3.ClassAAI()
		local_var_2_5.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: androidx.test.internal.runner.listener.LogRunListener
	) {
		val local_var_2_1: com.android.example.module06_module337_module3.ClassAAD = com.android.example.module06_module337_module3.ClassAAD()
		local_var_2_1.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAD = com.android.example.module06_module337_module3.ClassAAD()
		local_var_2_2.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.internal.runner.listener.LogRunListener,
		param2: androidx.test.runner.UsageTrackerFacilitator,
		param3: androidx.test.internal.runner.junit3.NonExecutingTestSuite
	) {
		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_4.method0(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: com.android.example.module06_module337_module3.ClassAAF = com.android.example.module06_module337_module3.ClassAAF()
		local_var_2_5.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_6: com.android.example.module06_module337_module3.ClassAAB = com.android.example.module06_module337_module3.ClassAAB()
		local_var_2_6.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
