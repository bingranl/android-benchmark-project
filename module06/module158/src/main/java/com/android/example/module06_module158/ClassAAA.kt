package com.android.example.module06_module158

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: org.junit.rules.TemporaryFolder = org.junit.rules.TemporaryFolder()
	private 	val instance_var_1_1: junit.extensions.ActiveTestSuite = junit.extensions.ActiveTestSuite()
	private 	val instance_var_1_2: junit.textui.TestRunner = junit.textui.TestRunner()

	fun method0(
		param0: com.google.common.truth.ExpectFailure
	) {
		for (iAb in 0..3) {
			val local_var_3_0: com.android.example.module15_module52_module1.ClassAAI = com.android.example.module15_module52_module1.ClassAAI()
			local_var_3_0.method4(com.android.example.module15_module20_module1.ClassAAI(), com.android.example.module15_module20_module1.ClassAAF())

			val local_var_3_1: com.android.example.module06_module279_module1.ClassAAC = com.android.example.module06_module279_module1.ClassAAC()
			local_var_3_1.method0(com.google.gson.JsonStreamParser("SomeString"))

		}
		val local_var_2_1: com.android.example.module15_module15_module1.ClassAAG = com.android.example.module15_module15_module1.ClassAAG()
		local_var_2_1.method3(com.android.example.module15_module02_module1.ClassAAC(), com.android.example.module15_module64_module1.ClassAAC())

		val local_var_2_2: com.android.example.module06_module090_module3.ClassAAF = com.android.example.module06_module090_module3.ClassAAF()
		local_var_2_2.method0("SomeString", "SomeString", "SomeString")

		param0.getFailure()

	}

	fun method1(
		param0: junit.textui.TestRunner
	) {
	}

	fun method2(
		param0: org.mockito.internal.verification.AtLeast
	) {
		param0.description("SomeString")

	}

	fun method3(
		param0: junit.textui.TestRunner,
		param1: org.robolectric.plugins.LooperModeConfigurer,
		param2: com.google.common.truth.ExpectFailure
	) {
		param0.testStarted("SomeString")

		param0.testStarted("SomeString")

	}

	fun method4(
		param0: com.google.common.truth.ExpectFailure
	) {
	}
}
