package com.android.example.module06_module353_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: com.android.example.module06_module353_module3.ClassAAC,
		param2: io.reactivex.internal.schedulers.SingleScheduler,
		param3: com.android.example.module06_module353_module3.ClassAAF
	) {
		val local_var_2_4: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_4.onBeforeSnapshotPass()

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAC = com.android.example.module06_module353_module3.ClassAAC()
		local_var_2_5.method0(com.android.example.module06_module353_module2.ClassAAH(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), rx.observers.TestSubscriber())

	}

	fun method1(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

	}
}
