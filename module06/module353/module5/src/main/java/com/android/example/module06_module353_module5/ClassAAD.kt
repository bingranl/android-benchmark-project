package com.android.example.module06_module353_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_2: com.android.example.module06_module353_module3.ClassAAA = com.android.example.module06_module353_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module353_module3.ClassAAA
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
			local_var_3_0.onAfterRenderPass(kotlin.Any())

			for (iAb in 0..3) {
				val local_var_4_0: com.android.example.module06_module353_module3.ClassAAA = com.android.example.module06_module353_module3.ClassAAA()
				local_var_4_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_1: com.android.example.module06_module353_module3.ClassAAD = com.android.example.module06_module353_module3.ClassAAD()
				local_var_4_1.method2(com.android.example.module06_module353_module2.ClassAAJ())

				local_var_4_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
				local_var_4_2.onAfterSnapshotPass()

			}
		}
		val local_var_2_1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(33)
		local_var_2_1.add(kotlin.Any())

		val local_var_2_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_2.onPropsChanged(-8189433224038565200, kotlin.Any(), kotlin.Any(), kotlin.Any(), kotlin.Any())

		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onPropsChanged(-7566736137690933466, kotlin.Any(), kotlin.Any(), kotlin.Any(), kotlin.Any())

	}

	fun method1(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_3: com.android.example.module06_module353_module3.ClassAAF = com.android.example.module06_module353_module3.ClassAAF()
		local_var_2_3.method1(rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_4.method0(rx.subscriptions.BooleanSubscription(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAC())

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_5.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAE())

		param0.onWorkflowStarted(-4300243030233920207, -2432847722026863256, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), false)

	}
}
