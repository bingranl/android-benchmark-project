package com.android.example.module07_module20_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module07_module20_module02_module1.ClassAAC = com.android.example.module07_module20_module02_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAB
	) {
	}

	fun method1(
		param0: com.android.example.module07_module20_module02_module1.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			param0.method1(com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAH())

			for (iAb in 0..1) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.request(-4024498289615503344)

				local_var_4_0.onError(kotlin.Throwable())

			}
		}
		param0.method0(com.android.example.module06_module353_module2.ClassAAB(), com.android.example.module06_module353_module2.ClassAAC(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAE())

		param0.method0(com.android.example.module06_module353_module2.ClassAAB(), com.android.example.module06_module353_module2.ClassAAC(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAE())

	}

	fun method2(
		param0: com.android.example.module07_module20_module02_module1.ClassAAH,
		param1: com.android.example.module06_module353_module2.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		param0.method2(com.android.example.module06_module353_module2.ClassAAB(), com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAC())

		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onBeforeWorkflowRendered(9073085967354038859, kotlin.Any(), kotlin.Any())

		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onRuntimeStopped()

	}
}
