package com.android.example.module06_module158

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: org.robolectric.ApkLoader = org.robolectric.ApkLoader()
	private 	val instance_var_1_1: org.mockito.internal.session.DefaultMockitoSessionBuilder = org.mockito.internal.session.DefaultMockitoSessionBuilder()
	private 	val instance_var_1_2: org.mockito.internal.junit.VerificationCollectorImpl = org.mockito.internal.junit.VerificationCollectorImpl()
	private 	val instance_var_1_3: org.robolectric.ApkLoader = org.robolectric.ApkLoader()
	private 	val instance_var_1_4: org.junit.runner.notification.RunNotifier = org.junit.runner.notification.RunNotifier()

	fun method0(
		param0: com.google.common.truth.ExpectFailure,
		param1: org.mockito.configuration.DefaultMockitoConfiguration
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module321_module11.ClassAAG = com.android.example.module06_module321_module11.ClassAAG()
			local_var_3_0.method1(com.android.example.module06_module321_module10.ClassAAD(), com.android.example.module06_module321_module10.ClassAAJ(), com.android.example.module06_module321_module10.ClassAAB())

			val local_var_3_1: com.android.example.module15_module05_module2.ClassAAJ = com.android.example.module15_module05_module2.ClassAAJ()
			local_var_3_1.method4(com.android.example.module15_module16_module1.ClassAAB(), com.android.example.module15_module20_module1.ClassAAA())

		}
		param0.whenTesting()

		val local_var_2_2: com.android.example.module06_module155.ClassAAC = com.android.example.module06_module155.ClassAAC()
		local_var_2_2.method0(com.android.example.module06_module318_module5.ClassAAB())

		param0.getFailure()

	}

	fun method1(
		param0: org.robolectric.plugins.LooperModeConfigurer
	) {
		val local_var_2_1: com.android.example.module06_module339_module1.ClassAAE = com.android.example.module06_module339_module1.ClassAAE()
		local_var_2_1.method1(com.android.example.module06_module109_module1.ClassAAB())

	}

	fun method2(
		param0: org.robolectric.android.internal.NoOpThreadChecker,
		param1: org.junit.runner.JUnitCore,
		param2: junit.framework.TestResult,
		param3: org.junit.internal.runners.statements.Fail
	) {
		param0.checkNotMainThread()

		param0.checkMainThread()

	}

	fun method3(
		param0: org.robolectric.android.internal.NoOpThreadChecker,
		param1: com.google.common.truth.ExpectFailure,
		param2: com.google.common.truth.ExpectFailure,
		param3: junit.textui.TestRunner
	) {
		val local_var_2_4: com.android.example.module15_module21_module1.ClassAAJ = com.android.example.module15_module21_module1.ClassAAJ()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.checkMainThread()

		val local_var_2_5: com.android.example.module06_module161_module3.ClassAAG = com.android.example.module06_module161_module3.ClassAAG()
		local_var_2_5.method4(com.android.example.module06_module109_module1.ClassAAC(), com.android.example.module06_module109_module1.ClassAAG(), com.android.example.module15_module37_module1.ClassAAD())

	}

	fun method4(
		param0: org.junit.runner.JUnitCore,
		param1: org.junit.internal.runners.statements.Fail,
		param2: org.robolectric.ApkLoader,
		param3: junit.extensions.ActiveTestSuite
	) {
	}
}
