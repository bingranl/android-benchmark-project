package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String
	) {
		for (iAb in 0..3) {
		}
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addHandledEvent()

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.update(java.util.Observable(), kotlin.Any())

		val local_var_2_5: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_5.clearMetadataTab("SomeString")

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.removeMetadata("SomeString", "SomeString")

		local_var_2_4.updateUserId("SomeString")

	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.addBreadcrumb("SomeString", "SomeString", "SomeString", kotlin.Any())

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.updateUserId("SomeString")

		local_var_2_2.updateOrientation("SomeString")

		local_var_2_2.pausedSession()

	}
}
