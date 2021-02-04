package com.android.example.module06_module353_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()

	fun method0(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		param0.onWorkflowStopped(-8703054975016871936)

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onBeforeSnapshotPass()

		for (iAb in 0..3) {
			param0.onNext(kotlin.Any())

			val local_var_3_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
			local_var_3_0.onPropsChanged(-4782216738458385116, kotlin.Any(), kotlin.Any(), kotlin.Any(), kotlin.Any())

		}
	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onWorkerStopped(3004646284135926387, -2624390167145284666)

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertSubscribed()

	}

	fun method4(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onAfterWorkflowRendered(-5666440136467964232, kotlin.Any())

		val local_var_2_5: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_5.onBeforeRenderPass(kotlin.Any())

	}
}
