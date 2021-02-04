package com.android.example.module06_module035_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.deliverReportAtPath("SomeString")

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.install("SomeString", true, 31, true, "SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.addMetadataDouble("SomeString", "SomeString", 0.6997762)

		local_var_2_2.addHandledEvent()

	}

	fun method1(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.removeMetadata("SomeString", "SomeString")

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.deliverReportAtPath("SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.removeMetadata("SomeString", "SomeString")

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.update(java.util.Observable(), kotlin.Any())

		local_var_2_3.updateUserId("SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.addBreadcrumb("SomeString", "SomeString", "SomeString", kotlin.Any())

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addMetadataBoolean("SomeString", "SomeString", true)

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.clearMetadataTab("SomeString")

		local_var_2_4.addMetadataString("SomeString", "SomeString", "SomeString")

	}
}
