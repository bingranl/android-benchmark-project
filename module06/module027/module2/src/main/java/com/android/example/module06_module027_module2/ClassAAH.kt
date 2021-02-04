package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module027_module1.ClassAAG = com.android.example.module06_module027_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module027_module1.ClassAAC = com.android.example.module06_module027_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module027_module1.ClassAAE,
		param1: com.android.example.module06_module027_module1.ClassAAE,
		param2: com.android.example.module06_module027_module3.ClassAAB,
		param3: com.android.example.module06_module027_module1.ClassAAC
	) {
	}

	fun method1(
		param0: com.android.example.module06_module027_module3.ClassAAJ,
		param1: com.android.example.module06_module027_module1.ClassAAJ,
		param2: com.android.example.module06_module027_module1.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method2(
		param0: com.android.example.module06_module027_module1.ClassAAH,
		param1: com.android.example.module06_module027_module1.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

	}
}
