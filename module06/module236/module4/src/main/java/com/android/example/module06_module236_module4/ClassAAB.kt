package com.android.example.module06_module236_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module236_module3.ClassAAD = com.android.example.module06_module236_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module236_module6.ClassAAJ = com.android.example.module06_module236_module6.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module236_module3.ClassAAA = com.android.example.module06_module236_module3.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module236_module6.ClassAAI = com.android.example.module06_module236_module6.ClassAAI()
	private 	val instance_var_1_4: com.android.example.module06_module236_module6.ClassAAA = com.android.example.module06_module236_module6.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module236_module6.ClassAAE,
		param1: com.android.example.module06_module236_module6.ClassAAG,
		param2: com.android.example.module06_module236_module6.ClassAAI
	) {
		for (iAb in 0..4) {
			val local_var_3_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
			local_var_3_0.onWorkflowStarted(8135500244524885800, 2833160075521816408, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), true)

			for (iAc in 0..2) {
				local_var_3_0.onBeforeWorkflowRendered(-4600095259634443585, kotlin.Any(), kotlin.Any())

				val local_var_4_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
				local_var_4_0.onWorkflowStopped(-5061595083470447746)

				local_var_4_0.onWorkerStopped(-5295796715101547449, 8380545306804166664)

			}
		}
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onPropsChanged(7409438168924698683, kotlin.Any(), kotlin.Any(), kotlin.Any(), kotlin.Any())

	}

	fun method1(
		param0: com.android.example.module06_module236_module3.ClassAAB,
		param1: com.android.example.module06_module236_module6.ClassAAB,
		param2: com.android.example.module06_module236_module6.ClassAAJ,
		param3: com.android.example.module06_module236_module6.ClassAAB
	) {
		val local_var_2_4: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_4.hasEnabledCallbacks()

	}

	fun method2(
		param0: com.android.example.module06_module236_module3.ClassAAA,
		param1: com.android.example.module06_module236_module3.ClassAAC
	) {
		val local_var_2_2: com.squareup.workflow.ui.Named<kotlin.Any> = com.squareup.workflow.ui.Named(kotlin.Any(), "SomeString")
		local_var_2_2.hashCode()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		param0.method1(com.android.example.module06_module236_module6.ClassAAE())

	}
}
