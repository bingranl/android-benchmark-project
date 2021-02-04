package com.android.example.module07_module20_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module07_module20_module02_module1.ClassAAJ = com.android.example.module07_module20_module02_module1.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module20_module02_module1.ClassAAI = com.android.example.module07_module20_module02_module1.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module07_module20_module02_module1.ClassAAJ = com.android.example.module07_module20_module02_module1.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAA
	) {
		val local_var_2_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_1.onWorkflowStopped(-2284575389280755915)

		val local_var_2_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_2.onBeforeSnapshotPass()

	}

	fun method1(
		param0: com.android.example.module07_module20_module02_module1.ClassAAE,
		param1: com.android.example.module07_module20_module02_module1.ClassAAA,
		param2: com.android.example.module07_module20_module02_module1.ClassAAD
	) {
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onRuntimeStopped()

		param0.method0(com.android.example.module06_module353_module2.ClassAAH())

	}

	fun method2(
		param0: com.android.example.module07_module20_module02_module1.ClassAAF
	) {
		param0.method1(com.android.example.module06_module353_module2.ClassAAE(), com.android.example.module06_module353_module2.ClassAAD())

	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAF
	) {
		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		param0.method0("SomeString")

	}
}
