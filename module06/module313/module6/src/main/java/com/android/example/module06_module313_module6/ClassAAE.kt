package com.android.example.module06_module313_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module313_module5.ClassAAJ = com.android.example.module06_module313_module5.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module06_module313_module5.ClassAAJ = com.android.example.module06_module313_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module313_module5.ClassAAH = com.android.example.module06_module313_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module313_module5.ClassAAD = com.android.example.module06_module313_module5.ClassAAD()
	private 	val instance_var_1_4: com.android.example.module06_module313_module5.ClassAAD = com.android.example.module06_module313_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module313_module5.ClassAAG,
		param1: com.android.example.module06_module313_module5.ClassAAE
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: org.junit.internal.runners.statements.Fail = org.junit.internal.runners.statements.Fail(kotlin.Throwable())
			local_var_3_0.evaluate()

		} else {
			val local_var_3_0: junit.framework.TestResult = junit.framework.TestResult()
			local_var_3_0.runCount()

		}
		val local_var_2_2: com.google.common.truth.ExpectFailure = com.google.common.truth.ExpectFailure()
		local_var_2_2.whenTesting()

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module313_module5.ClassAAD,
		param1: com.android.example.module06_module313_module5.ClassAAF,
		param2: com.android.example.module06_module313_module5.ClassAAJ
	) {
		val local_var_2_3: junit.framework.TestResult = junit.framework.TestResult()
		local_var_2_3.runCount()

	}

	fun method2(
		param0: com.android.example.module06_module313_module5.ClassAAJ
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

		val local_var_2_1: junit.framework.TestResult = junit.framework.TestResult()
		local_var_2_1.shouldStop()

		val local_var_2_2: org.junit.internal.runners.statements.Fail = org.junit.internal.runners.statements.Fail(kotlin.Throwable())
		local_var_2_2.evaluate()

	}

	fun method3(
		param0: com.android.example.module06_module313_module5.ClassAAB,
		param1: com.android.example.module06_module313_module5.ClassAAH,
		param2: com.android.example.module06_module313_module5.ClassAAD
	) {
		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
