package com.android.example.module22_module01_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module22_module01_module07_module1.ClassAAE = com.android.example.module22_module01_module07_module1.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module22_module01_module07_module3.ClassAAF = com.android.example.module22_module01_module07_module3.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module22_module01_module07_module3.ClassAAA = com.android.example.module22_module01_module07_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module22_module01_module07_module1.ClassAAC,
		param1: com.android.example.module22_module01_module07_module3.ClassAAA
	) {
		for (iAb in 0..6) {
			val local_var_3_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
			local_var_3_0.triggerActions()

		}
	}

	fun method1(
		param0: com.android.example.module22_module01_module07_module3.ClassAAI
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module22_module01_module07_module1.ClassAAI,
		param1: com.android.example.module22_module01_module07_module3.ClassAAC
	) {
		param0.method4(com.android.example.module22_module01_module07_module3.ClassAAI(), com.android.example.module22_module01_module07_module3.ClassAAG(), com.android.example.module22_module01_module07_module3.ClassAAA(), com.android.example.module22_module01_module07_module3.ClassAAF())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method3(
		param0: com.android.example.module22_module01_module07_module3.ClassAAJ,
		param1: com.android.example.module22_module01_module07_module1.ClassAAH
	) {
		val local_var_2_2: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		param0.method1("SomeString", "SomeString")

	}
}
