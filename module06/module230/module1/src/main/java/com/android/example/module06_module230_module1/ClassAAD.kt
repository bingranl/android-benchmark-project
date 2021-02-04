package com.android.example.module06_module230_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module230_module2.ClassAAI = com.android.example.module06_module230_module2.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module230_module2.ClassAAJ = com.android.example.module06_module230_module2.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module230_module2.ClassAAG = com.android.example.module06_module230_module2.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module230_module2.ClassAAF = com.android.example.module06_module230_module2.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module230_module2.ClassAAJ,
		param1: com.android.example.module06_module230_module2.ClassAAI,
		param2: com.android.example.module06_module230_module2.ClassAAA
	) {
		val local_var_2_3: androidx.test.espresso.idling.CountingIdlingResource = androidx.test.espresso.idling.CountingIdlingResource("SomeString")
		local_var_2_3.dumpStateToLogs()

		for (iAb in 0..2) {
			val local_var_3_0: androidx.test.internal.runner.listener.LogRunListener = androidx.test.internal.runner.listener.LogRunListener()
			local_var_3_0.testRunFinished(org.junit.runner.Result())

			val local_var_3_1: androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder = androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder()
			local_var_3_1.setNameFormat("SomeString")

			local_var_3_0.testRunFinished(org.junit.runner.Result())

		}
		val local_var_2_4: androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory = androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory(androidx.test.espresso.base.BaseLayerModule())
		local_var_2_4.get()

	}

	fun method1(
		param0: com.android.example.module06_module230_module2.ClassAAI
	) {
		param0.method0("SomeString", "SomeString")

		val local_var_2_1: org.hamcrest.text.IsEmptyString = org.hamcrest.text.IsEmptyString()
		local_var_2_1.matches(kotlin.Any())

		val local_var_2_2: org.hamcrest.text.IsEmptyString = org.hamcrest.text.IsEmptyString()
		local_var_2_2.matches(kotlin.Any())

		val local_var_2_3: org.junit.internal.runners.statements.Fail = org.junit.internal.runners.statements.Fail(kotlin.Throwable())
		local_var_2_3.evaluate()

	}
}
