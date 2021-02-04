package com.android.example.module06_module236_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module236_module6.ClassAAE = com.android.example.module06_module236_module6.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module236_module3.ClassAAI = com.android.example.module06_module236_module3.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module236_module6.ClassAAG = com.android.example.module06_module236_module6.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module236_module6.ClassAAI = com.android.example.module06_module236_module6.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module236_module6.ClassAAB,
		param1: com.android.example.module06_module236_module3.ClassAAF
	) {
	}

	fun method1(
		param0: com.android.example.module06_module236_module6.ClassAAI,
		param1: com.android.example.module06_module236_module6.ClassAAD
	) {
		val local_var_2_2: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_2.onAfterSnapshotPass()

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.throwIfCanceled()

		listOf("1", "2", "3").forEach {
			param0.method0("SomeString", "SomeString")

			param0.method2("SomeString")

		}
		val local_var_2_4: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_4.hasEnabledCallbacks()

	}

	fun method2(
		param0: com.android.example.module06_module236_module3.ClassAAC,
		param1: com.android.example.module06_module236_module3.ClassAAA,
		param2: com.android.example.module06_module236_module3.ClassAAI,
		param3: com.android.example.module06_module236_module6.ClassAAG
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

	}

	fun method3(
		param0: com.android.example.module06_module236_module3.ClassAAJ,
		param1: com.android.example.module06_module236_module3.ClassAAI
	) {
		param0.method4(com.android.example.module06_module236_module6.ClassAAA(), com.android.example.module06_module236_module6.ClassAAC(), com.android.example.module06_module236_module6.ClassAAD())

		param0.method2(com.android.example.module06_module236_module6.ClassAAB())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: com.squareup.workflow.ui.Named<kotlin.Any> = com.squareup.workflow.ui.Named(kotlin.Any(), "SomeString")
		local_var_2_3.component2()

	}
}
