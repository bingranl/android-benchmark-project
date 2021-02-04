package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"
	private 	val instance_var_1_4: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addMetadataString("SomeString", "SomeString", "SomeString")

		for (iAb in 0..2) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
				local_var_4_0.addMetadataDouble("SomeString", "SomeString", 0.7974693)

			}
			val local_var_3_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
			local_var_3_0.updateUserName("SomeString")

			val local_var_3_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
			local_var_3_1.updateOrientation("SomeString")

			local_var_3_0.deliverReportAtPath("SomeString")

		}
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.updateUserName("SomeString")

	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_1.deliverReportAtPath("SomeString")

		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.updateInForeground(true, "SomeString")

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.updateUserEmail("SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.install("SomeString", false, 24, true, "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: String
	) {
		val local_var_2_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_1.updateContext("SomeString")

		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.updateOrientation("SomeString")

	}

	fun method3(
		param0: String
	) {
	}
}
