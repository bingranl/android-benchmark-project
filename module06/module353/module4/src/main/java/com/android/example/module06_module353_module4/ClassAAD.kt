package com.android.example.module06_module353_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()

	fun method0(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_1.onWorkerStarted(8274346352514495853, -6202391013295257041, "SomeString", "SomeString")

		for (iAb in 0..6) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
				local_var_4_0.onAfterWorkflowRendered(3007562626473178636, kotlin.Any())

				local_var_4_0.onBeforeWorkflowRendered(-1054882311282244471, kotlin.Any(), kotlin.Any())

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		param0.onBeforeSnapshotPass()

	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		param0.onBeforeSnapshotPass()

		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onBeforeWorkflowRendered(-3015101960762143742, kotlin.Any(), kotlin.Any())

		param0.onBeforeSnapshotPass()

	}

	fun method3(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onWorkerStopped(-7119451147703426378, -1734480263613390625)

		param0.onBeforeSnapshotPass()

		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onRuntimeStopped()

		val local_var_2_5: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_5.onWorkerOutput(6734948548437237011, 8321746628523694109, kotlin.Any())

	}

	fun method4(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}
}
