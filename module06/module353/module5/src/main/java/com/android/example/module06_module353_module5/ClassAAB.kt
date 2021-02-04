package com.android.example.module06_module353_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: com.android.example.module06_module353_module3.ClassAAF = com.android.example.module06_module353_module3.ClassAAF()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.android.example.module06_module353_module3.ClassAAG = com.android.example.module06_module353_module3.ClassAAG()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: com.android.example.module06_module353_module3.ClassAAJ,
		param2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onWorkflowStopped(-3149329984526009333)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
			local_var_3_0.onAfterSnapshotPass()

		}
		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_4.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAE())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

	}

	fun method1(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener,
		param1: com.android.example.module06_module353_module3.ClassAAI,
		param2: io.reactivex.disposables.SerialDisposable
	) {
		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		param0.onPropsChanged(1231827194759166217, kotlin.Any(), kotlin.Any(), kotlin.Any(), kotlin.Any())

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
		local_var_2_5.method3(com.android.example.module06_module353_module2.ClassAAB(), rx.observers.TestSubscriber())

	}

	fun method2(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
	}
}
