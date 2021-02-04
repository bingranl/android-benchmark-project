package com.android.example.module06_module230_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module230_module2.ClassAAG = com.android.example.module06_module230_module2.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module230_module2.ClassAAJ = com.android.example.module06_module230_module2.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module230_module2.ClassAAB = com.android.example.module06_module230_module2.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module230_module2.ClassAAC = com.android.example.module06_module230_module2.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module230_module2.ClassAAD = com.android.example.module06_module230_module2.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module230_module2.ClassAAF
	) {
		val local_var_2_1: androidx.test.espresso.idling.CountingIdlingResource = androidx.test.espresso.idling.CountingIdlingResource("SomeString")
		local_var_2_1.decrement()

	}

	fun method1(
		param0: com.android.example.module06_module230_module2.ClassAAF,
		param1: com.android.example.module06_module230_module2.ClassAAG,
		param2: com.android.example.module06_module230_module2.ClassAAG,
		param3: com.android.example.module06_module230_module2.ClassAAG
	) {
		val local_var_2_4: androidx.test.espresso.idling.CountingIdlingResource = androidx.test.espresso.idling.CountingIdlingResource("SomeString")
		local_var_2_4.isIdleNow()

		val local_var_2_5: androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory = androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory(androidx.test.espresso.base.BaseLayerModule())
		local_var_2_5.get()

		val local_var_2_6: androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder = androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder()
		local_var_2_6.setNameFormat("SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module230_module2.ClassAAD,
		param1: com.android.example.module06_module230_module2.ClassAAI,
		param2: com.android.example.module06_module230_module2.ClassAAJ,
		param3: com.android.example.module06_module230_module2.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module230_module2.ClassAAI
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_1: androidx.test.runner.UsageTrackerFacilitator = androidx.test.runner.UsageTrackerFacilitator(false)
		local_var_2_1.shouldTrackUsage()

		param0.method3("SomeString", "SomeString", "SomeString")

	}
}
