package com.android.example.module06_module353_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()

	fun method0(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		param0.onWorkerStarted(3054275447992338397, 6457423170499460142, "SomeString", "SomeString")

		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onWorkflowStarted(-4858022359385581972, -1895087588596334738, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), true)

		listOf("1", "2", "3").forEach {
			param0.onWorkerStarted(-435629084486911234, 4648724781415413784, "SomeString", "SomeString")

		}
		param0.onWorkerStarted(8962048541867408222, -2711492556120582937, "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		param0.isDisposed()

	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
