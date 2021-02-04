package com.android.example.module06_module353_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..5) {
				param0.dispose()

				param0.clear()

				val local_var_4_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
				local_var_4_0.onAfterWorkflowRendered(966091592991688536, kotlin.Any())

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.onNext(kotlin.Any())

			}
		}
		val local_var_2_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_2.triggerActions()

		param0.isDisposed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onWorkflowStarted(-1873397746336111951, 9014251149763260995, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), false)

		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onWorkerStopped(-3236407058447234071, 7912433005937375359)

		val local_var_2_5: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_5.onBeforeSnapshotPass()

	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
