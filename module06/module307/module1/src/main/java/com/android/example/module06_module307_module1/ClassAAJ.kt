package com.android.example.module06_module307_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: androidx.test.orchestrator.listeners.result.TestRunResult = androidx.test.orchestrator.listeners.result.TestRunResult()
	private 	val instance_var_1_1: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(false)

	fun method0(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.runner.UsageTrackerFacilitator
	) {
		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module06_module337_module3.ClassAAI = com.android.example.module06_module337_module3.ClassAAI()
					local_var_5_0.method0(io.reactivex.internal.disposables.ListCompositeDisposable())

				}
			} else {
				val local_var_4_0: com.android.example.module06_module337_module3.ClassAAJ = com.android.example.module06_module337_module3.ClassAAJ()
				local_var_4_0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			}
			param0.sendUsages()

		}
	}

	fun method1(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.internal.runner.junit3.NonExecutingTestSuite,
		param2: androidx.test.runner.UsageTrackerFacilitator,
		param3: androidx.test.internal.runner.listener.LogRunListener
	) {
		param0.sendUsages()

		param0.shouldTrackUsage()

		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAI = com.android.example.module06_module337_module3.ClassAAI()
		local_var_2_4.method1(io.reactivex.subscribers.TestSubscriber())

		param0.trackUsage("SomeString", "SomeString")

	}

	fun method2(
		param0: androidx.test.runner.UsageTrackerFacilitator,
		param1: androidx.test.runner.UsageTrackerFacilitator,
		param2: androidx.test.runner.UsageTrackerFacilitator
	) {
		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.trackUsage("SomeString", "SomeString")

	}
}
