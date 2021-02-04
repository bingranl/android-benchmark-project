package com.android.example.module22_module01_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module22_module01_module07_module1.ClassAAI = com.android.example.module22_module01_module07_module1.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module22_module01_module07_module1.ClassAAG = com.android.example.module22_module01_module07_module1.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module22_module01_module07_module1.ClassAAJ = com.android.example.module22_module01_module07_module1.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module22_module01_module07_module3.ClassAAG = com.android.example.module22_module01_module07_module3.ClassAAG()
	private 	val instance_var_1_4: com.android.example.module22_module01_module07_module3.ClassAAG = com.android.example.module22_module01_module07_module3.ClassAAG()

	fun method0(
		param0: com.android.example.module22_module01_module07_module1.ClassAAD,
		param1: com.android.example.module22_module01_module07_module3.ClassAAH,
		param2: com.android.example.module22_module01_module07_module3.ClassAAI,
		param3: com.android.example.module22_module01_module07_module3.ClassAAF
	) {
		param0.method0(com.android.example.module22_module01_module07_module3.ClassAAC(), com.android.example.module22_module01_module07_module3.ClassAAA())

		param0.method2(com.android.example.module22_module01_module07_module3.ClassAAE(), com.android.example.module22_module01_module07_module3.ClassAAF(), com.android.example.module22_module01_module07_module3.ClassAAJ())

		for (iAb in 0..3) {
			param0.method1(com.android.example.module22_module01_module07_module3.ClassAAA(), com.android.example.module22_module01_module07_module3.ClassAAA(), com.android.example.module22_module01_module07_module3.ClassAAI())

			val local_var_3_0: io.reactivex.internal.schedulers.IoScheduler = io.reactivex.internal.schedulers.IoScheduler()
			local_var_3_0.size()

		}
		param0.method0(com.android.example.module22_module01_module07_module3.ClassAAC(), com.android.example.module22_module01_module07_module3.ClassAAA())

	}

	fun method1(
		param0: com.android.example.module22_module01_module07_module3.ClassAAG,
		param1: com.android.example.module22_module01_module07_module3.ClassAAA
	) {
		param0.method0("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module22_module01_module07_module3.ClassAAI,
		param1: com.android.example.module22_module01_module07_module3.ClassAAE,
		param2: com.android.example.module22_module01_module07_module1.ClassAAH
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}

	fun method3(
		param0: com.android.example.module22_module01_module07_module1.ClassAAG
	) {
		param0.method1(com.android.example.module22_module01_module07_module3.ClassAAA(), com.android.example.module22_module01_module07_module3.ClassAAF(), com.android.example.module22_module01_module07_module3.ClassAAG())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method4(
		param0: com.android.example.module22_module01_module07_module3.ClassAAI,
		param1: com.android.example.module22_module01_module07_module1.ClassAAA,
		param2: com.android.example.module22_module01_module07_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertNotSubscribed()

	}
}
