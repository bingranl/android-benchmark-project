package com.android.example.module06_module353_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module353_module3.ClassAAE = com.android.example.module06_module353_module3.ClassAAE()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_4: com.android.example.module06_module353_module3.ClassAAD = com.android.example.module06_module353_module3.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module353_module3.ClassAAI,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: com.android.example.module06_module353_module3.ClassAAI
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		for (iAb in 0..4) {
			for (iAc in 0..2) {
				val local_var_4_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
				local_var_4_0.onWorkflowStarted(1363660077562197007, -6646015353904190830, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), true)

				val local_var_4_1: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
				local_var_4_1.method2(rx.observers.TestSubscriber())

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.request(-6341846601954973797)

			}
			val local_var_3_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
			local_var_3_0.onBeforeRenderPass(kotlin.Any())

		}
		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAG = com.android.example.module06_module353_module3.ClassAAG()
		local_var_2_4.method3(com.android.example.module06_module353_module2.ClassAAE())

		param0.method1(com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAG(), rx.observers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAB())

	}

	fun method1(
		param0: com.android.example.module06_module353_module3.ClassAAG,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_2.onWorkerOutput(-8457604444095346380, 2074613242703864658, kotlin.Any())

		val local_var_2_3: com.android.example.module06_module353_module3.ClassAAE = com.android.example.module06_module353_module3.ClassAAE()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
		local_var_2_4.method3(com.android.example.module06_module353_module2.ClassAAB(), rx.observers.TestSubscriber())

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAF = com.android.example.module06_module353_module3.ClassAAF()
		local_var_2_5.method1(rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
