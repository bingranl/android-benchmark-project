package com.android.example.module06_module158

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: org.robolectric.ApkLoader = org.robolectric.ApkLoader()
	private 	val instance_var_1_1: com.google.common.truth.ExpectFailure = com.google.common.truth.ExpectFailure()

	fun method0(
		param0: junit.framework.TestResult,
		param1: org.junit.runner.notification.RunListener,
		param2: com.google.common.truth.ExpectFailure,
		param3: org.robolectric.DefaultTestLifecycle
	) {
		listOf("1", "2", "3").forEach {
			param0.shouldStop()

			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module15_module56_module1.ClassAAE = com.android.example.module15_module56_module1.ClassAAE()
				local_var_4_0.method1(com.android.example.module15_module07_module1.ClassAAH(), com.android.example.module15_module21_module1.ClassAAF())

			}
		}
	}

	fun method1(
		param0: junit.extensions.ActiveTestSuite,
		param1: com.google.common.truth.ExpectFailure,
		param2: org.mockito.internal.configuration.InjectingAnnotationEngine,
		param3: org.robolectric.ApkLoader
	) {
	}

	fun method2(
		param0: org.junit.runner.JUnitCore,
		param1: junit.textui.TestRunner,
		param2: org.mockito.configuration.DefaultMockitoConfiguration
	) {
		val local_var_2_3: com.android.example.module15_module20_module1.ClassAAA = com.android.example.module15_module20_module1.ClassAAA()
		local_var_2_3.method1(com.android.example.module15_module21_module1.ClassAAC())

		param0.addListener(org.junit.runner.notification.RunListener())

		val local_var_2_4: com.android.example.module15_module22_module1.ClassAAF = com.android.example.module15_module22_module1.ClassAAF()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString")

	}
}
