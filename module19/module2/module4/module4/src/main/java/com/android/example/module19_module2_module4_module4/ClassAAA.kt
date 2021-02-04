package com.android.example.module19_module2_module4_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module5.ClassAAI = com.android.example.module06_module353_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module353_module5.ClassAAI = com.android.example.module06_module353_module5.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAI = com.android.example.module06_module353_module1.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module353_module1.ClassAAF = com.android.example.module06_module353_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module353_module5.ClassAAA
	) {
		param0.method1(com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener(), com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener(), com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener())

		for (iAb in 0..4) {
			for (iAc in 0..5) {
				val local_var_4_0: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
				local_var_4_0.method3(com.android.example.module06_module353_module2.ClassAAB(), rx.observers.TestSubscriber())

			}
		}
		val local_var_2_1: com.android.example.module06_module353_module2.ClassAAI = com.android.example.module06_module353_module2.ClassAAI()
		local_var_2_1.method0("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module1.ClassAAE,
		param1: com.android.example.module06_module353_module5.ClassAAF,
		param2: com.android.example.module06_module353_module1.ClassAAA
	) {
		param0.method0(com.android.example.module06_module353_module2.ClassAAE())

		param0.method1(com.android.example.module06_module353_module2.ClassAAD())

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAE,
		param1: com.android.example.module06_module353_module5.ClassAAD,
		param2: com.android.example.module06_module353_module5.ClassAAH
	) {
		val local_var_2_3: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
		local_var_2_3.method2("SomeString")

		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_4.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAE())

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAF = com.android.example.module06_module353_module3.ClassAAF()
		local_var_2_5.method1(rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), rx.observers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
