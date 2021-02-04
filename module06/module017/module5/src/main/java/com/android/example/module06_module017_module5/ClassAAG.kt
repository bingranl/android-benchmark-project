package com.android.example.module06_module017_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module017_module8.ClassAAF = com.android.example.module06_module017_module8.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module017_module8.ClassAAJ = com.android.example.module06_module017_module8.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module017_module4.ClassAAB = com.android.example.module06_module017_module4.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module109_module1.ClassAAH = com.android.example.module06_module109_module1.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module06_module017_module4.ClassAAJ = com.android.example.module06_module017_module4.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module017_module8.ClassAAB,
		param1: com.android.example.module06_module017_module4.ClassAAE,
		param2: com.android.example.module06_module109_module1.ClassAAG
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.getCancellationSignalObject()

		for (iAb in 0..5) {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module06_module017_module8.ClassAAH
	) {
		val local_var_2_1: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_1.onAfterSnapshotPass()

		param0.method3(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: com.squareup.workflow.ui.Named<kotlin.Any> = com.squareup.workflow.ui.Named(kotlin.Any(), "SomeString")
		local_var_2_2.component2()

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAE,
		param1: com.android.example.module06_module109_module1.ClassAAB,
		param2: com.android.example.module06_module109_module1.ClassAAB
	) {
	}
}
