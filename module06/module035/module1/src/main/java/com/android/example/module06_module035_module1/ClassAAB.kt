package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
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
		for (iAb in 0..4) {
			val local_var_3_0: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
			local_var_3_0.update(java.util.Observable(), kotlin.Any())

			local_var_3_0.updateUserName("SomeString")

			local_var_3_0.updateOrientation("SomeString")

		}
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.updateInForeground(false, "SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.updateUserId("SomeString")

	}

	fun method1(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.startedSession("SomeString", "SomeString", 66, 67)

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.updateUserId("SomeString")

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
	}
}
