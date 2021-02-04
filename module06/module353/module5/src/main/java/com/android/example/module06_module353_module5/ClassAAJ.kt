package com.android.example.module06_module353_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
	private 	val instance_var_1_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()

	fun method0(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
			local_var_3_0.method1(com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAG(), rx.observers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAB())

		}
		val local_var_2_1: com.android.example.module06_module353_module3.ClassAAJ = com.android.example.module06_module353_module3.ClassAAJ()
		local_var_2_1.method1(com.android.example.module06_module353_module2.ClassAAE(), com.android.example.module06_module353_module2.ClassAAI())

	}

	fun method1(
		param0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener
	) {
		val local_var_2_1: com.android.example.module06_module353_module3.ClassAAJ = com.android.example.module06_module353_module3.ClassAAJ()
		local_var_2_1.method0(io.reactivex.subscribers.TestSubscriber(), rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), rx.internal.util.unsafe.SpscArrayQueue(28))

		param0.onAfterSnapshotPass()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module353_module3.ClassAAC = com.android.example.module06_module353_module3.ClassAAC()
		local_var_2_1.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.LinkedArrayList(86))

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(74798967091292718)

		param0.cancel()

		param0.isCancelled()

	}
}
