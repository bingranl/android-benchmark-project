package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..1) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
					local_var_5_0.clearMetadataTab("SomeString")

					val local_var_5_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
					local_var_5_1.updateInForeground(false, "SomeString")

				}
			}
		}
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.startedSession("SomeString", "SomeString", 43, 43)

		val local_var_2_5: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_5.updateUserId("SomeString")

	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.addMetadataBoolean("SomeString", "SomeString", true)

		val local_var_2_5: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_5.startedSession("SomeString", "SomeString", 36, 30)

		local_var_2_4.addMetadataDouble("SomeString", "SomeString", 0.2918238)

		val local_var_2_6: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_6.addMetadataDouble("SomeString", "SomeString", 0.34955972)

	}

	fun method2(
		param0: String
	) {
		val local_var_2_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_1.updateInForeground(true, "SomeString")

		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.updateUserId("SomeString")

	}
}
