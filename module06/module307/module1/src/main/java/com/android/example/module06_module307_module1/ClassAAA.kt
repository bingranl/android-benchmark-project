package com.android.example.module06_module307_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(false)
	private 	val instance_var_1_1: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()
	private 	val instance_var_1_2: androidx.test.internal.runner.junit3.NonExecutingTestSuite = androidx.test.internal.runner.junit3.NonExecutingTestSuite(junit.framework.TestSuite())
	private 	val instance_var_1_3: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()
	private 	val instance_var_1_4: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()

	fun method0(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.internal.runner.listener.LogRunListener,
		param2: androidx.test.runner.UsageTrackerFacilitator,
		param3: androidx.test.runner.UsageTrackerFacilitator
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.android.example.module06_module337_module3.ClassAAI = com.android.example.module06_module337_module3.ClassAAI()
			local_var_3_0.method0(io.reactivex.internal.disposables.ListCompositeDisposable())

		}
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.shouldTrackUsage()

		}
		param0.shouldTrackUsage()

		param0.trackUsage("SomeString", "SomeString")

	}

	fun method1(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.runner.UsageTrackerFacilitator
	) {
		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_2.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.sendUsages()

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAI = com.android.example.module06_module337_module3.ClassAAI()
		local_var_2_3.method0(io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method2(
		param0: androidx.test.internal.runner.listener.LogRunListener
	) {
		val local_var_2_1: com.android.example.module06_module337_module3.ClassAAB = com.android.example.module06_module337_module3.ClassAAB()
		local_var_2_1.method3(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAA = com.android.example.module06_module337_module3.ClassAAA()
		local_var_2_2.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.internal.runner.listener.LogRunListener,
		param2: androidx.test.runner.UsageTrackerFacilitator,
		param3: androidx.test.internal.runner.listener.LogRunListener
	) {
		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAB = com.android.example.module06_module337_module3.ClassAAB()
		local_var_2_4.method3(io.reactivex.subscribers.TestSubscriber())

		param0.trackUsage("SomeString", "SomeString")

	}

	fun method4(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.runner.UsageTrackerFacilitator,
		param2: androidx.test.runner.UsageTrackerFacilitator
	) {
		param0.trackUsage("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAJ = com.android.example.module06_module337_module3.ClassAAJ()
		local_var_2_3.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
