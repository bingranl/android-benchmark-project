package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"

	fun method0(
		param0: String,
		param1: String
	) {
	}

	fun method1(
		param0: String,
		param1: String
	) {
	}

	fun method2(
		param0: String,
		param1: String,
		param2: String
	) {
		for (iAb in 0..2) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
				local_var_4_0.addMetadataString("SomeString", "SomeString", "SomeString")

			}
			val local_var_3_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
			local_var_3_0.addBreadcrumb("SomeString", "SomeString", "SomeString", kotlin.Any())

			val local_var_3_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
			local_var_3_1.updateContext("SomeString")

		}
	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addMetadataDouble("SomeString", "SomeString", 0.84708416)

		local_var_2_3.pausedSession()

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addMetadataDouble("SomeString", "SomeString", 0.38951552)

		local_var_2_3.updateInForeground(true, "SomeString")

	}
}
